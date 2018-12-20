package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class BaseCompanyPatchDTO extends DTO
{
    @NotNull
    private Action action;

    public BaseCompanyPatchDTO( Action action )
    {
        this.action = action;
    }

    public BaseCompanyPatchDTO()
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
        @ApiModelProperty( "Enable a company and all its employees" )
        ACTIVATION,

        @ApiModelProperty( "Disable a company and all its employees" )
        DEACTIVATION;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
