package com.hmp.springdata.api.repository;

import com.hmp.springdata.api.entity.Guardian;
import com.hmp.springdata.api.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(){
        Student student = Student.builder()
                .emailId("hmpnt@gmaill.com")
                .firstName("hemant")
                .lastName("pant").
             //   guardianName("kishor")
             //   .getGuardianMobile("984855812").
             //   guardianEmail("kpant@gmaill.com")
                build();
        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("Student List = "+studentList);
    }
    @Test
    public void saveStrdentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("kpant@gmnai")
                .mobile("98989")
                .name("kpant")
                .build();
        Student student = Student.builder()
                .firstName("hema")
                .emailId("heman@gmail")
                .lastName("pan")
                .guardian(guardian)
                .build();
studentRepository.save(student);
    }
}