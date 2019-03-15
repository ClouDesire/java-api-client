package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( description = "The typology of the event" )
public enum CmwEventType
{
    CREATED, MODIFIED, DELETED
}
