package com.afei.bms.dao;

import com.afei.bms.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cxm on 2017/10/13.
 */
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;
//
//    public void save(User user) {
//        Serializable serializable = sessionFactory.getCurrentSession().save(user);
//        System.out.println(serializable);
//    }


    @Transactional(readOnly = true)
    public User findByName(String name, String password) {
        List<User> userList = sessionFactory.getCurrentSession().createQuery("from User where name=? and password=?")
                .setParameter(0, name).setParameter(1, password).list();
        if (userList != null & userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }



}
