package com.planner.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.planner.domain.Plan;
import com.planner.service.PlannerService;

import jakarta.servlet.http.HttpSession;


@Controller
public class PlannerController {
	
	@Autowired 
	public PlannerService plannerService;
	
	// 일정 추가
		@PostMapping("/insert")
		@ResponseBody 
		public String insert(@RequestBody Plan plan, HttpSession session) {
			plan.setUserEmail((String)session.getAttribute("loginUser"));
			plannerService.insert(plan);
			return "success";
		}
	
	/*
	 * // 일정 조회
	 * 
	 * @GetMapping("select") public String select(@RequestParam(value="userEmail")
	 * String userEmail, HttpSession session , Model model) {
	 * 
	 * if(session.getAttribute("loginUser") != null) { }
	 * model.addAttribute("userPlan", plannerService.select(userEmail)); return
	 * "calendar/mCalendar"; }
	 */
	
}
