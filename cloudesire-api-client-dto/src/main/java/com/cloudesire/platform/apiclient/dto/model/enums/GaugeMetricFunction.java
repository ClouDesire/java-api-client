package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Function to apply for gauge metrics value retrieval" )
public enum GaugeMetricFunction
{
    @ApiModelProperty( "Average value over time (gauge)" )
    AVERAGE( "sum(avg_over_time(%s[%ds]))", false ),

    @ApiModelProperty( "Increase value over time (counter)" )
    INCREASE( "sum(increase(%s[%ds]))", true ),

    @ApiModelProperty( "Peak value over time (gauge)" )
    PEAK( "sum(max_over_time(%s[%ds]))", false ),

    @ApiModelProperty( "Value over time minus previous (counter)" )
    VALUE( "sum(%1$s) - sum(min_over_time(%1$s[%2$ds]))", true );

    private final String function;
    private final boolean counter;

    GaugeMetricFunction( String function, boolean counter )
    {
        this.function = function;
        this.counter = counter;
    }

    public String getFunction()
    {
        return function;
    }

    public boolean isCounter()
    {
        return counter;
    }
}
