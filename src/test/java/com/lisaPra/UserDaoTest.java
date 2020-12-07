package com.lisaPra;


import com.lisapra.pra1.dao.impl.UserDaoByMysqlImpl;
import com.lisapra.pra1.dao.impl.UserDaoByOracleImpl;
import com.lisapra.pra1.service.impl.UserServiceImpl;

public class UserDaoTest {
    public static void main(String[] args) {
        UserServiceImpl oracleServ = new UserServiceImpl();
        oracleServ.setUserDao(new UserDaoByOracleImpl());
        oracleServ.getUser();

        UserServiceImpl mysqlServ = new UserServiceImpl();
        mysqlServ.setUserDao(new UserDaoByMysqlImpl());
        mysqlServ.getUser();
    }
}
