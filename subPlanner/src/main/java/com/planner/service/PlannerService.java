package com.planner.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PlannerService {

	public List<Map<String, Object>> calendarInsert() {
		Map<String, Object> result = new HashMap<String, Object>();
        List<Map<String, Object>> eventList = new ArrayList<Map<String, Object>>();
        result.put("start", LocalDate.now());
        result.put("title", "뭘봐");
        result.put("end",LocalDate.now());
        eventList.add(result);
        result = new HashMap<String, Object>();
        result.put("start", LocalDate.now().plusDays(3));
        result.put("title", "눈깔아");
        result.put("end",LocalDate.now().plusDays(4));
        eventList.add(result);
        return eventList;
	}

}
