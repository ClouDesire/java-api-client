package com.cloudesire.platform.apiclient.query;

public class UserQuery extends BaseQuery
{
    private static final String TEXT_FIELD = "textField";

    public UserQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public UserQuery setTextField( String textField )
    {
        put( TEXT_FIELD, textField );
        return this;
    }
}
