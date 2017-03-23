package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by seungki on 2017-03-23.
 */
@RestController
@RequestMapping("hi")
public class Controller
{
    @Autowired
    StudentRepository userRepository;

    @RequestMapping("/list")
    public List<Student> list(){
        return userRepository.findAll();
    }
}
