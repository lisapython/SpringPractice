package com.lisapra.pra1.service.impl;

import com.lisapra.pra1.dao.UserDao;
import com.lisapra.pra1.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser() {
        System.out.println("get userDao start");
        userDao.getUser();
        System.out.println("get userDao end");
    }
}
