package com.afei.bms.service;

import com.afei.bms.dao.UnitDao;
import com.afei.bms.entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cxm on 2017/11/23.
 */
@Service
public class UnitService {
    @Autowired
    UnitDao unitDao;

    public List<Unit> getUnits() {
        return unitDao.getUnits();
    }
 }
