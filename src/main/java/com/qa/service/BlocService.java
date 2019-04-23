package com.qa.service;

import com.qa.Repository.BlocRepository;
import com.qa.model.Bloc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlocService {
    @Autowired
    private BlocRepository blocRepository;

    public List<Bloc> retrieve(int iduser){
        return  blocRepository.findAllByUser_iduser(iduser);
    }

    public void create(Bloc bloc){
        blocRepository.saveAndFlush(bloc);
    }

    public void deleteBloc(Long id){
        blocRepository.delete(id);
    }
}
