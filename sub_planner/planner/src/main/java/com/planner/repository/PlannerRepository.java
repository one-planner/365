package com.planner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planner.domain.Plan;

@Repository
public interface PlannerRepository extends JpaRepository<Plan, Long>{

	List<Plan> findAllByuserEmail(String userEmail);

	

}
