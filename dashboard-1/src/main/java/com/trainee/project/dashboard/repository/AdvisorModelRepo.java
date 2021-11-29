package com.trainee.project.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.project.dashboard.model.AdvisorModel;

@Repository
public interface AdvisorModelRepo extends JpaRepository<AdvisorModel, Integer> {
	public AdvisorModel findByAdvmodelid(Integer advmodelid);
	
}
