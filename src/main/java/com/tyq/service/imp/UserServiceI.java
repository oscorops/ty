package com.tyq.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyq.Entity.User;
import com.tyq.Mapper.UserMapper;
import com.tyq.service.UserSevice;
import org.springframework.stereotype.Service;

@Service
public class UserServiceI extends ServiceImpl<UserMapper, User> implements UserSevice {
}
