package com.cloudesire.platform.apiclient.dto.model.enums;

import com.cloudesire.platform.apiclient.dto.model.utils.MetricFunctionCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;

@ApiModel( description = "Function to apply for metrics value retrieval" )
public interface MetricFunction
{
    @JsonCreator
    static MetricFunction create( String name )
    {
        return MetricFunctionCreator.create( name );
    }
}
