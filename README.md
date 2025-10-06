### Todo App : 
A simple app with Thymeleaf views , it's a basic CRUD project using a simple Task JPA entity (ORM) and a service layer . 

### Features : 
- Create tasks (name, description, done) .
- List tasks .
- toggle task .
- Delete tasks .

### Project Structure :

todo/
├─ .mvn/
├─ .vscode/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ com/
│  │  │     └─ example/
│  │  │        └─ todo/
│  │  │           ├─ Controllers/
│  │  │           │  └─ TaskController.java
│  │  │           └─ Model/
│  │  │              ├─ Task.java
│  │  │              ├─ TaskRepository.java
│  │  │              ├─ TaskService.java
│  │  │              └─ TodoApplication.java
│  │  └─ resources/
│  │     ├─ templates/
│  │     │  ├─ form.html
│  │     │  └─ list.html
│  │     └─ application.properties
│  └─ test/
│     └─ java/
│        └─ com/
│           └─ example/
│              └─ todo/
│                 └─ TodoApplicationTests.java
├─ target/
├─ .gitattributes
├─ .gitignore
├─ HELP.md
├─ mvnw
├─ mvnw.cmd
└─ pom.xml


### Project Dependancy : 
- JDK 17+
- Maven or Gradle .

