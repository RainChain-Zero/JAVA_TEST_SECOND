package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.PO.account;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author 慕北_Innocent
 * @version 1.0
 * @date 2021/11/10 12:19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, account> implements UserService{
}
