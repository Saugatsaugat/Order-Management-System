package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.wrapper.IPersistentEntityVo;
import org.springframework.http.ResponseEntity;

public interface IService<W extends IPersistentEntityVo<Long>> {
    ResponseEntity<String> get(Long id);
    ResponseEntity<String> getAll();
    ResponseEntity<String> create(W vo);
    ResponseEntity<String> edit(W vo);
    ResponseEntity<String> delete(Long id);
}
