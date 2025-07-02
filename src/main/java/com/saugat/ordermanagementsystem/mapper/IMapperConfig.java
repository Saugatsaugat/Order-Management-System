package com.saugat.ordermanagementsystem.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(componentModel = "spring", uses = {Transform.class}, nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,disableSubMappingMethodsGeneration = true)
public interface IMapperConfig {
}
