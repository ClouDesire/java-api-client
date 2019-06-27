package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel( description = "Defines pricing of a backup of a VM" )
public class BackupPricingDTO extends CloudPricingDTO
{
    public BackupPricingDTO( @NotNull UrlEntityDTO cloudProvider, @NotNull BigDecimal price )
    {
        super( cloudProvider, price );
    }

    public BackupPricingDTO()
    {
        super();
    }
}
