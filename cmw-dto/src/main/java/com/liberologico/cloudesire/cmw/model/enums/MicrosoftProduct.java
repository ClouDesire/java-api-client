package com.liberologico.cloudesire.cmw.model.enums;

public enum MicrosoftProduct
{
    AZURE_MARKETPLACE( "azure" ),
    LICENSE_BASED( "license" );

    private final String type;

    MicrosoftProduct( String type )
    {
        this.type = type;
    }

    public static MicrosoftProduct getByType( String type )
    {
        if ( type == null ) throw new NullPointerException( "type is null" );

        for ( MicrosoftProduct productType : MicrosoftProduct.values() )
        {
            if ( productType.type.equals( type ) ) return productType;
        }

        throw new IllegalArgumentException( "No product type " + type );
    }

    @Override
    public String toString()
    {
        return type;
    }
}
