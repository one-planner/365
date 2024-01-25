package com.planner.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.planner.service.PlannerService;

@Controller
public class PlannerController {

	@Autowired
	PlannerService plannerService;
	
	@GetMapping("testCalendarForm")
	public String testCalendarForm() {
		return "calendar/testCalendar";
	}
	
	@ResponseBody
	@GetMapping("/calendar/cinsert")
	public List<Map<String, Object>> calendarInsert(){
		return plannerService.calendarInsert();
	}
	
}
