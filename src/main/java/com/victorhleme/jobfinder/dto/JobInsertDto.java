package com.victorhleme.jobfinder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobInsertDto {
    @NotBlank(message = "O título deve ser preenchido.")
    @Size(min = 2, max = 100, message="O título deve ter até 100 caracteres.")
    private String title;
    @NotBlank(message = "A descrição deve ser preenchida.")
    private String description;
    private double minSalary;
    private double maxSalary;
}
