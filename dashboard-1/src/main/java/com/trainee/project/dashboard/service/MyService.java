package com.trainee.project.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainee.project.dashboard.model.Advisor;
import com.trainee.project.dashboard.model.AdvisorModel;
import com.trainee.project.dashboard.model.Test;
import com.trainee.project.dashboard.repository.AdvisorModelRepo;
import com.trainee.project.dashboard.repository.AdvisorRepo;
import com.trainee.project.dashboard.repository.TestRepo;

@Service
public class MyService {
	@Autowired
	private TestRepo obj1;
	public Test getUserData() {
		Test t= new Test();
		t=obj1.findByModelcode(11);
		System.out.println(t);
		return t;
	}
	
	public List<Test> getAllUserData() {
		Test t=new Test();
		List<Test> findAll = obj1.findAll();
		System.out.println(findAll);
		return findAll;
	} 
	public void insertdata(Test t) {
		System.out.println(t);
		obj1.save(t);
		
	}
	
	@Autowired
	private AdvisorRepo advobj1;
	public List<Advisor> getAllAdvisorData(){
		Advisor a=new Advisor();
		List<Advisor> advall=advobj1.findAll();
		return(advall);
	}
	
	public void advadddata(Advisor u) {
		advobj1.save(u);
	}
	
	@Autowired
	private AdvisorModelRepo advmodelobj1;
	public List<AdvisorModel> getAllAdvisorModelData(){
		AdvisorModel hf=new AdvisorModel();
		List<AdvisorModel> advmodelall=advmodelobj1.findAll();
		return(advmodelall);
	}
	
	public void advmodeladddata(AdvisorModel u3) {
		advmodelobj1.save(u3);
	}
}
