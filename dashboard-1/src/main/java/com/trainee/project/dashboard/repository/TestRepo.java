package com.trainee.project.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.project.dashboard.model.Test;
@Repository
public interface TestRepo extends JpaRepository<Test, Integer>{
	public Test findByModelcode(Integer modelcode);
	/*
	 * @Query("INSERT INTO Test VALUES(i1,s1,s2,s3);") public int insert(Integer
	 * i1,String s1,String s2,String s3) ;
	 */
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query( value =
	 * "insert into CUSTOM_MODEL(model_desc, model_type, status) values (modeldesc, modeltype, status)"
	 * , nativeQuery = true) void insertUser(@Param("modelcode") Integer
	 * modelcode, @Param("modeldesc") String modeldesc,
	 * 
	 * @Param("modeltype") String modeltype, @Param("status") String status);
	 */
	
}
