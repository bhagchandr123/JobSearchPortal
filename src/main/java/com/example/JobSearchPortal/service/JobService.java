package com.example.JobSearchPortal.service;

import com.example.JobSearchPortal.repository.JobRepository;
import com.example.JobSearchPortal.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateJob(Long id, Job updatedJob) {
        // Implement update logic here
        // You can use jobRepository.save(updatedJob) after updating fields
        return null;
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }

}
