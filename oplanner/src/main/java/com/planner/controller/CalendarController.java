package com.planner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

	@GetMapping("calendarForm")
	public String calendarForm() {
		return "calendar/calendarForm";
	}
}
