package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.IPersistentEntity;
import com.saugat.ordermanagementsystem.wrapper.IPersistentEntityVo;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

public interface IBaseMapper<Entity extends IPersistentEntity<Long>, Wrapper extends IPersistentEntityVo<Long>> {
    Wrapper toDto(Entity m);

    @InheritInverseConfiguration
    Entity fromDto(Wrapper t);

    List<Wrapper> toDtos(List<Entity> ms);
    List<Entity> fromDtos(List<Wrapper> ws);
}
