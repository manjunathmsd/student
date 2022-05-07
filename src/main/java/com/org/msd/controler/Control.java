package com.org.msd.controler;

import com.org.msd.model.Student;
import com.org.msd.service.Servic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Control {
    @Autowired
    Servic servic;
    @PostMapping("/create")
    public void createStudentRecords(@RequestBody Student student)
    {servic.createStudentRecords(student);}
    @GetMapping("/getById/{id}")
    public Student getById(@PathVariable Integer id){
        Student sss=servic.getById(id);
        return sss;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String ddd= servic.deleteById(id);
        return ddd;
    }
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student){
        servic.updateStudent(student);
    }
    @GetMapping("/getAll")
    public List<Student> getAll(){
        List<Student> tt=servic.getAll();
         return tt;
    }
}
