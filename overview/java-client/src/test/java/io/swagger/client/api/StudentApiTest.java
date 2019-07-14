/*
 * 演示API
 * 演示API，假设对一些学生的CRUD
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Student;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StudentApi
 */
@Ignore
public class StudentApiTest {

    private final StudentApi api = new StudentApi();

    
    /**
     * 学生删除
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStudentTest() throws ApiException {
        Integer id = null;
        api.deleteStudent(id);

        // TODO: test validations
    }
    
    /**
     * 学生详情
     *
     * 根据学生ID查询学生
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findStudentTest() throws ApiException {
        Integer id = 1;
        Student response = api.findStudent(id);

        // TODO: test validations
    }
    
    /**
     * 获取学生列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStudentsTest() throws ApiException {
        Integer limit = null;
        List<Student> response = api.listStudents(limit);

        // TODO: test validations
    }
    
    /**
     * 新增学生
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveStudentTest() throws ApiException {
        String name = null;
        Integer age = null;
        String gender = null;
        Integer response = api.saveStudent(name, age, gender);

        // TODO: test validations
    }
    
    /**
     * 更新学生
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStudentTest() throws ApiException {
        Integer id = null;
        String name = null;
        Integer age = null;
        String gender = null;
        api.updateStudent(id, name, age, gender);

        // TODO: test validations
    }
    
}
