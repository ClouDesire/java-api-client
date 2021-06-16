package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class CloudProviderPatchDTO implements DTO
{
    @NotNull
    private Action action;

    public CloudProviderPatchDTO( Action action )
    {
        this.action = action;
    }

    public CloudProviderPatchDTO()
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
        @ApiModelProperty( "Enable a cloud provider" )
        ENABLE,

        @ApiModelProperty( "Disable a cloud provider" )
        DISABLE;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
