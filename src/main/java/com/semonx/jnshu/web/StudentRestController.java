package com.semonx.jnshu.web;

import com.semonx.jnshu.domain.Student;
import com.semonx.jnshu.service.StudentService;
import com.semonx.jnshu.web.exception.InvalidParameterException;
import com.semonx.jnshu.web.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Semon on 2017/5/12.
 */
@RestController
@RequestMapping(value = "/student")
public class StudentRestController {
    @Autowired
    private StudentService service;

    @RequestMapping(value = "", method = GET)
    public List<Student> getAllStudent() {
        List<Student> students = service.findAllStudent();
        if (students == null) {
            students = new ArrayList<>();
        }
        return students;
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Student getStudent(@PathVariable long id) {
        Student student = service.findStudentById(id);
        if (student == null) {
            throw new StudentNotFoundException(id);
        }
        return student;
    }

    @RequestMapping(value = "/{id}", method = PUT, consumes = "application/json")
    public Student updateStudent(@PathVariable long id, @RequestBody Student student) {
        Student s = service.findStudentById(id);
        if (s == null) {
            throw new StudentNotFoundException(id);
        }
        student.setId(id);
        service.updateStudent(student);
        return student;
    }

    @RequestMapping(value = "", method = POST, consumes = "application/json")
    public ResponseEntity<Student> createStudent(@RequestBody Student student, UriComponentsBuilder ucb) {
        try {
            service.addStudent(student);
        } catch (DataIntegrityViolationException e) {
            throw new InvalidParameterException();
        }

        HttpHeaders headers = new HttpHeaders();
        URI locationUri = ucb.path("/student/").path(String.valueOf(student.getId())).build().toUri();
        headers.setLocation(locationUri);

        ResponseEntity<Student> responseEntity = new ResponseEntity<Student>(student, headers, HttpStatus.CREATED);
        return responseEntity;
    }

    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable long id) {
        Student s = service.findStudentById(id);
        if (s == null) {
            throw new StudentNotFoundException(id);
        }
        service.deleteStudent(id);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error studentNotFound(StudentNotFoundException exception) {
        long id = exception.getId();
        return new Error(4, "未找到编号 [" + id + "] 的学员。");
    }

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error invalidParameter(InvalidParameterException exception) {
        return new Error(0, "提交的参数有误。");
    }
}
