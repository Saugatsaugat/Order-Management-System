package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.wrapper.IPersistentEntityVo;
import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IService<W extends IPersistentEntityVo<Long>> {
    ResponseEntity<ApiResponse<W>> get(Long id);
    ResponseEntity<ApiResponse<List<W>>> getAll();
    ResponseEntity<ApiResponse<W>> create(W vo);
    ResponseEntity<ApiResponse<W>> edit(W vo);
    ResponseEntity<ApiResponse<Object>> delete(Long id);
}
