package com.jk.controller;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.TaskDao;
import com.jk.pojo.Temp;
import com.jk.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
    private TempService tempService;

    @ResponseBody
    @PostMapping("/selectPosition")
    public List<Temp> selectPosition(){
        return tempService.selectPosition();
    }
    
    /**
     * 删除员工基本信息
     * @return
     */
    @ResponseBody
    @PostMapping("/deletePosition")
    public void deletePosition(String username ){
         tempService.deletePosition(username);
    }
    
    /**
     * 查询员工
     * @return
     */
	@RequestMapping("/listPosition")
	@ResponseBody
	public List<Temp> listPosition(){
		return tempService.listPosition();
	}
	
	/**
	 * 新增员工
	 * @param nav
	 */
	@PostMapping("/savePower")
	@ResponseBody	
	public void savePower(Temp temp){
		 String Str1=UUID.randomUUID().toString().replace("-", "");
		 temp.setUsername(Str1);
		tempService.savePower(temp);
	}
	
	/**
	 * 查询未分配的人员
	 * @return
	 */
	@RequestMapping("/listUnassigned")
	@ResponseBody
	public List<Temp> listUnassigned(){
		return tempService.listUnassigned();
	}
	
	/**
	 * 查询主管
	 * @return
	 */
	@RequestMapping("/listflag")
	@ResponseBody
	public List<Temp> listflag(){
		return tempService.listflag();
	}
    
	/**
	 * 员工新增部门
	 * @param temp
	 */
	@PostMapping("/updateflag")
	@ResponseBody	
	public void updateflag(Temp temp){
		tempService.updateflag(temp);
	}
	
	/**
	 * 查询员工任务
	 * @return
	 */
	@RequestMapping("/listTaskDao")
	@ResponseBody
	public List<TaskDao> listTaskDao(){
		return tempService.listTaskDao();
	}
	/**
	 * 新建计划
	 * @param temp
	 */
	@PostMapping("/saveplan")
	@ResponseBody	
	public void saveplan(Plan plan){
		tempService.saveplan(plan);
	}
	
	/**
	 * 修改任务状态
	 * @param temp
	 */
	@PostMapping("/updatask")
	@ResponseBody	
	public void updatask(int id){
		tempService.updatask(id);
	}
	/**
	 * 计划反馈
	 * @return
	 */
	@RequestMapping("/updatequeryTask")
	@ResponseBody
	public List<Task> updatequeryTask(int id){
		return tempService.updatequeryTask(id);
	}
	/**
	 * 计划修改
	 * @param temp
	 */
	@PostMapping("/updatPlan")
	@ResponseBody	
	public void updatPlan(Plan plan){
		tempService.updatPlan(plan);
	}
	
}
