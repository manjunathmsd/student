package com.org.msd.service;

import com.org.msd.model.Student;
import com.org.msd.repository.StRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ServicIplTest {
@InjectMocks
private ServicIpl servicIpl;
@Mock
private StRepo stRepo;
    @Test
    void createStudentRecords() {
        Student student=new Student();
        student.setId(6);
        student.setName("msd");
        student.setAddress("blr");
        student.setMarks(66.8);
        Mockito.when(stRepo.save(student)).thenReturn(student);
        servicIpl.createStudentRecords(student);
    }

    @Test
    void getById() {

    }

    @Test
    void deleteById() {
        Integer id=5;
        String value="success";
    }

    @Test
    void updateStudent() {
        Student student=new Student();
        student.setId(2);
        student.setName("dte");
        student.setAddress("sdb");
        student.setMarks(50.5);
        Mockito.when(stRepo.save(student)).thenReturn(student);
        servicIpl.createStudentRecords(student);
    }

    @Test
    void getAll() {
        List<Student> list=new ArrayList<>();
        Student student=new Student();
        student.setId(6);
        student.setName("asd");
        student.setAddress("sdb");
        student.setMarks(45.5);
        list.add(student);

        Student student1=new Student();
        student1.setId(4);
        student1.setName("hyd");
        student1.setAddress("sdb");
        student1.setMarks(55.5);
        list.add(student1);
        Mockito.when(stRepo.findAll()).thenReturn(list);
        List<Student> list2=servicIpl.getAll();
        Assertions.assertEquals(list,list2);

    }
}