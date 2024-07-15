package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "A generic way of applying labels and permissions to more than one user." )
public enum UserGroup
{
    MANAGEMENT,
    MARKETING,
    SALES,
    TECH
}
