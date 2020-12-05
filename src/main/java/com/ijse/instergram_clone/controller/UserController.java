package com.ijse.instergram_clone.controller;

import com.ijse.instergram_clone.bean.ResponceBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @PostMapping("/create")
    public ResponseEntity<ResponceBean> createUser(){
        ResponceBean responseBean = new ResponceBean();
        //create user by calling service
        return new ResponseEntity<>(responseBean, HttpStatus.OK);
    }
    @PostMapping("/signIn")
    public ResponseEntity<ResponceBean> signIn(){
        ResponceBean responseBean = new ResponceBean();
        //login user
        return new ResponseEntity<>(responseBean, HttpStatus.OK);
    }
}
