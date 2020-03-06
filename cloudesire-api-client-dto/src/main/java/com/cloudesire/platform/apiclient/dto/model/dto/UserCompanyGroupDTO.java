package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class UserCompanyGroupDTO extends NamedEntityDTO
{
    @NotNull
    private UrlEntityDTO userCompany;

    @ApiModelProperty( "An identifier for the group" )
    @NotEmpty
    @Size( max = 125 )
    private String identifier;

    public UserCompanyGroupDTO( UrlEntityDTO userCompany, String name, String identifier )
    {
        super( name );
        this.userCompany = userCompany;
        this.identifier = identifier;
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

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        UserCompanyGroupDTO that = (UserCompanyGroupDTO) o;
        return Objects.equals( userCompany, that.userCompany ) && Objects.equals( identifier, that.identifier );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), userCompany, identifier );
    }
}
