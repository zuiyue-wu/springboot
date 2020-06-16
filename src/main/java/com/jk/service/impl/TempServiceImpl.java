package com.jk.service.impl;

import com.jk.mapper.TempMapper;
import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.TaskDao;
import com.jk.pojo.Temp;
import com.jk.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    TempMapper tempMapper;


    @Override
    public List<Temp> selectPosition() {
        return tempMapper.selectPosition();
    }

    @Override
    public String selectUser(Temp temp) {
        Temp temp1 = tempMapper.selectPassword(temp.getName());
        if (temp1 != null) {
            if (!temp.getPassword().equals(temp1.getPassword())) {
                return "您的密码输入不正确";
            } else if (!temp.getPosition().equals(temp1.getPosition())) {
                return "您的身份验证不正确";
            }
        } else {
            return "您输入的账户不存在";
        }
        return temp1.getFlag();
    }

    @Override
    public void insertTask(Task task) {
        tempMapper.insertTask(task);
    }

    @Override
    public List<Temp> getImplementer() {

        return tempMapper.getImplementer();
    }

    @Override
    public List<Task> selectTask() {
        return tempMapper.selectTask();
    }

    @Override
    public Map selectTaskDetails(String id) {
        List<Plan> planList = null;
        List<Task> list = tempMapper.selectTaskDetails(id);
        planList = tempMapper.selectTaskDatails(id);
        Map map = new HashMap();
        map.put("list", list);
        map.put("planList", planList);
        return map;
    }

    @Override
    public List<Plan> selectplanDatails(String id) {
        return tempMapper.selectplanDatails(id);
    }

    @Override
    public List<Task> getTrackingTasks() {
       return tempMapper.getTrackingTasks();
    }

    @Override
    public void updateState(Task task) {
        tempMapper.updateState(task);
    }

    @Override
    public List<Task> getNotTrackingTasks() {
        return tempMapper.getNotTrackingTasks();
    }

    @Override
    public List<Task> adjustmentDetails(String id) {
        return tempMapper.adjustmentDetails(id);
    }

    @Override
    public void updateDjustmentDetails(Task task) {
        tempMapper.updateDjustmentDetails(task);
    }

    @Override
    public List<Temp> selectTemps() {
        return tempMapper.selectTemps();
    }

    @Override
    public List<Temp> selectTempsDateils(String username) {
       return tempMapper.selectTempsDateils(username);
    }

    @Override
    public void deleteTask(String id) {
        tempMapper.selectTempsDateils(id);
    }

    @Override
    public List<Task> getAssignment() {
        return tempMapper.getAssignment();
    }

    @Override
    public List<Task> feedbackOrNot(Task task) {
        return tempMapper.feedbackOrNot(task);
    }




    /**
     * 删除员工信息
     */
	@Override
	public void deletePosition(String username) {
		// TODO Auto-generated method stub
		tempMapper.deletePosition(username);
	}

	/**
	 * 查询员工信息
	 */
	@Override
	public List<Temp> listPosition() {
		// TODO Auto-generated method stub
		return tempMapper.listPosition();
	}

	/**
	 * 新增人员
	 */
	@Override
	public void savePower(Temp temp) {
		// TODO Auto-generated method stub
		tempMapper.savePower(temp);
	}

	/**
	 * 查询未分配的人员
	 */
	@Override
	public List<Temp> listUnassigned() {
		// TODO Auto-generated method stub
		return tempMapper.listUnassigned();
	}

	/**
	 * 查询主管
	 */
	@Override
	public List<Temp> listflag() {
		// TODO Auto-generated method stub
		return tempMapper.listflag();
	}

	/*
	 * 新增员工部门
	 */
	@Override
	public void updateflag(Temp temp) {
		// TODO Auto-generated method stub
		 tempMapper.updateflag(temp);
	}

	/**
	 * 查询员工任务
	 */
	@Override
	public List<TaskDao> listTaskDao() {
		// TODO Auto-generated method stub
		return tempMapper.listTaskDao();
	}

	/**
	 * 新建任务
	 */
	@Override
	public void saveplan(Plan plan) {
		// TODO Auto-generated method stub
		 tempMapper.saveplan(plan);
	}

	/**
	 * 修改任务状态
	 */
	@Override
	public void updatask(int id) {
		// TODO Auto-generated method stub
		tempMapper.updatask(id);
	}

	/**
	 * 计划反馈
	 */
	@Override
	public List<Task> updatequeryTask(int id) {
		// TODO Auto-generated method stub
		return tempMapper.updatequeryTask(id);
	}


	@Override
	public void updatPlan(Plan plan) {
		// TODO Auto-generated method stub
		tempMapper.updatPlan(plan);
	}


}
