package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

public enum ReportQuery
{
    @Schema( description = "Query for finalized (in invoice) report lines only (default)")
    FINAL,

    @Schema( description = "Query for live pay-per-use report lines only")
    LIVE,

    @Schema( description = "Query for finalized report lines and live pay-per-use costs in selected timespan")
    MERGED
}
