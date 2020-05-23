package com.shengxiang.service;

import com.shengxiang.dao.UserDao;
import com.shengxiang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    // Config automatiquement
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
