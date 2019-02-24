package com.zoser.controller;

import com.zoser.dao.TestDao;
import com.zoser.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("test")
    public List<Test> getAll(){

        return testDao.findAll();
    }

    @GetMapping("page")
    public Object getAll(int pageId, int pageSize){

        Sort sort = new Sort(Sort.Direction.DESC, "aaa");

        Pageable pageable = PageRequest.of(pageId,pageSize,sort);
        Page<Test> ddd= testDao.findAll(pageable);
        return  ddd;
    }
}
