package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

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
        put( FROM, SimpleDateFormatFactory.dateFormat().format( from ) );
        return this;
    }

    public ProceedsReportQuery to( Date to )
    {
        put( TO, SimpleDateFormatFactory.dateFormat().format( to ) );
        return this;
    }

    public ProceedsReportQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
