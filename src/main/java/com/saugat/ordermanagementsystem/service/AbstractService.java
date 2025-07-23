package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.exceptions.CustomException;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.IPersistentEntity;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.resource.AbstractResponse;
import com.saugat.ordermanagementsystem.wrapper.IPersistentEntityVo;
import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public abstract class AbstractService<E extends IPersistentEntity<Long>, W extends IPersistentEntityVo<Long>> extends AbstractResponse implements IService<W> {

    public abstract String getServiceName();
    public abstract AbstractRepo<E> getRepository();
    public abstract IBaseMapper<E, W> getMapper();

    @Override
    public ResponseEntity<ApiResponse<W>> get(Long id){
        E obj = getRepository().findById(id).orElseThrow(() -> new CustomException(getServiceName() + " not found"));
        return responseBuilder(true,"Data fetched successfully", getMapper().toDto(obj));
    }

    @Override
    public ResponseEntity<ApiResponse<List<W>>> getAll(){
        List<E> obj = getRepository().findAll();
        return responseBuilder(true, "Data fetched successfully", getMapper().toDtos(obj));
    }

    @Override
    public ResponseEntity<ApiResponse<W>> create(W vo){
        E obj = (E) getMapper().fromDto(vo);
        getRepository().save(obj);
        return responseBuilder(true, "Data created successfully", getMapper().toDto(obj));
    }

    @Override
    public ResponseEntity<ApiResponse<W>> edit(W vo){
        E existingE = getRepository().findById((Long)vo.getId()).orElseThrow(() -> new CustomException(getServiceName() + " not found"));
        E obj = (E) getMapper().fromDto(vo);
        obj.setId(existingE.getId());
        getRepository().save(obj);
        return responseBuilder(true, "Data updated successfully", getMapper().toDto(obj));
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> delete(Long id){
        E existingE = getRepository().findById(id).orElseThrow(() -> new CustomException(getServiceName() + " not found"));
        getRepository().delete(existingE);
        return responseBuilder(true, "Data deleted successfully", null);
    }
}
