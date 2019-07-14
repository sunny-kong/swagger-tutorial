package io.swagger.api;

import io.swagger.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-14T14:59:12.053Z")

@Controller
public class StudentApiController implements StudentApi {

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteStudent(@ApiParam(value = "学生ID，主键",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> findStudent(@ApiParam(value = "学生ID，主键",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{  \"gender\" : \"male\",  \"name\" : \"张三\",  \"id\" : 10,  \"age\" : 20}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Student>> listStudents(@Size(max=100) @Min(1)@ApiParam(value = "列表显示条数限制，0-100") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {  \"gender\" : \"male\",  \"name\" : \"张三\",  \"id\" : 10,  \"age\" : 20}, {  \"gender\" : \"male\",  \"name\" : \"张三\",  \"id\" : 10,  \"age\" : 20} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Integer> saveStudent(@ApiParam(value = "学生姓名,最长不能超过20位", required=true) @RequestParam(value="name", required=true)  String name,@ApiParam(value = "学生年龄，0-99岁之间", required=true) @RequestParam(value="age", required=true)  Integer age,@ApiParam(value = "性别", required=true, allowableValues="male, female") @RequestParam(value="gender", required=true)  String gender) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Integer>(objectMapper.readValue("0", Integer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Integer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStudent(@ApiParam(value = "学生ID，主键",required=true) @PathVariable("id") Integer id,@ApiParam(value = "学生姓名,最长不能超过20位", required=true) @RequestParam(value="name", required=true)  String name,@ApiParam(value = "学生年龄，0-99岁之间", required=true) @RequestParam(value="age", required=true)  Integer age,@ApiParam(value = "性别", required=true, allowableValues="male, female") @RequestParam(value="gender", required=true)  String gender) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
