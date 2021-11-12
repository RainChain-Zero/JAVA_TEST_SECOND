package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.PO.account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author: 風楪fy
 * @create: 2021-08-06 18:17
 **/

@Mapper
@Repository
public interface UserMapper extends BaseMapper<account> {

}
