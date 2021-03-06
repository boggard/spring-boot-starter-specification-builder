package com.github.mikesafonov.specification.builder.starter.base.studens;

import com.github.mikesafonov.specification.builder.starter.annotations.SegmentIntersection;
import com.github.mikesafonov.specification.builder.starter.type.SegmentFilter;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentStudyingFilter {

    @SegmentIntersection(fromField = "studyingDateStart", toField = "studyingDateEnd")
    private SegmentFilter<LocalDate> periodFilter;

    public StudentStudyingFilter(LocalDate from, LocalDate to) {
        this.periodFilter = new SegmentFilter<>(from, to);
    }
}
