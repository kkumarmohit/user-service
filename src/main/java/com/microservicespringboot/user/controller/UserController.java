package com.microservicespringboot.user.controller;

import com.microservicespringboot.user.VO.ResponseTemplateVO;
import com.microservicespringboot.user.entity.User;
import com.microservicespringboot.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside save user of user controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of user controller");
        return userService.getUserWithDepartment(userId);
    }
}
