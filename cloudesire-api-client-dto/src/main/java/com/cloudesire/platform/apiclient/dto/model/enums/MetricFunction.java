package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Function to apply for metrics value retrieval" )
public enum MetricFunction
{
    @ApiModelProperty( "Average value over time (gauge)" )
    AVERAGE,

    @ApiModelProperty( "Increase value over time (counter)" )
    INCREASE,

    @ApiModelProperty( "Peak value over time (gauge)" )
    PEAK,

    @ApiModelProperty( "Value over time minus previous (counter)" )
    VALUE
}
