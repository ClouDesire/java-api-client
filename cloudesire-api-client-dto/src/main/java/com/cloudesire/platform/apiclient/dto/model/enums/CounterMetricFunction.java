package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum CounterMetricFunction implements MetricFunction
{
    @Schema( description = "Increase value over time")
    INCREASE,

    @Schema( description = "Value over time minus previous")
    VALUE
}
