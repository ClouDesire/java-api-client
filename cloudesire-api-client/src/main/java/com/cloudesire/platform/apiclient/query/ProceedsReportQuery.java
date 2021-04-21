package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Map;

public class ProceedsReportQuery extends PageRequestQuery
{
    private static final String ID = "id";
    private static final String ROLE = "role";
    private static final String DISTRIBUTOR_ID = "distributorId";
    private static final String RESELLER_ID = "resellerId";
    private static final String COMPANY_ID = "companyId";
    private static final String PRODUCT_ID = "productId";
    private static final String PRODUCT_VERSION_ID = "productVersionId";
    private static final String FROM = "from";
    private static final String TO = "to";
    private static final String ORDER_TYPES = "orderTypes";

    public ProceedsReportQuery( Map<? extends String, ?> m )
    {
        super( m );
    }

    public ProceedsReportQuery()
    {
    }

    public ProceedsReportQuery id( int id )
    {
        put( ID, id );
        return this;
    }

    public ProceedsReportQuery role( UserRole role )
    {
        put( ROLE, role );
        return this;
    }

    public ProceedsReportQuery distributor( int distributorId )
    {
        put( DISTRIBUTOR_ID, distributorId );
        return this;
    }

    public ProceedsReportQuery reseller( int resellerId )
    {
        put( RESELLER_ID, resellerId );
        return this;
    }

    public ProceedsReportQuery company( Integer comanyId )
    {
        put( COMPANY_ID, comanyId );
        return this;
    }
    public ProceedsReportQuery product( int productId )
    {
        put( PRODUCT_ID, productId );
        return this;
    }

    public ProceedsReportQuery productVersion( int productVersionId )
    {
        put( PRODUCT_VERSION_ID, productVersionId );
        return this;
    }

    public ProceedsReportQuery from( Date from )
    {
        put( FROM, SimpleDateFormatFactory.dateTimeFormat().format( from ) );
        return this;
    }

    public ProceedsReportQuery to( Date to )
    {
        put( TO, SimpleDateFormatFactory.dateTimeFormat().format( to ) );
        return this;
    }

    public ProceedsReportQuery orderTypes( OrderType... types )
    {
        put( ORDER_TYPES, StringUtils.join( types, ',' ) );
        return this;
    }

    public ProceedsReportQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
