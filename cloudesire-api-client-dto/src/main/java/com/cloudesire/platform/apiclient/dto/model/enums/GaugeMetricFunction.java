package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum GaugeMetricFunction implements MetricFunction
{
    @Schema( description = "Average value over time")
    AVERAGE,

    @Schema( description = "Peak value over time")
    PEAK
}
