package com.cloudesire.platform.apiclient.dto.model.filters;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class ProceedsReportFilter extends ReportFilter
{
    @ApiModelProperty( "Filter by Distributor ID" )
    private Integer distributorId;

    @ApiModelProperty( "Filter by Reseller ID" )
    private Integer resellerId;

    @ApiModelProperty( "Filter by vendor ID" )
    private Integer companyId;

    public static ProceedsReportFilter by()
    {
        return new ProceedsReportFilter();
    }

    private ProceedsReportFilter()
    {
        super();
    }

    // region Builder
    public ProceedsReportFilter distributor( int distributorId )
    {
        this.distributorId = distributorId;
        return this;
    }

    public ProceedsReportFilter reseller( int resellerId )
    {
        this.resellerId = resellerId;
        return this;
    }

    public ProceedsReportFilter company( Integer comanyId )
    {
        this.companyId = comanyId;
        return this;
    }
    // endregion

    @Override
    public Map<String, String> toMap()
    {
        Map<String, String> map = super.toMap();
        if ( distributorId != null ) map.put( "distributorId", distributorId.toString() );
        if ( resellerId != null ) map.put( "resellerId", resellerId.toString() );
        if ( companyId != null ) map.put( "companyId", companyId.toString() );
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

    public Integer getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId( Integer companyId )
    {
        this.companyId = companyId;
    }
    // endregion
}
