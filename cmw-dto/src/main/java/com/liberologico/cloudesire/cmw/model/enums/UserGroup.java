package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( "A generic way of applying labels and permissions to more than one user." )
public enum UserGroup
{
    MANAGEMENT,
    MARKETING,
    SALES,
    TECH
}
