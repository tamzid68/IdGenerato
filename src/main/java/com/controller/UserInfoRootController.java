package com.controller;

import com.model.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserInfoRootController {
    @Autowired
    private UserInfoService userService;

    @GetMapping(value = "/")
    public String def() { return "Earn$"; }

    @PostMapping(value = "/add_id")
    public UserInfo addUserInfo(@RequestBody UserInfo user)
    {
        return userService.addUserInfo(user);
    }
}
