package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ReportQuery
{
    @ApiModelProperty( "Query for finalized (in invoice) report lines only (default)" )
    FINAL,

    @ApiModelProperty( "Query for live pay-per-use report lines only" )
    LIVE,

    @ApiModelProperty( "Query for finalized lines and aggregated pay-per-use costs" )
    AGGREGATE
}
