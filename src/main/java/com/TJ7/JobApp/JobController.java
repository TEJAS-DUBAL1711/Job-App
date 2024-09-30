package com.TJ7.JobApp;


import com.TJ7.JobApp.model.JobPost;
import com.TJ7.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){

        return "addjob";

    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addPost(jobPost);
        return "success";


    }

  @GetMapping("viewalljobs")
    public String viewJobs(Model model){
        List<JobPost> jobs=service.getAllPost();

        model.addAttribute("jobPosts",jobs);

        return "viewalljobs";


    }


}
