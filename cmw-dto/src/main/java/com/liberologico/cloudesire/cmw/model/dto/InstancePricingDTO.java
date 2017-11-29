package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.enums.OsFamily;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class InstancePricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @NotNull
    private BigDecimal price;

    @NotNull
    private Integer ram;

    @NotNull
    private BigDecimal cpu;

    @NotNull
    private OsFamily osFamily = OsFamily.LINUX;

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

    public Integer getRam()
    {
        return ram;
    }

    public void setRam( Integer ram )
    {
        this.ram = ram;
    }

    public BigDecimal getCpu()
    {
        return cpu;
    }

    public void setCpu( BigDecimal cpu )
    {
        this.cpu = cpu;
    }

    public OsFamily getOsFamily()
    {
        return osFamily;
    }

    public void setOsFamily( OsFamily osFamily )
    {
        this.osFamily = osFamily;
    }
}
