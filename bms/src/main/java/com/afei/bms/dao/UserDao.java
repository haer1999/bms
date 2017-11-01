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

    @Transactional
    public void save(User user) {
        Serializable serializable = sessionFactory.getCurrentSession().save(user);
        System.out.println("what happeng"+serializable);
    }

    @Transactional(readOnly = true)
    public User findByName(String name) {
        List<User> userList = sessionFactory.getCurrentSession().createQuery("from User where name=?")
                .setParameter(0, name).list();
        if (userList != null & userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }

    @Transactional(readOnly = true)
    public User findByNameAndPassword(String name, String password) {
        User user = (User)sessionFactory.getCurrentSession().createQuery("from User where name =? and password = ?")
                .setParameter(0, name).setParameter(1, password).uniqueResult();
        return user;
    }

    @Transactional(readOnly = true)
    public User findAdminByNameAndPassword(String name, String password) {
        User user = (User)sessionFactory.getCurrentSession().createQuery("from User where name =? and password = ? and system = true")
                .setParameter(0, name).setParameter(1, password).uniqueResult();
        return user;
    }



}
