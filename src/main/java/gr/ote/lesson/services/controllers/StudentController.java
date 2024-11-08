package gr.ote.lesson.services.controllers;

import gr.ote.lesson.services.services.StudentGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/getters")
@RestController
public class StudentController {

    @GetMapping("/hi")
    public String sayHello() {
        return "Hi there!";
    }

    //The following 2 Methods DO NOT use Dependency Injection

    @GetMapping("/no")
    public String getStudentByID(@RequestParam Long id){
        StudentGetter studentGetter = new StudentGetter();
        String st_name = studentGetter.getStudentInfo(id);
        return st_name;
    }

    @GetMapping("/st/{id}")
    public String getStudentByID2(@PathVariable Long id){
        StudentGetter studentGetter = new StudentGetter();
        String st_name = studentGetter.getStudentInfo(id);
        return "Student name: " + st_name;
    }

    //The following Methods use Dependency Injection

    @Autowired
    private StudentGetter studentGetter;

    @GetMapping("/getbyid")
    public String getStByID(@RequestParam Long id){
        return studentGetter.getStudentInfo(id);
    }

    @GetMapping("/student/{id}")
    public String getStByID2(@PathVariable Long id){
        return studentGetter.getStudentInfo(id);
    }
}
