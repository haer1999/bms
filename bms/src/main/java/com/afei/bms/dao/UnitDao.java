package com.afei.bms.dao;

import com.afei.bms.entity.Unit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cxm on 2017/11/23.
 */
@Repository
public class UnitDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Unit> getUnits() {
        String sql = "from Unit";
        List<Unit> unitList = sessionFactory.getCurrentSession().createQuery(sql).list();
        return unitList;
    }

}
