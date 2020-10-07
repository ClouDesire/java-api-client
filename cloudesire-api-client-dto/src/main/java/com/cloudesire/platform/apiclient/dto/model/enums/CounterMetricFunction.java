package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum CounterMetricFunction implements MetricFunction
{
    @ApiModelProperty( "Increase value over time" )
    INCREASE,

    @ApiModelProperty( "Value over time minus previous" )
    VALUE
}
