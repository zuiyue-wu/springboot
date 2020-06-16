package com.jk.service;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.Temp;

import java.util.List;
import java.util.Map;

public interface TempService {


    List<Temp> selectPosition();


    String selectUser(Temp temp);

    /**
     *   制定任务
     * @param task
     */
    void  insertTask(Task task);

    /**
     *  查询实施人
     * @return
     */
    List<Temp> getImplementer();


    /**
     *  查看任务
     * @return
     */
    List<Task> selectTask();

    Map selectTaskDetails(String id);


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
