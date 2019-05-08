package com.qa.Controller;

import com.qa.Repository.BlockRepository;
import com.qa.model.Block;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/block/")
public class BlockController {

    @Autowired
    BlockRepository blockRepository;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void create(@RequestBody Block block) {
        blockRepository.saveAndFlush(block);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public void update(@PathVariable Long id, @RequestBody Block block) {
        Block existingBlock = blockRepository.findOne(id);
        block.setBlockid(id);
        BeanUtils.copyProperties(block, existingBlock);
        blockRepository.saveAndFlush(block);
    }

    @RequestMapping(value = "get/{userid}", method = RequestMethod.GET)
    public List<Block> retrieveByUserid(@PathVariable Long userid) {
        return blockRepository.findAllByUserid(userid);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        blockRepository.delete(id);
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Block> retrieve() {
        return blockRepository.findAll();
    }
}
