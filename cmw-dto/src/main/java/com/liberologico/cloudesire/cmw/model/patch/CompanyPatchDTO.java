package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.CompanyDTO;
import io.swagger.annotations.ApiModelProperty;

public class CompanyPatchDTO extends CompanyDTO
{
    private Action action;

    public CompanyPatchDTO()
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

    public enum Action
    {
        @ApiModelProperty( "Set all company products as published - admin only" )
        ACTIVATION,

        @ApiModelProperty( "Set all company products as unpublished" )
        DEACTIVATION,

        @ApiModelProperty( "Manually validate company tax code - admin only" )
        VALIDATE;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
