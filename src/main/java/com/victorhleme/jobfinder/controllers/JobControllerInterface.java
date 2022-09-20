package com.victorhleme.jobfinder.controllers;

import com.victorhleme.jobfinder.dto.JobDTO;
import com.victorhleme.jobfinder.dto.JobInsertDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface Controller {
    Page<JobDTO> findAll(Pageable page);
    JobDTO findById(@PathVariable Integer id);
    JobDTO insert(@Valid @RequestBody JobInsertDto newJob);
    JobDTO update(@Valid @RequestBody JobInsertDto job, @PathVariable Integer id);
    void delete(@PathVariable @Valid Integer id);

}
