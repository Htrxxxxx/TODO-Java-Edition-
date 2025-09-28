package com.example.todo.Controllers;

import com.example.todo.Model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.todo.Model.TaskService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private TaskService service ;
    
    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public String list (Model model) {
        model.addAttribute("tasks", service.findAll());
        return "list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("task", new Task());
        return "form";
    }

    @PostMapping
    public String save(@ModelAttribute Task task, RedirectAttributes ra) {
        service.addTask(task);
        ra.addFlashAttribute("success", "Task saved");
        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes ra) {
        service.deleteTask(id);
        ra.addFlashAttribute("success", "Task deleted");
        return "redirect:/tasks";
    }

    @GetMapping("/toggle/{id}")
    public String toggle(@PathVariable Long id, RedirectAttributes ra) {
        service.findById(id).ifPresent(t -> {
        if(t.getIsDone() == true) t.setIsDone(false);
        else t.setIsDone(true);
        service.addTask(t);
        });
        return "redirect:/tasks";
    }
    
}
