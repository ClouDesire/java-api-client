package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.UserRole;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class MailRequestDTO extends BaseEntityDTO
{
    @NotNull
    private String subject;

    @NotNull
    private String body;

    @Valid
    private UrlEntityDTO toUser;

    @Valid
    private UrlEntityDTO toCompany;

    private UserRole toGroup;

    public String getSubject()
    {
        return subject;
    }

    public void setSubject( String subject )
    {
        this.subject = subject;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody( String body )
    {
        this.body = body;
    }

    public UrlEntityDTO getToUser()
    {
        return toUser;
    }

    public void setToUser( UrlEntityDTO toUser )
    {
        this.toUser = toUser;
    }

    public UrlEntityDTO getToCompany()
    {
        return toCompany;
    }

    public void setToCompany( UrlEntityDTO toCompany )
    {
        this.toCompany = toCompany;
    }

    public UserRole getToGroup()
    {
        return toGroup;
    }

    public void setToGroup( UserRole toGroup )
    {
        this.toGroup = toGroup;
    }
}
