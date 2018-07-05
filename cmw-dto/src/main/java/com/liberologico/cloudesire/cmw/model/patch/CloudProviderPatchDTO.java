package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class CloudProviderPatchDTO extends DTO
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
