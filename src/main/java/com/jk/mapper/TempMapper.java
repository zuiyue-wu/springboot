package com.jk.mapper;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.TaskDao;
import com.jk.pojo.Temp;

import java.util.List;

public interface TempMapper {

    List<Temp>  selectPositions();

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

    //删除员工
	void deletePosition(String username);
	//查询员工
	List<Temp> listPosition();
	//新增员工
	void savePower(Temp temp);
	//查询未分配的成员
	List<Temp> listUnassigned();
	//查询主管
	List<Temp> listflag();
	//新增用户主管
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
