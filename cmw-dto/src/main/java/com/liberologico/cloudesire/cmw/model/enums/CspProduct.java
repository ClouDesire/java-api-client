package com.liberologico.cloudesire.cmw.model.enums;

public enum CspProduct
{
    AZURE_MARKETPLACE( "azure" ),
    LICENSE_BASED( "license" );

    private final String type;

    CspProduct( String type )
    {
        this.type = type;
    }

    public static CspProduct getByType( String type )
    {
        if ( type == null ) throw new NullPointerException( "type is null" );

        for ( CspProduct productType : CspProduct.values() )
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
