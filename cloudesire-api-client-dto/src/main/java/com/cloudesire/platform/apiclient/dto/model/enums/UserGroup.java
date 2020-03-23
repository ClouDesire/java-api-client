package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( description = "A generic way of applying labels and permissions to more than one user." )
public enum UserGroup
{
    SUPERMANAGER,
    MANAGEMENT,
    MARKETING,
    SALES,
    TECH
}
