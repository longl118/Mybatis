package com.example.mybatis2.controller;


import com.example.mybatis2.entity.Website;
import com.example.mybatis2.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/website")
class WebsiteController {
    @Autowired
    private WebsiteService websiteService;

    @RequestMapping("/getAllshow")
    public List<Website> findAll(){
        return websiteService.findAllWebsite();
    }

    @RequestMapping("/getWebsiteId/{id}")
    public List<Website> findWebsiteById(@PathVariable int id){
        return websiteService.findWebsiteById(id);
    }
}

