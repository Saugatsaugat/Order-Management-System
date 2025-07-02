package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.resource.AbstractResponse;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.IPersistentEntityVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*
W: Wrapper
 */

public abstract class AbstractController<W extends IPersistentEntityVo<Long>> extends AbstractResponse {

    protected abstract IService getService();

    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable("id") Long id){
        return getService().get(id);
    }

    @GetMapping("/all")
    public ResponseEntity<String> getAll(){
        return getService().getAll();
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody W vo){
        return getService().create(vo);
    }

    @PutMapping
    public ResponseEntity<String> edit(@RequestBody W vo){
        return getService().edit(vo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        return getService().delete(id);
    }
}
