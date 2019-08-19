package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ApplicationMetricType
{
    @ApiModelProperty( "If metric values should be fetched via API from an external system" ) EXTERNAL,
    @ApiModelProperty( "Metrics are natively harvested" ) PROMETHEUS
}
