package com.TJ7.JobApp.service;


import com.TJ7.JobApp.Repo.JobRepo;
import com.TJ7.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addPost(JobPost jobPost){
        jobRepo.addPost(jobPost);
    }

    public List<JobPost> getAllPost(){

            return jobRepo.getAllJobs();
    }
}
