package com.cloudesire.platform.apiclient.dto.model.enums;

public enum Grouping
{
    DAY_OF_MONTH( "day" ), MONTH( "month" );

    private final String field;

    Grouping( String field )
    {
        this.field = field;
    }

    public String getField()
    {
        return field;
    }
}
