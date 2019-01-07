package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ProviderCredentialDTO extends BaseEntityDTO
{
    @NotNull
    @NotEmpty
    private String login;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String password;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String account = null;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String key = null;

    private String apiEndpoint = null;

    @Valid
    private UrlEntityDTO company;

    @NotNull
    @Valid
    private UrlEntityDTO provider;

    public String getLogin()
    {
        return login;
    }

    public void setLogin( String login )
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount( String account )
    {
        this.account = account;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey( String key )
    {
        this.key = key;
    }

    public String getApiEndpoint()
    {
        return apiEndpoint;
    }

    public void setApiEndpoint( String apiEndpoint )
    {
        this.apiEndpoint = apiEndpoint;
    }

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    public UrlEntityDTO getProvider()
    {
        return provider;
    }

    public void setProvider( UrlEntityDTO provider )
    {
        this.provider = provider;
    }
}
