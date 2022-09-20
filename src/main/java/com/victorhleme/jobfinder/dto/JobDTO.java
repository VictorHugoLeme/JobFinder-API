package com.victorhleme.jobfinder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDTO {
    private Integer id;
    private String title;
    private String description;
    private double minSalary;
    private double maxSalary;
}
