package com.afei.bms.dao;

import com.afei.bms.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by cxm on 2017/10/13.
 */
@Repository
public class UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user) {
        Serializable serializable = sessionFactory.getCurrentSession().save(user);
        System.out.println(serializable);
    }
}