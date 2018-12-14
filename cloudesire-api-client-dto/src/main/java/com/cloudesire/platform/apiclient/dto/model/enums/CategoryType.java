package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( "The cookbook category of a NodeRole" )
public enum CategoryType
{
    BASE,
    CUSTOM,
    DATABASE,
    STACK
}
