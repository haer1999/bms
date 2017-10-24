package com.afei.bms.service;

import com.afei.bms.dao.UserDao;
import com.afei.bms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cxm on 2017/10/13.
 */
@Service
public class UserService{
    @Autowired
    UserDao userDao;

    public void test() {
        System.out.println("hello test");

    }

//    public void save(User user) {
//        userDao.save(user);
//    }
}
