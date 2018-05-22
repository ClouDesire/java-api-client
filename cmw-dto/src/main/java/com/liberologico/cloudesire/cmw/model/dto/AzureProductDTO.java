package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.MicrosoftProduct;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;

public class AzureProductDTO extends ProductDTO
{

    public AzureProductDTO( String name, String identifier, MicrosoftProduct type )
    {
        super( name, identifier, ProductType.CSP );
        setMicrosoftProductType( type );
    }

    public AzureProductDTO()
    {
    }

}
