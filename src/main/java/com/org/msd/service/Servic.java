package com.org.msd.service;

import com.org.msd.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface Servic {


    public void createStudentRecords( Student student);
    public Student getById( Integer id);
    public String deleteById( Integer id);
    public void updateStudent( Student student);
    public List<Student> getAll();
}
