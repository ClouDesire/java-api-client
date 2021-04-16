package com.cloudesire.platform.apiclient.query;

public class CartQuery extends BaseQuery
{
    private static final String CUSTOMER = "customerId";
    private static final String RESELLER = "resellerId";
    private static final String CHECKED_OUT = "checkedOut";

    public CartQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public CartQuery setCustomerId( int customerId )
    {
        put( CUSTOMER, customerId );
        return this;
    }

    public CartQuery setResellerId( int resellerId )
    {
        put( RESELLER, resellerId );
        return this;
    }

    public CartQuery setCheckedOut( boolean checkedOut )
    {
        put( CHECKED_OUT, checkedOut );
        return this;
    }
}
