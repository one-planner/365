package com.planner.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.planner.domain.Planner;
import com.planner.service.PlannerService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PlannerController {

	@Autowired
	PlannerService plannerService;
	
	
//	@ResponseBody
//	@GetMapping("/calendar/cinsert")
//	public List<Map<String, Object>> calendarInsert(){
//		return plannerService.calendarInsert();
//	}
	
	// 일정추가폼
	@PostMapping("insert")
	@ResponseBody
	public String insert(@RequestParam("title") String title,
						 @RequestParam("startDate") LocalDate startDate,
						 @RequestParam("endDate") LocalDate endDate,
						 @RequestParam("startTime") String startTime,
						 @RequestParam("endTime") String endTime,
						 @RequestParam("content") String content,
						 @RequestParam("place") String place,
						 Planner planner,
						 HttpSession session) {
		
		planner.setTitle(title);
		planner.setStartDate(startDate);
		planner.setEndDate(endDate);
		planner.setStartTime(startTime);
		planner.setEndTime(endTime);
		planner.setContent(content);
		planner.setPlace(place);
		
		plannerService.insert(planner);
		return "success";
	}
	
	
}
