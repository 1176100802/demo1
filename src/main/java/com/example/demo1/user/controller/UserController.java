package com.example.demo1.user.controller;

import com.example.demo1.user.entity.UserEntity;
import com.example.demo1.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){

        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {

        userService.delById(id);
        return "redirect:/index.html";
    }

    // 保存用户
    @ResponseBody
    @RequestMapping("/save")
    public String save(@RequestBody UserEntity userEntity) {

        System.out.println("用户注册 - " + userEntity.toString());
        userService.save(userEntity);
        return "success";
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){
            return userService.getUserById(id);
    }
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(@RequestBody UserEntity userEntity){
         userService.updateUserById(userEntity);
        return "sucess";
    }
}
