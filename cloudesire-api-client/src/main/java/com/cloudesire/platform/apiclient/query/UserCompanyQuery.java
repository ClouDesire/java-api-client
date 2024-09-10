package com.cloudesire.platform.apiclient.query;

public class UserCompanyQuery extends BaseQuery
{
    public UserCompanyQuery search( SearchQuery search )
    {
        putAll( search );
        return this;
    }

    public UserCompanyQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
