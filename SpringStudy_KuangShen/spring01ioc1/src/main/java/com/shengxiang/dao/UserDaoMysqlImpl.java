package com.shengxiang.dao;

public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Mysql: get data of users");
    }
}
