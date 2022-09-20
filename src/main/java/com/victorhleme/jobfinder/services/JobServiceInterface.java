package com.victorhleme.jobfinder.services;

import com.victorhleme.jobfinder.dto.JobDTO;
import com.victorhleme.jobfinder.dto.JobInsertDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface JobServiceInterface {
    Page<JobDTO> findAll(Pageable page);
    JobDTO findById(Integer id);
    JobDTO insert(JobInsertDto jobDto);
    JobDTO update(JobInsertDto jobDto, Integer id);
    void delete(Integer id);


}

