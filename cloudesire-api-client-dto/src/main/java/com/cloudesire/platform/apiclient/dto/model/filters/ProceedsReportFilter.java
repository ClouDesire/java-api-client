package com.cloudesire.platform.apiclient.dto.model.filters;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Set;

public class ProceedsReportFilter extends ReportFilter
{
    @Schema( description = "Filter by report line ID")
    private Integer id;

    @Schema( description = "Impersonate another role (admin only)")
    private UserRole role;

    @Schema( description = "Filter by Distributor ID")
    private Integer distributorId;

    @Schema( description = "Filter by Reseller ID")
    private Integer resellerId;

    @Schema( description = "Filter by vendor ID")
    private Integer companyId;

    @Schema( description = "Filter by Order type")
    private Set<OrderType> orderTypes;

    // region Getters & Setters
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public UserRole getRole()
    {
        return role;
    }

    public void setRole( UserRole role )
    {
        this.role = role;
    }

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

    public Set<OrderType> getOrderTypes()
    {
        return orderTypes;
    }

    public void setOrderTypes( Set<OrderType> orderTypes )
    {
        this.orderTypes = orderTypes;
    }
    // endregion
}
