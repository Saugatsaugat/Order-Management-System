package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Category;
import com.saugat.ordermanagementsystem.wrapper.CategoryVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class CategoryMapper implements IBaseMapper<Category, CategoryVo> {
}
