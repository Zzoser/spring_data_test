package com.zoser.controller;

import com.zoser.dao.UserDao;
import com.zoser.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("list")
    public List<User> getAll(){

        return userDao.findAll();
    }

    @GetMapping("page")
    public Object getAll(int pageId, int pageSize){

        Sort sort = new Sort(Sort.Direction.DESC, "createTime");

        Pageable pageable = PageRequest.of(pageId,pageSize,sort);
        Page<User> ddd= userDao.findAll(pageable);
        return  ddd;
    }
}
