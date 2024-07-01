package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;

public class BaseCompanyPatchDTO implements DTO
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
        @Schema( description = "Enable a company and all its employees")
        ACTIVATION,

        @Schema( description = "Disable a company and all its employees")
        DEACTIVATION;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }
}
