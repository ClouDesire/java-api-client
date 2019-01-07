package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

public class StackParameterDTO extends BaseStackParameterDTO
{
    @ApiModelProperty( value = "The node role name associated to the stack parameter", readOnly = true )
    private String nodeRole;

    public String getNodeRole()
    {
        return nodeRole;
    }

    public void setNodeRole( String nodeRole )
    {
        this.nodeRole = nodeRole;
    }
}
