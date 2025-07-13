package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Inventory;
import com.saugat.ordermanagementsystem.wrapper.InventoryVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {ProductMapper.class})
public abstract class InventoryMapper implements IBaseMapper<Inventory, InventoryVo> {
}
