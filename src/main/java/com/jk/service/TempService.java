package com.jk.service;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.TaskDao;
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

    //删除员工信息
	void deletePosition(String username);
	//查询员工信息
	List<Temp> listPosition();
	//新增员工
	void savePower(Temp temp);
	//查询未分配的人员
	List<Temp> listUnassigned();
	//查询主管
	List<Temp> listflag();
	//新增员工部门
	void updateflag(Temp temp);
	//查询员工任务
	List<TaskDao> listTaskDao();
	//新建计划
	void saveplan(Plan plan);
	//修改任务状态
	void updatask(int id);
	//计划反馈
	List<Task> updatequeryTask(int id);
	//计划修改
	void updatPlan(Plan plan);


}
