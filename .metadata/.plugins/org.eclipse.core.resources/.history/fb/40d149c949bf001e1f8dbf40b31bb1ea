package com.planner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"loginMember"}) // 로그인은 유지되어야하는데 model은 일시적이여서 계속 유지가 안되므로 세션에 넣어 처리
public class HomeController {
	
	@RequestMapping("/")
	public String root() throws Exception {
		return "home";
	}
	
	@RequestMapping("home")
	public String home() throws Exception {
		return "home";
	}
	
	@GetMapping("mCalendarForm")
	public String calendarForm() {
		return "calendar/mCalendar";
	}
	
	//테스트폼
	@GetMapping("testCalendarForm")
	public String testCalendarForm() {
		return "calendar/testCalendar";
	}
	//재호최폼
	@GetMapping("choiForm")
	public String choiForm() {
		return "calendar/testCalendarBackup8ChoiForm";
	}
	
}
