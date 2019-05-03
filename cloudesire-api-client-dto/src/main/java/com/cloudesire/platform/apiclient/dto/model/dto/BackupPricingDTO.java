package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel( description = "Defines pricing of a backup of a VM" )
public class BackupPricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( "Chosen price" )
    @NotNull
    private BigDecimal price;

    public BackupPricingDTO( @NotNull UrlEntityDTO cloudProvider, @NotNull BigDecimal price )
    {
        this.cloudProvider = cloudProvider;
        this.price = price;
    }

    public BackupPricingDTO()
    {
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }
}
