package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.InventoryLog;
import com.saugat.ordermanagementsystem.wrapper.InventoryLogVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class InventoryLogMapper implements IBaseMapper<InventoryLog, InventoryLogVo> {
}
