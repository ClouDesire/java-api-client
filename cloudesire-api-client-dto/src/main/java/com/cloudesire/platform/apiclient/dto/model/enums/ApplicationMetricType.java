package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum ApplicationMetricType
{
    @Schema( description = "If metric values should be fetched via API from an external system") EXTERNAL,
    @Schema( description = "Metrics are natively harvested") PROMETHEUS
}
