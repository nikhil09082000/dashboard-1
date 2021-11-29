package com.trainee.project.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trainee.project.dashboard.model.Advisor;
import com.trainee.project.dashboard.model.AdvisorModel;
import com.trainee.project.dashboard.model.Test;
import com.trainee.project.dashboard.repository.TestRepo;
import com.trainee.project.dashboard.service.MyService;

@Controller
@RequestMapping
@ResponseBody
public class FetchData {
	@Autowired
	private MyService service;
	@Autowired
	private TestRepo obj4;
	@GetMapping("/nikhil")
	public Test getUser() {
		Test y1 = service.getUserData();
		System.out.println(y1);
		return y1;
	}
	
	@GetMapping("/get-custom-model")
	public List<Test> getallUser() {
	List<Test> y1 = service.getAllUserData();
	System.out.println(y1);
	return y1;
	}
	
	@GetMapping("/get-advisors")
	public List<Advisor> getalladvisors(){
		List<Advisor> g1=service.getAllAdvisorData();
		return g1;
	}
	
	@GetMapping("/get-advisor-model")
	public List<AdvisorModel> getalladvisomodel(){
		List<AdvisorModel> oj2=service.getAllAdvisorModelData();
		return oj2;
	}
	
	@PostMapping("/post-custom-model")
	public String useradding(@RequestBody Test obj2) {
		//System.out.println(obj2.getModeldesc());
		service.insertdata(obj2);
		return "succesfully added";
	}
	
	@PostMapping("/post-advisors")
	public String useradvadding(@RequestBody Advisor advobj2) {
		//System.out.println(obj2.getModeldesc());
		/*
		 * { "advid":34, "advname":"abc" }
		 */
		
		service.advadddata(advobj2);
		return "succesfully added";
	}
	@PostMapping("/post-advisor-model")
	public String useradvmodeladding(@RequestBody AdvisorModel advmodelobj2) {
		//System.out.println(obj2.getModeldesc());
		/*
		 * { "advmodelcode":"mc2", "advmodelid":45, "advmodeldate":"29-11-2021" }
		 */
		
		service.advmodeladddata(advmodelobj2);
		return "succesfully added";
	}


}
