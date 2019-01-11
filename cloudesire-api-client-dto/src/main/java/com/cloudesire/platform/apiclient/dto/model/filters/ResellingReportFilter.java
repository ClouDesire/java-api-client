package com.cloudesire.platform.apiclient.dto.model.filters;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class ResellingReportFilter extends ReportFilter
{
    @ApiModelProperty( "Filter by Distributor ID" )
    private Integer distributorId;

    @ApiModelProperty( "Filter by Reseller ID" )
    private Integer resellerId;

    public static ResellingReportFilter by()
    {
        return new ResellingReportFilter();
    }

    private ResellingReportFilter()
    {
        super();
    }

    // region Builder
    public ResellingReportFilter distributor( int distributorId )
    {
        this.distributorId = distributorId;
        return this;
    }

    public ResellingReportFilter reseller( int resellerId )
    {
        this.resellerId = resellerId;
        return this;
    }
    // endregion

    @Override
    public Map<String, String> toMap()
    {
        Map<String, String> map = super.toMap();
        if ( distributorId != null ) map.put( "distributorId", distributorId.toString() );
        if ( resellerId != null ) map.put( "resellerId", resellerId.toString() );
        return map;
    }

    // region Getters & Setters
    public Integer getDistributorId()
    {
        return distributorId;
    }

    public void setDistributorId( Integer distributorId )
    {
        this.distributorId = distributorId;
    }

    public Integer getResellerId()
    {
        return resellerId;
    }

    public void setResellerId( Integer resellerId )
    {
        this.resellerId = resellerId;
    }
    // endregion
}