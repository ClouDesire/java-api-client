package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "The cookbook category of a NodeRole" )
public enum CategoryType
{
    BASE,
    CUSTOM,
    DATABASE,
    STACK
}
