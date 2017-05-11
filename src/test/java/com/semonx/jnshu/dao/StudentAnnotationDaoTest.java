package com.semonx.jnshu.dao;

import com.semonx.jnshu.domain.Student;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Semon on 2017/4/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class StudentAnnotationDaoTest {

    @Autowired
    private StudentAnnotationDao dao;
    private Student studentId5;
    private Student crudTestStudent;

    private static Logger logger = Logger.getLogger(StudentAnnotationDaoTest.class);

    @Before
    public void setUp() {
        initStudentId5();
        initCrudTestStudent();
    }

    // 测试获取所有学生
    @Test
    public void testFindAllStudent() {
        // 调用接口方法
        List<Student> studentList = dao.findAllStudent();

        assertNotNull(studentList);
        assertTrue(studentList.size() > 0);
//        assertEquals(10, studentList.size());
    }

    // 测试通过ID查询一个学生
    @Test
    public void testFindStudentById() {
        Student student = dao.findStudentById(studentId5.getId());

        assertNotNull(student);
        assertStudentEquals(studentId5, student);
    }

    // 测试通过qq查询一个学生
    @Test
    public void testFindStudentByQq() {
        Student student = dao.findStudentByQq(studentId5.getQq());

        assertNotNull(student);
        assertStudentEquals(studentId5, student);
    }

    // 测试通过online_id查询一个学生
    @Test
    public void testFindStudentByOnlineId() {
        Student student = dao.findStudentByOnlineId(studentId5.getOnlineId());

        assertNotNull(student);
        assertStudentEquals(studentId5, student);
    }

    // 测试CRUD
    @Test
    public void testStudentCRUD() {
        final String updatedName = "小九九";
        long beforeAddId = -1;
        crudTestStudent.setId(beforeAddId);
        // 先插入一条数据
        dao.addStudent(crudTestStudent);
        assertNotEquals(beforeAddId, crudTestStudent.getId());
        // 更新刚才插入的数据
        crudTestStudent.setName(updatedName);
        dao.updateStudent(crudTestStudent);
        // 读出刚才更改的数据，通过断言进行比较
        Student updatedStudent = dao.findStudentById(crudTestStudent.getId());
        // 删除最开始插入的数据
        dao.deleteStudent(crudTestStudent.getId());
        // 查询，发现已经查询不到被删除的数据
        Student deletedStudent = dao.findStudentById(crudTestStudent.getId());

        // 确认插入，更新，查询功能正常
        assertStudentEquals(crudTestStudent, updatedStudent);
        // 确认删除，查询功能正常
        assertNull(deletedStudent);
    }

    // 测试CUD的返回值
    @Test
    public void testStudentCRUDReturnValue() {

        boolean addResult = dao.addStudent(crudTestStudent);
        boolean updateResult = dao.updateStudent(crudTestStudent);
        boolean deleteResult = dao.deleteStudent(crudTestStudent.getId());

        // 成功的情况下
        assertTrue(addResult);
        assertTrue(updateResult);
        assertTrue(deleteResult);

        // 删除失败
        deleteResult = dao.deleteStudent(crudTestStudent.getId());
        assertFalse(deleteResult);
    }

    @Test
    public void testLog() {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }

    private void initStudentId5() {
        studentId5 = new Student();

        studentId5.setId(5);
        studentId5.setName("陈小六");
        studentId5.setQq("15044774771");
        studentId5.setProfession("JAVA工程师");
        studentId5.setJoinDate(1491753600000L);
        studentId5.setSchool("内蒙古电子信息职业技术学院");
        studentId5.setOnlineId("1488");
        studentId5.setDailyUrl("http://www.jnshu.com/daily/18132?uid=10224");
        studentId5.setDeclaration("如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！");
        studentId5.setIntroducer("");
        studentId5.setReferee("");
        studentId5.setCounselor("");
        studentId5.setDescription("从知乎暗灭了解 到的修真院\n" +
                "\n" +
                "来的目的：打好编程基础，锻炼编程效率，思维。");
        studentId5.setCity("北京");
        studentId5.setReview("待审核");
    }

    private void initCrudTestStudent() {
        crudTestStudent = new Student();
        crudTestStudent.setName("朱重八");
        crudTestStudent.setQq("12345678");
        crudTestStudent.setProfession("JAVA工程师");
        crudTestStudent.setJoinDate(1491753600000L);
        crudTestStudent.setSchool("清华大学");
        crudTestStudent.setOnlineId("1000");
        crudTestStudent.setDailyUrl("http://www.jnshu.com/daily/18132?uid=10224");
        crudTestStudent.setDeclaration("如果我不能在IT 特训营拼尽全力，为自己以后的修行路上打好基础，就让我永远追不到喜欢的人，给不了她想要的生活！");
        crudTestStudent.setIntroducer("");
        crudTestStudent.setReferee("");
        crudTestStudent.setCounselor("");
        crudTestStudent.setDescription("从知乎暗灭了解 到的修真院\n" +
                "\n" +
                "来的目的：打好编程基础，锻炼编程效率，思维。");
        crudTestStudent.setCity("北京");
        crudTestStudent.setReview("待审核");
    }

    // 断言两个Student是否完全相同
    private void assertStudentEquals(Student s1, Student s2) {
        assertEquals(s1.getId(), s2.getId());
        assertEquals(s1.getName(), s2.getName());
        assertEquals(s1.getQq(), s2.getQq());
        assertEquals(s1.getProfession(), s2.getProfession());
        assertEquals(s1.getJoinDate(), s2.getJoinDate());
        assertEquals(s1.getSchool(), s2.getSchool());
        assertEquals(s1.getOnlineId(), s2.getOnlineId());
        assertEquals(s1.getDailyUrl(), s2.getDailyUrl());
        assertEquals(s1.getDeclaration(), s2.getDeclaration());
        assertEquals(s1.getIntroducer(), s2.getIntroducer());
        assertEquals(s1.getReferee(), s2.getReferee());
        assertEquals(s1.getCounselor(), s2.getCounselor());
        assertEquals(s1.getDescription(), s2.getDescription());
        assertEquals(s1.getCity(), s2.getCity());
        assertEquals(s1.getReview(), s2.getReview());
    }
}
