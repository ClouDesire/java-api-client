package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ReportQuery
{
    @ApiModelProperty( "Query for finalized (in invoice) report lines only (default)" )
    FINAL,

    @ApiModelProperty( "Query for live pay-per-use report lines only" )
    LIVE,

    @ApiModelProperty( "Query for finalized report lines and live pay-per-use costs in selected timespan" )
    MERGED
}
