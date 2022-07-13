package com.example.demo.user.controller;


import com.example.demo.user.domain.User;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService service;

    // 1. 전체 user 가 json 형태로 return 되도록 구현 v1
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> userList() {
        return service.getUserList();
    }

    // 1. 전체 user 가 json 형태로 return 되도록 구현 V2
    @GetMapping("/userV2")
    public List<User> userListV2() {
        return service.getUserList();
    }

    // 2. ID 를 넣어서 user 찾고 찾은 데이터를 json 형태로 return 되도록 구현
    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable int userId) {
        return service.getUser(userId);
    }

    // 3. 특정 ID를 삭제 하고 정상이면 true , 에러 발생시 false를 return 하도록 개발
    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.PUT)
    public Boolean deleteUser(@PathVariable int userId){
        return service.deleteUser(userId);
    }


    // 3-1. 전체 수정시에는 PUT 일부만 수정시에는 PATCH
    @RequestMapping(value = "/deleteUSerV2/{userId}", method = RequestMethod.PATCH)
    public Boolean deleteUserV2(@PathVariable int userId){
        return service.deleteUserV2(userId);
    }


    // 3.1 삭제 처리된 유저들 출력
    @GetMapping("/deleteUserList")
    public List<User> deleteUserList(){
        return service.deleteUserList();
    }

    // 4. 이름을 포함문자열 검색을 사용하여 찾고 json 형태로 return 되도록 구현
    @RequestMapping(value = "/userName/{userName}", method = RequestMethod.GET)
    public List<User> getUserName(@PathVariable String userName) {
        return service.getUserName(userName);
    }


    //5. 유저 추가
//    @RequestMapping(value = "insertUser", method = RequestMethod.POST)
//    public boolean insertUser(){
//        return service.insertUser();
//    }


}
