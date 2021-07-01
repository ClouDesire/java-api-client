package com.cloudesire.platform.apiclient.dto.model.enums;

public enum UserMetadata
{
    GEOCALL_ID( "Geocall_ID" ),
    GEOCALL_REQUESTER_ID( "Geocall_requester_ID" ),
    UX_INVOICE_TOGGLE( "ux-invoice-toggle" );

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
