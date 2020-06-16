package com.jk.mapper;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.TaskDao;
import com.jk.pojo.Temp;

import java.util.List;

public interface TempMapper {

    List<Temp>  selectPosition();

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
