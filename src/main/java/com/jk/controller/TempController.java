package com.jk.controller;

import com.jk.pojo.Plan;
import com.jk.pojo.Task;
import com.jk.pojo.Temp;
import com.jk.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
    private TempService tempService;


    /**
     *  查询该账户的身份
     * @return
     */
    @ResponseBody
    @PostMapping("/selectPosition")
    public List<Temp> selectPosition() {
        return tempService.selectPosition();
    }


    /**
     *  查询制定任务中的实施人
     * @return
     */
    @ResponseBody
    @PostMapping("/getImplementer")
    public List<Temp> getImplementer() {
        return tempService.getImplementer();
    }


    /**
     *  登录
     * @param temp
     * @return
     */

    @RequestMapping("login")
    @ResponseBody
    public String login(@RequestBody Temp temp) {
        return tempService.selectUser(temp);
    }


    /**
     *  添加制定任务
     * @param task
     */
    @ResponseBody
    @PostMapping(value = "/insertTask")
    public void insertTask(@RequestBody Task task){
          tempService.insertTask(task);
    }


    /**
     *  查看任务
     */
    @ResponseBody
    @PostMapping("/selectTask")
    public List<Task> selectTask() {
        return tempService.selectTask();
    }


    // 详情    + 跟踪计划详情

    @ResponseBody
    @PostMapping("/selectTaskDatails")
    public Map selectTaskDatails(String id) {
        return tempService.selectTaskDetails(id);
    }


    // 实施计划详情
    @ResponseBody
    @PostMapping("/selectplanDatails")
    public List<Plan> selectplanDatails(String id) {
        return tempService.selectplanDatails(id);
    }


    //跟踪任务

    @ResponseBody
    @PostMapping("/getTrackingTasks")
    public List<Task> getTrackingTasks() {
        return tempService.getTrackingTasks();
    }


    // 根据id修改任务状态

    @ResponseBody
    @PostMapping("/updateState")
    public  void updateState(Task task) {
         tempService.updateState(task);
    }



    // 调整任务
    @ResponseBody
    @PostMapping("/getNotTrackingTasks")
    public  List<Task> getNotTrackingTasks() {
      return   tempService.getNotTrackingTasks();
    }


    // 调整任务详情
    @ResponseBody
    @PostMapping("/adjustmentDetails")
    public  List<Task> adjustmentDetails(String id) {
        return   tempService.adjustmentDetails(id);
    }





    // 修改调整任务详情
    @ResponseBody
    @PostMapping("/updateDjustmentDetails")
    public  void updateDjustmentDetails(Task task) {
        tempService.updateDjustmentDetails(task);
    }


    // 查询员工
    @ResponseBody
    @PostMapping("/selectTemps")
    public  void selectTemps() {
        tempService.selectTemps();
    }


    // 查询员工
    @ResponseBody
    @PostMapping("/selectTempsDateils")
    public  List<Temp> selectTempsDateils(String username) {
       return tempService.selectTempsDateils(username);
    }

    // 删除
    @ResponseBody
    @PostMapping("/deleteTask")
    public void deleteTask(String id) {
         tempService.deleteTask(id);
    }


    // 下拉列表框 所属任务
    @ResponseBody
    @PostMapping("/getAssignment")
    public List<Task> getAssignment() {
      return   tempService.getAssignment();
    }

    // 条件查询
    @ResponseBody
    @PostMapping("/feedbackOrNot")
    public List<Task> feedbackOrNot(Task task) {
        return tempService.feedbackOrNot(task);
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
