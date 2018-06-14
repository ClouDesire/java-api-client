package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( "The cookbook category of a NodeRole" )
public enum CategoryType
{
    BASE,
    CUSTOM,
    DATABASE,
    STACK
}
