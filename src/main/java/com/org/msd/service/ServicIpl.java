package com.org.msd.service;

import com.org.msd.model.Student;
import com.org.msd.repository.StRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicIpl implements Servic{
    @Autowired
    StRepo stRepo;
    @Override
    public void createStudentRecords(Student student)
    {stRepo.save(student);}

    @Override
    public Student getById(Integer id) {
        Student sss= stRepo.getById(id);
        return sss;
    }

    @Override
    public String deleteById(Integer id) {
        stRepo.deleteById(id);
        return "success";
    }

    @Override
    public void updateStudent(Student student) {
        stRepo.save(student);

    }

    @Override
    public List<Student> getAll() {
        List<Student> aa=stRepo.findAll();
        return aa;
    }
}
