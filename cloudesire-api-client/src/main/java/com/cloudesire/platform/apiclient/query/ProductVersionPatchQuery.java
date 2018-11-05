package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.enums.CouponConfiguration;

import java.math.BigDecimal;

public class ProductVersionPatchQuery extends BaseQuery
{
    private static final String PUBLISHED = "published";
    private static final String EXTERNAL_ID = "externalId";
    private static final String POSTCONFIGURATION = "postConfiguration";
    private static final String DESCRIPTION = "description";
    private static final String AUTORENEWABLE = "autoRenewable";
    private static final String NAME = "name";
    private static final String PRICE = "price";
    private static final String IDENTIFIER = "identifier";
    private static final String SELF_BILLING = "selfBilling";
    private static final String COUPON_CONFIGURATION = "couponConfiguration";

    public ProductVersionPatchQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public ProductVersionPatchQuery setPublished( Boolean value )
    {
        put( PUBLISHED, value );
        return this;
    }

    public ProductVersionPatchQuery setExternalId( String value )
    {
        put( EXTERNAL_ID, value );
        return this;
    }

    public ProductVersionPatchQuery setPostConfiguration( Boolean value )
    {
        put( POSTCONFIGURATION, value.toString() );
        return this;
    }

    public ProductVersionPatchQuery setDescription( String value )
    {
        put( DESCRIPTION, value );
        return this;
    }

    public ProductVersionPatchQuery setAutoRenewable( Boolean value )
    {
        put( AUTORENEWABLE, value );
        return this;
    }

    public ProductVersionPatchQuery setName( String value )
    {
        put( NAME, value );
        return this;
    }

    public ProductVersionPatchQuery setPrice( BigDecimal value )
    {
        put( PRICE, value );
        return this;
    }

    public ProductVersionPatchQuery setIdentifier( String value )
    {
        put( IDENTIFIER, value );
        return this;
    }

    public ProductVersionPatchQuery setSelfBilling( Boolean value )
    {
        put( SELF_BILLING, value.toString() );
        return this;
    }

    public ProductVersionPatchQuery setCouponConfiguration( CouponConfiguration value )
    {
        put( COUPON_CONFIGURATION, value );
        return this;
    }
}
