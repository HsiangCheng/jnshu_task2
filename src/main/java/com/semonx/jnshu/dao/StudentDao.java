package com.semonx.jnshu.dao;

import com.semonx.jnshu.domain.Student;

import java.util.List;

/**
 * Created by Semon on 2017/4/24.
 */
public interface StudentDao {
    // 查询所有的学生
    public List<Student> findAllStudent();

    // 通过ID查询一个学生
    public Student findStudentById(long id);

    // 通过qq号查询一个学生
    public Student findStudentByQq(String qq);

    // 通过线上学习id查询一个学生
    public Student findStudentByOnlineId(String onlineId);

    // 插入一个学生，请保证各字段不为null（id除外）
    // 此方法会无视id，使用数据库的自增字段
    // 返回值：返回记录的主键ID
    public boolean addStudent(Student student);

    // 修改一个学生的信息，通过student中的id定位，更新新为student中的数据
    // 注意：应该通过调用find型的API得到Student对象后，在Student对象上修改后传入本方法，
    // 以保证参数student各个字段数据的完备性。
    // 即，这个API应在调用findStudent*()后使用。
    // 返回值：返回更新条数
    public boolean updateStudent(Student student);

    // 通过id删除一个学生
    public boolean deleteStudent(long id);
}
