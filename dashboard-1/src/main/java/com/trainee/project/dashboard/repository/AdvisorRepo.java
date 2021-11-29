package com.trainee.project.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.project.dashboard.model.Advisor;
@Repository
public interface AdvisorRepo extends JpaRepository<Advisor, Integer> {
	public Advisor findByAdvid(Integer advid);
}
