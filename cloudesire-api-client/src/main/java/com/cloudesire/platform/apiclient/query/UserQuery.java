package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;

public class UserQuery extends BaseQuery
{
    private static final String COMPANY_ID = "companyId";
    private static final String ROLE = "role";
    private static final String DISABLED = "disabled";
    private static final String EXTERNAL_AUTHENTICATION = "externalAuthentication";

    public UserQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public UserQuery search( SearchQuery query )
    {
        putAll( query );
        return this;
    }

    public UserQuery setCompanyId( Integer companyId )
    {
        put( COMPANY_ID, companyId );
        return this;
    }

    public UserQuery setRole( UserRole role )
    {
        put( ROLE, role );
        return this;
    }

    public UserQuery setDisabled( Boolean disabled )
    {
        put( DISABLED, disabled );
        return this;
    }

    public UserQuery setExternalAuthentication( Boolean externalAuthentication )
    {
        put( EXTERNAL_AUTHENTICATION, externalAuthentication );
        return this;
    }
}
