package com.afei.bms.controller;

import com.afei.bms.entity.Unit;
import com.afei.bms.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by cxm on 2017/11/23.
 */
@Controller
@RequestMapping("/unit")
public class UnitController {
    @Autowired
    UnitService unitService;

    @RequestMapping("/getUnits")
    public String getUnits() {
        List<Unit> units = unitService.getUnits();
        return null;
    }

}
