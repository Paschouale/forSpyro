package gr.ote.lesson.services.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentGetter {
    //mimic database
    private final Map<Long, String> students = new HashMap<>();

    //constructor
    public StudentGetter(){
        students.put(1L, "Alice");
        students.put(2L, "Bob");
        students.put(3L, "Charlie");
        students.put(4L, "David");
        students.put(5L, "Jane");
    }

    //Method to get user information by ID
    public String getStudentInfo(Long studentId){
        return students.get(studentId);
    }
}
