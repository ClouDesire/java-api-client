package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

public class UserPatchDTO extends DTO
{
    private Action action;

    private String tag;

    private Boolean activated;

    public UserPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction( Action action )
    {
        this.action = action;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }

    public Boolean getActivated()
    {
        return activated;
    }

    public void setActivated( Boolean activated )
    {
        this.activated = activated;
    }

    public enum Action
    {
        @ApiModelProperty( "Disable user - admin only" )
        BLOCK,

        @ApiModelProperty( "Enable user - admin only" )
        UNBLOCK,

        @ApiModelProperty( "Activate user - admin and vendor only" )
        ACTIVATE,

        @ApiModelProperty( "Approve user (if vendor approval is enabled) - admin and supervisor only" )
        APPROVE;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
