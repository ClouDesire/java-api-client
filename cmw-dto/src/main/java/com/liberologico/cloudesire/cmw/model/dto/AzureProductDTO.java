package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProduct;
import com.liberologico.cloudesire.cmw.model.enums.ProductType;

import java.math.BigDecimal;

public class AzureProductDTO extends ProductDTO
{
    private BigDecimal price;

    private String offerId;

    private String azurePublisher;

    private String azureOffer;

    private String azureSku;

    public AzureProductDTO( String name, String identifier, CspProduct type )
    {
        super( name, identifier, ProductType.CSP );
        setCspProductType( type );
    }

    public AzureProductDTO()
    {
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public String getOfferId()
    {
        return offerId;
    }

    public void setOfferId( String offerId )
    {
        this.offerId = offerId;
    }

    public String getAzurePublisher()
    {
        return azurePublisher;
    }

    public void setAzurePublisher( String azurePublisher )
    {
        this.azurePublisher = azurePublisher;
    }

    public String getAzureOffer()
    {
        return azureOffer;
    }

    public void setAzureOffer( String azureOffer )
    {
        this.azureOffer = azureOffer;
    }

    public String getAzureSku()
    {
        return azureSku;
    }

    public void setAzureSku( String azureSku )
    {
        this.azureSku = azureSku;
    }
}
