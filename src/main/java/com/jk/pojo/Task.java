package com.jk.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Task {


    private String id;
    private String taskName;
    private Date taskBeginTime;
    private Date taskEndTime;
    private String taskDescription;
    private String taskState;
    private String staffId;
    private String empId;

}
