package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Objects;

public class CspAzureProductDTO extends CspProductDTO
{
    @Schema( description = "The publisher id of an Azure marketplace image")
    @NotEmpty
    private String azurePublisher;

    @Schema( description = "The offer id of an Azure marketplace image")
    @NotEmpty
    private String azureOffer;

    @Schema( description = "The sku of an Azure marketplace image")
    @NotEmpty
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        CspAzureProductDTO that = (CspAzureProductDTO) o;
        return Objects.equals( azurePublisher, that.azurePublisher ) && Objects.equals( azureOffer, that.azureOffer )
                && Objects.equals( azureSku, that.azureSku );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), azurePublisher, azureOffer, azureSku );
    }
}
