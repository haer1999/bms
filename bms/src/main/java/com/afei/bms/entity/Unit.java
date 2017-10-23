package com.afei.bms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by cxm on 2017/10/19.
 */
@Data
@Entity(name = "t_unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String author;
    private String publisher;
    private Long publishTime;
    private String serialNum;
}
