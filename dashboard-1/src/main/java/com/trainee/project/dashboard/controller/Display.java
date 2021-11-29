package com.trainee.project.dashboard.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trainee.project.dashboard.model.Test;
import com.trainee.project.dashboard.service.MyService;

@Controller
@RequestMapping("/display")
@ResponseBody
public class Display {
	private MyService service;
	@GetMapping("/alluserdata")
	public List<Test> getallUser() {
	List<Test> y1 = service.getAllUserData();
	System.out.println(y1);
	return y1;
	}
}
