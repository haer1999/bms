package com.afei.bms.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by cxm on 2017/10/13.
 */
@Data
@Entity(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String password;
    private String phone;
    private String email;

    private boolean system;
}
