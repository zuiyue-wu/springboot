package com.jk.pojo;

import java.util.Date;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDao {

    private String id;
    private String taskName;
    private Date taskBeginTime;
    private Date taskEndTime;
    private String taskDescription;
    private String taskState;
    private String staffId;
    private String empId;
    private String username;
    private String name;
    private String password;
    private String sex;
    private Date birthday;
    private Date hireDate;
    private String position;
    private String qualification;
    private String professional;
    private String experience;
    private String flag;
    private String superId;
    
}
