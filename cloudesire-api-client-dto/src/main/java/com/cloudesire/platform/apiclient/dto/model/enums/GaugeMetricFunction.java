package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum GaugeMetricFunction implements MetricFunction
{
    @ApiModelProperty( "Average value over time" )
    AVERAGE,

    @ApiModelProperty( "Peak value over time" )
    PEAK
}
