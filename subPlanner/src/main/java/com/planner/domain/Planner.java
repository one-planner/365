package com.planner.domain;

import java.time.LocalDate;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Planner {
	@Id
	@SequenceGenerator (
			name = "myPlannerSEQ",
			sequenceName = "Planner_SEQ",
			allocationSize = 1
		)
		@GeneratedValue(generator = "myPlannerSEQ")
	private Long pNo; // 할 일 번호
	@NonNull
	private String title; // 제목
	
	@Column(insertable = false, columnDefinition = "NUMBER DEFAULT 1")
	private int allDay; // 하루종일 
	// 0 = 하루종일 off
	// 1 = 하루종일 on
	
	@NonNull
	private LocalDate startDate; // 시작일
	@NonNull
	private LocalDate endDate; // 종료일
	@NonNull
	private String startTime; // 시작시간
	@NonNull
	private String endTime; // 종료시간
	
	private String place; // 장소
	
	@Column(insertable = false, columnDefinition = "NUMBER DEFAULT 0")
	private int repeat; // 반복 여부   // 0 = 반복 off
									// 1 = 매일
									// 2 = 매주 월요일
									// 3 = 평일만
									// 4 = 주말 및 공휴일
								
	private String content; // 내용
	
	private int invite; // 사용자 추가
	@Column(insertable = false, columnDefinition = "NUMBER DEFAULT 1")
	private int alarm; // 알람 여부 // 0 =알람 off
								 // 1 =알람 on
	
	@NonNull
	private String userEmail;
	
}
