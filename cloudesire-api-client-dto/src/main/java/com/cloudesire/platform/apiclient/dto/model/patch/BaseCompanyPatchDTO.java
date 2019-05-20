package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@SuppressWarnings( "squid:S2637" )
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
