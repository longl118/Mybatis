package com.example.mybatis2.service;


import com.example.mybatis2.entity.Website;
import com.example.mybatis2.mapper.WebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WebsiteService {
    @Autowired(required=false)
    public WebsiteMapper websiteMapper;

    public List<Website> findAllWebsite(){
        return websiteMapper.findAllWebsite();
    }
    public List<Website> findWebsiteById(int id){
        return websiteMapper.findWebsiteById(id);
    }
}

