package com.liberologico.cloudesire.cmw.model.dto.body;

import io.swagger.annotations.ApiModelProperty;

public enum UserPatchAction
{
    @ApiModelProperty( "Block user account" )
    BLOCK,

    @ApiModelProperty( "Unblock user account" )
    UNBLOCK,

    @ApiModelProperty( "Confirm email account as administator" )
    ACTIVATE,

    @ApiModelProperty( "Enable user account when manual approval is active" )
    APPROVE;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
