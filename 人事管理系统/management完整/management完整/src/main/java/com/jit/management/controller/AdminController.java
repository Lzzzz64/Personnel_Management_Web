package com.jit.management.controller;

import com.jit.management.pojo.Admin;
import com.jit.management.result.Result;
import com.jit.management.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public Result login(@RequestBody Admin admin){
        System.out.println(admin);
        int res = adminService.login(admin);
        if(res == 0) return Result.error("账号密码错误");
        else return Result.success();
    }

}
