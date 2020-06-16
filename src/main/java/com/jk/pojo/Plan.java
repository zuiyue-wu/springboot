package com.jk.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Plan {

    private  Integer  id;

    private  String   planName;

    private  String planState;

    private  String  feedback;

    private Date planBeginDate;

    private Date planEndDate;

    private  String planDescription;

    private  String planFeedback;

    private Integer taskId;




}
