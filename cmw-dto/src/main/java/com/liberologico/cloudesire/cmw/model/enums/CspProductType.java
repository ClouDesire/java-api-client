package com.liberologico.cloudesire.cmw.model.enums;

import io.swagger.annotations.ApiModel;

@ApiModel( "Type of CSP product" )
public enum CspProductType
{
    ARM_TEMPLATE( "arm" ),
    AZURE_MARKETPLACE( "azure" ),
    LICENSE_BASED( "license" );

    private final String type;

    CspProductType( String type )
    {
        this.type = type;
    }

    public static CspProductType getByType( String type )
    {
        if ( type == null ) throw new NullPointerException( "type is null" );

        for ( CspProductType productType : CspProductType.values() )
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
