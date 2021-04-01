package com.cloudesire.platform.apiclient.query;

public class CloudCredentialQuery extends BaseQuery
{
    private static final String PROVIDER = "providerId";
    private static final String SUBSCRIPTION = "subscriptionId";
    private static final String USER = "userId";
    private static final String USER_COMPANY = "userCompanyId";

    public CloudCredentialQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public CloudCredentialQuery setProviderId( int providerId )
    {
        put( PROVIDER, providerId );
        return this;
    }

    public CloudCredentialQuery setSubscriptionId( int subscriptionId )
    {
        put( SUBSCRIPTION, subscriptionId );
        return this;
    }

    public CloudCredentialQuery setUserId( int userId )
    {
        put( USER, userId );
        return this;
    }

    public CloudCredentialQuery setUserCompanyId( int userCompanyId )
    {
        put( USER_COMPANY, userCompanyId );
        return this;
    }
}
