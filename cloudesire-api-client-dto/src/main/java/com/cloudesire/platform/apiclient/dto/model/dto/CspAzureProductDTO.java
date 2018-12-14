package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;

public class CspAzureProductDTO extends CspProductDTO
{
    @ApiModelProperty( "The publisher id of an Azure marketplace image" )
    @NotEmpty
    private String azurePublisher;

    @ApiModelProperty( "The offer id of an Azure marketplace image" )
    @NotEmpty
    private String azureOffer;

    @ApiModelProperty( "The sku of an Azure marketplace image" )
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
}
