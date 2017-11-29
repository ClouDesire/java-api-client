package com.liberologico.cloudesire.cmw.model.enums;

public enum OrderingType
{
    PUBLISHED,
    RECOMMENDED( "weight", SortDirection.ASC ),
    TOPSOLD( "sold" ),
    TOPTRIED( "tried" );

    private final String field;

    private SortDirection direction = SortDirection.DESC;

    OrderingType( String field, SortDirection direction )
    {
        this( field );
        this.direction = direction;
    }

    OrderingType( String field )
    {
        this.field = field;
    }

    OrderingType()
    {
        field = this.name().toLowerCase();
    }

    public String getField()
    {
        return this.field;
    }

    public String getDirection()
    {
        return direction.toString();
    }
}
