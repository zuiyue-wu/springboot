package com.jk.service.impl;

import com.jk.mapper.TempMapper;
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
