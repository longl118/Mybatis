package com.example.mybatis2.mapper;


import com.example.mybatis2.entity.Website;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface WebsiteMapper {
    public List<Website> findAllWebsite();
    public List<Website> findWebsiteById(int id);
}
