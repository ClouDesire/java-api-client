package com.liberologico.cloudesire.cmw.model.dto.body;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

public class UserPatch
{
    @ApiModelProperty( "Perform selected action" )
    private UserPatchAction action;

    @ApiModelProperty( "Enable user via provided email tag" )
    private String tag;

    @ApiModelProperty( "Switch user to language" )
    @Size( min = 2, max = 2 )
    private String language;

    public String getTag()
    {
        return tag;
    }

    public UserPatch setTag( String tag )
    {
        this.tag = tag;
        return this;
    }

    public UserPatchAction getAction()
    {
        return action;
    }

    public UserPatch setAction( UserPatchAction action )
    {
        this.action = action;
        return this;
    }

    public String getLanguage()
    {
        return language;
    }

    public UserPatch setLanguage( String language )
    {
        this.language = language;
        return this;
    }
}
