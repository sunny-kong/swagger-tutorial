package com.example.demo.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Optional;

@Controller
public class StudentController implements StudentApi {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private HttpServletRequest request;

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.of(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.of(request);
    }
}