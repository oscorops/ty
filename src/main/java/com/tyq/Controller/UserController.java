package com.tyq.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyq.Entity.User;
import com.tyq.service.imp.UserServiceI;
import com.tyq.util.SmsUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceI userServiceI;

    public UserController(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }

    @RequestMapping("/finAll")
    public IPage<User> findAll(@RequestParam("pageno") Integer pageno) {


        if (pageno == null) {
            pageno = 1;
        }
        System.out.println(pageno);
        IPage<User> page = new Page<>(pageno, 2);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 2);


        return userServiceI.page(page, queryWrapper);


    }


    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }


    @GetMapping("/sms")
    public String aliyunsms(@RequestParam("phone") String phone) {

        HashMap<String,Object> map = new HashMap<>();

        String code = String.valueOf((int)((Math.random()*9+1)*1000));

        map.put("code",code);

        SmsUtil sms=new SmsUtil();

        if(sms.sendMsm(phone,map)){
            return "success";
        }
        else {
            return "false";
        }



    }
}
