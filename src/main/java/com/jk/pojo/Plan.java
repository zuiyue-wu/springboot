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

    private  String taskName;


    private Date planEndDateEndTime;
    private  Date planEndDateStartTime;
    private  Date planBeginDateEndTime;
    private  Date planBeginDateStartTime;


}
