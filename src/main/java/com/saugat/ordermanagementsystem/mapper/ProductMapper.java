package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Product;
import com.saugat.ordermanagementsystem.wrapper.ProductVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = IMapperConfig.class, uses = {CategoryMapper.class, SupplierMapper.class})
public abstract class ProductMapper implements IBaseMapper<Product, ProductVo> {
}
