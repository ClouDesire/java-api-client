package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProductType;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CspAzureProductDTO extends CspProductDTO
{
    @NotNull
    private String azurePublisher;

    @NotNull
    private String azureOffer;

    @NotNull
    private String azureSku;

    public CspAzureProductDTO( String name, String identifier, BigDecimal price, UrlEntityDTO company )
    {
        super( name, identifier, CspProductType.AZURE_MARKETPLACE, price, company );
    }

    public CspAzureProductDTO()
    {
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
