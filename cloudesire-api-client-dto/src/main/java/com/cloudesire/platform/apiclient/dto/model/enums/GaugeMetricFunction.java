package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Function to apply for gauge metrics value retrieval" )
public enum GaugeMetricFunction
{
    @ApiModelProperty( "Average value over time" )
    AVERAGE( "avg_over_time" ),

    @ApiModelProperty( "Peak value over time" )
    PEAK( "max_over_time" );

    private String function;

    GaugeMetricFunction( String function )
    {
        this.function = function;
    }

    public String getFunction()
    {
        return function;
    }
}
