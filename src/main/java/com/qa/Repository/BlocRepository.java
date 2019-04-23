package com.qa.Repository;

import com.qa.model.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findAllByUser_iduser(int idtask);
    Bloc findById(Long id);
}
