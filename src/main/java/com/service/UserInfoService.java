package com.service;

import com.model.UserInfo;
import com.repository.UserInfoJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements UserInfoInterface {
   @Autowired
    UserInfoJPARepo userRepo;

    @Override
    public UserInfo addUserInfo(UserInfo user){
        return userRepo.save(user);
    }
}
