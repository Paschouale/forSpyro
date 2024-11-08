package gr.ote.lesson.services.controllers;

import gr.ote.lesson.services.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resp")
public class ResponseEntityController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        //return new ResponseEntity<>("Hello World!", HttpStatus.OK);
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        User user = new User(id, "Alice", 30);
        return ResponseEntity.ok(user);
    }
    //You can customize the ResponseEntity: return ResponseEntity.status(HttpStatus.OK).body(user);
}
