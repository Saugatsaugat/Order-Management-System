package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.resource.AbstractResponse;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.IPersistentEntityVo;
import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
W: Wrapper
 */

public abstract class AbstractController<W extends IPersistentEntityVo<Long>> extends AbstractResponse {

    protected abstract IService getService();

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<W>> get(@PathVariable("id") Long id){
        return getService().get(id);
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<W>>> getAll(){
        return getService().getAll();
    }

    @PostMapping
    public ResponseEntity<ApiResponse<W>> create(@RequestBody W vo){
        return getService().create(vo);
    }

    @PutMapping
    public ResponseEntity<ApiResponse<W>> edit(@RequestBody W vo){
        return getService().edit(vo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Object>> delete(@PathVariable("id") Long id){
        return getService().delete(id);
    }
}
