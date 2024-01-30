package com.planner.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class RepeatInfo {
	@Id
    @SequenceGenerator(
        name = "repeatInfoSEQ",
        sequenceName = "RepeatInfo_SEQ",
        allocationSize = 1
    )
    @GeneratedValue(generator = "repeatInfoSEQ")
    private Long repeatInfoId; // 반복 정보 ID

    @Column(insertable = false, columnDefinition = "NUMBER DEFAULT 0")
    private int repeatType; // 반복 유형 (0: off, 1: 매일, 2: 매주 해당 요일, 3: 평일만, 4: 주말 및 공휴일)

}
