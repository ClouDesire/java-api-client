package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.constraints.NotNull;

public class UserCompanyGroupDTO extends NamedEntityDTO
{
    @NotNull
    private UrlEntityDTO userCompany;

    public UserCompanyGroupDTO( UrlEntityDTO userCompany, String name )
    {
        super( name );
        this.userCompany = userCompany;
    }

    public UserCompanyGroupDTO()
    {
    }

    public UrlEntityDTO getUserCompany()
    {
        return userCompany;
    }

    public void setUserCompany( UrlEntityDTO userCompany )
    {
        this.userCompany = userCompany;
    }
}
