package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class InstancePricingPatchDTO extends PricingPatchDTO
{
    @Schema( description = "Unlink the Instance Pricing from any Virtual Machine Configuration")
    private Boolean deprecated;

    @Schema( description = "Change associated diskSpace")
    private Integer diskSpace;

    public InstancePricingPatchDTO( @NotNull BigDecimal price )
    {
        super( price );
    }

    public InstancePricingPatchDTO()
    {
    }

    public Boolean getDeprecated()
    {
        return deprecated;
    }

    public InstancePricingPatchDTO setDeprecated( Boolean deprecated )
    {
        this.deprecated = deprecated;
        return this;
    }

    public Integer getDiskSpace()
    {
        return diskSpace;
    }

    public InstancePricingPatchDTO setDiskSpace( Integer diskSpace )
    {
        this.diskSpace = diskSpace;
        return this;
    }
}
