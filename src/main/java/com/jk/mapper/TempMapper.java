package com.jk.mapper;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.Temp;

import java.util.List;
import java.util.Map;

public interface TempMapper {

    List<Temp>  selectPosition();

    List<Temp> selectUser(Temp temp);

    Temp  selectPassword(String name);

    void  insertTask(Task task);

     List<Temp> getImplementer();

    List<Task> selectTask();

    List<Plan> selectTaskDatails(String taskId);

    List<Task>  selectTaskDetails(String id);

    List<Plan> selectplanDatails(String id);

    List<Task> getTrackingTasks();

    void updateState(Task task);


    List<Task>  getNotTrackingTasks();


    List<Task>  adjustmentDetails(String id);

    void updateDjustmentDetails(Task task);


    List<Temp> selectTemps();

    List<Temp> selectTempsDateils(String username);

    void deleteTask(String id);

    List<Task> getAssignment();

    List<Task> feedbackOrNot(Task task);
}
