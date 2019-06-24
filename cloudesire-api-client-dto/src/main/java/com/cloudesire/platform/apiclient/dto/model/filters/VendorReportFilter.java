package com.cloudesire.platform.apiclient.dto.model.filters;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;

import java.util.Map;

/**
 * @deprecated by {@link ProceedsReportFilter}
 */
@Deprecated
public class VendorReportFilter extends ReportFilter
{
    private Integer companyId;

    private OrderType type;

    public static VendorReportFilter by()
    {
        return new VendorReportFilter();
    }

    private VendorReportFilter()
    {
        super();
    }

    public VendorReportFilter company( int companyId )
    {
        this.companyId = companyId;
        return this;
    }

    public VendorReportFilter type( OrderType type )
    {
        this.type = type;
        return this;
    }

    @Override
    public Map<String, String> toMap()
    {
        Map<String, String> map = super.toMap();
        if ( companyId != null ) map.put( "companyId", companyId.toString() );
        if ( type != null ) map.put( "type", type.toString() );
        return map;
    }
}
