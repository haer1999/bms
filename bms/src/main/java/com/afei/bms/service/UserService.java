package com.afei.bms.service;

import com.afei.bms.dao.UserDao;
import com.afei.bms.dto.BmsDto;
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

    public User login(String userName, String password) {
        User user = userDao.findByNameAndPassword(userName, password);
        return user;
    }

    public User adminLogin(String userName, String password) {
        User user = userDao.findAdminByNameAndPassword(userName, password);
        return user;
    }

    public User save(String userName, String password) {
        User user = userDao.findByName(userName);
        if (user != null) {
            return null;
        }
        user = new User();
        user.setName(userName);
        user.setPassword(password);
        userDao.save(user);
        return user;
    }

}
