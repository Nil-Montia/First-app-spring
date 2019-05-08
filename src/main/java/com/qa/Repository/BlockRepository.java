package com.qa.Repository;

import com.qa.model.Block;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlockRepository extends JpaRepository<Block, Long> {

    public List<Block> findAllByUserid(Long userid);

}
