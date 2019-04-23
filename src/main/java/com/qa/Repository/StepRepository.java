package com.qa.Repository;

import com.qa.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StepRepository extends JpaRepository<Step, Long> {
    List<Step> findAllByTask_idtask(int idtask);
    Step findById(Long id);
}
