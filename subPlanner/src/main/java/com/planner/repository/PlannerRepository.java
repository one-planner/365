package com.planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planner.domain.Planner;

@Repository
public interface PlannerRepository extends JpaRepository<Planner, Long>{


}
