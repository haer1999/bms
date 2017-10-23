package com.afei.test;

import com.afei.bms.dao.UserDao;
import com.afei.bms.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by cxm on 2017/10/23.
 */
public class UserDaoTest {
    @Test
    public void save() throws Exception {
    }

//    @Test
//    public void findByName() throws Exception {
//        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
//        UserDao userDao = ac.getBean(UserDao.class);
//        User user = userDao.findByName("xiao11");
//        System.out.println(user.toString());
//
//    }

}