package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.BillingItemValueType;
import com.cloudesire.platform.apiclient.dto.model.enums.PropertyFilter;

public class BillingItemQuery extends PageRequestQuery
{
    private static final String IDENTIFIER = "identifier";
    private static final String VALUE_TYPE = "valueType";
    private static final String COMPANY_ID = "companyId";
    private static final String RESELLER = "reseller";
    private static final String API = "api";

    public BillingItemQuery identifier( String identifier )
    {
        put( IDENTIFIER, identifier );
        return this;
    }

    public BillingItemQuery valueType( BillingItemValueType valueType )
    {
        put( VALUE_TYPE, valueType );
        return this;
    }

    public BillingItemQuery companyId( int companyId )
    {
        put( COMPANY_ID, companyId );
        return this;
    }

    public BillingItemQuery reseller( String reseller )
    {
        put( RESELLER, reseller );
        return this;
    }

    public BillingItemQuery api( PropertyFilter filter )
    {
        put( API, filter );
        return this;
    }

    public BillingItemQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
