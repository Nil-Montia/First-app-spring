package com.qa.service;

import com.qa.Repository.StepRepository;
import com.qa.model.Step;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public class StepService {
    @Autowired
    private StepRepository stepRepository;

    public List<Step> retrieve(int idtask){
        return  stepRepository.findAllByTask_idtask(idtask);
    }

    public void create(Step step){
        stepRepository.saveAndFlush(step);
    }

    public void updateName(Long id, String name){
        Step step = stepRepository.findById(id);
        step.setName(name);
        stepRepository.saveAndFlush(step);
    }

    public void updateStatus(Long id, String status){
        Step step = stepRepository.findById(id);
        step.setStatus(status);
        stepRepository.saveAndFlush(step);
    }

    public void deleteStep(Long id){
        stepRepository.delete(id);
    }

}
