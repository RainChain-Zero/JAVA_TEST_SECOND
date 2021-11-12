package com.example.demo.controller;

import com.example.demo.PO.account;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired

    UserService userService;

    @PostMapping("/user/post")
    public void uploadUsername(String name)
    {
        account acc=new account();
        acc.setUsername(name);
        userService.save(acc);
    }

    @GetMapping("/user/get")
    public String getUsername(int id)
    {
        return userService.getById(id).getUsername();
    }

    @DeleteMapping("/user/delete")
    public void deleteUsername(int id)
    {
        userService.removeById(id);
    }

    @PutMapping("user/put")
    public void updateUsername(int id,String name)
    {
        account acc=new account();
        acc.setId(id);
        acc.setUsername(name);
        userService.updateById(acc);
    }


}
