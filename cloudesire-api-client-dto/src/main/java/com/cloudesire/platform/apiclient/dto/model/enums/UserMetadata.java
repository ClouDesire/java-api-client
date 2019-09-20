package com.cloudesire.platform.apiclient.dto.model.enums;

public enum UserMetadata
{
    GEOCALL_ID( "Geocall_ID" ),
    SIAL_ID;

    private final String key;

    UserMetadata( String key )
    {
        this.key = key;
    }

    UserMetadata()
    {
        this( null );
    }

    @Override
    public String toString()
    {
        if ( key == null ) return super.toString();

        return key;
    }
}
