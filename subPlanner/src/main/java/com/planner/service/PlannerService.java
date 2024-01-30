package com.planner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.domain.Planner;
import com.planner.repository.PlannerRepository;

@Service
public class PlannerService {
	
	@Autowired
	PlannerRepository plannerRepository;

	public Planner insert(Planner planner) {
		return plannerRepository.save(planner);
	}

//	public List<Map<String, Object>> calendarInsert() {
//		Map<String, Object> result = new HashMap<String, Object>();
//        List<Map<String, Object>> eventList = new ArrayList<Map<String, Object>>();
//        result.put("start", LocalDate.now());
//        result.put("title", "뭘봐");
//        result.put("end",LocalDate.now());
//        eventList.add(result);
//        result = new HashMap<String, Object>();
//        result.put("start", LocalDate.now().plusDays(3));
//        result.put("title", "눈깔아");
//        result.put("end",LocalDate.now().plusDays(4));
//        eventList.add(result);
//        return eventList;
//	}

	
	
}
