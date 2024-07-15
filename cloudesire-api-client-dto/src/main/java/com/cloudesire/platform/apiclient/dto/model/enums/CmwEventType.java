package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "The typology of the event" )
public enum CmwEventType
{
    CREATED, MODIFIED, DELETED
}
