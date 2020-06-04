package com.tyq.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyq.Entity.User;
import com.tyq.Mapper.UserMapper;
import com.tyq.service.UserSevice;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserServiceI extends ServiceImpl<UserMapper, User> implements UserSevice {
}
