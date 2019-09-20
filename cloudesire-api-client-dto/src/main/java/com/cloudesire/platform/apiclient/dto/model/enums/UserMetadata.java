package com.cloudesire.platform.apiclient.dto.model.enums;

public enum UserMetadata
{
    GEOCALL_ID( "Geocall_ID" );

    private final String key;

    UserMetadata( String key )
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return key;
    }
}
