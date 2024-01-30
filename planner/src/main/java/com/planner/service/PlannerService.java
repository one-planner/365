package com.planner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.domain.Plan;
import com.planner.repository.PlannerRepository;

@Service
public class PlannerService {

	@Autowired
	public PlannerRepository plannerRepository;
	
	public Plan insert(Plan plan) {
		return plannerRepository.save(plan);
	}


//	public List<Plan> select(String userEmail) {
//		return plannerRepository.findAllByuserEmail(userEmail);
//		
//	}

}
