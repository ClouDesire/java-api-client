package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class SingleInstancePricingPatchDTO extends PricingPatchDTO
{
    @ApiModelProperty( "Unlink the Instance Pricing from any Virtual Machine Configuration" )
    private Boolean deprecated;

    @ApiModelProperty( "Change associated diskSpace" )
    private Integer diskSpace;

    public SingleInstancePricingPatchDTO( @NotNull Boolean deprecated )
    {
        this.deprecated = deprecated;
    }

    public SingleInstancePricingPatchDTO( @NotNull BigDecimal price )
    {
        super( price );
    }

    public SingleInstancePricingPatchDTO()
    {
    }

    public Boolean getDeprecated()
    {
        return deprecated;
    }

    public void setDeprecated( Boolean deprecated )
    {
        this.deprecated = deprecated;
    }

    public Integer getDiskSpace()
    {
        return diskSpace;
    }

    public void setDiskSpace( Integer diskSpace )
    {
        this.diskSpace = diskSpace;
    }
}
