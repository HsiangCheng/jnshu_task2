package com.semonx.jnshu.service.impl;

import com.semonx.jnshu.dao.StudentDao;
import com.semonx.jnshu.domain.Student;
import com.semonx.jnshu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Semon on 2017/5/12.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }

    @Override
    public Student findStudentById(long id) {
        return dao.findStudentById(id);
    }

    @Override
    public Student findStudentByQq(String qq) {
        return dao.findStudentByQq(qq);
    }

    @Override
    public Student findStudentByOnlineId(String onlineId) {
        return dao.findStudentByOnlineId(onlineId);
    }

    @Override
    @Transactional
    public boolean addStudent(Student student) {
        return dao.addStudent(student);
    }

    @Override
    @Transactional
    public boolean updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    @Transactional
    public boolean deleteStudent(long id) {
        return dao.deleteStudent(id);
    }
}
