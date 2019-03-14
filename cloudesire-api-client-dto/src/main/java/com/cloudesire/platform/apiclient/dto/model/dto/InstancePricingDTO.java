package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;
import com.liberologico.cloudesire.common.enums.OsFamily;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel( description = "Defines pricing of disk usage of a VM" )
public class InstancePricingDTO extends BaseEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( "Chosen price" )
    @NotNull
    private BigDecimal price;

    @ApiModelProperty( "RAM quantity" )
    @NotNull
    private Integer ram;

    @ApiModelProperty( "CPU Cores" )
    @NotNull
    private BigDecimal cpu;

    @ApiModelProperty( "Root disk space" )
    private Integer diskSpace;

    @ApiModelProperty( "Operating system family" )
    private OsFamily osFamily;

    @ApiModelProperty( "Operating system" )
    private OSType operatingSystem;

    @ApiModelProperty( "Whether the pricing will not be linked to any Virtual Machine Configuration" )
    private Boolean deprecated;

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

    public Integer getDiskSpace()
    {
        return diskSpace;
    }

    public void setDiskSpace( Integer diskSpace )
    {
        this.diskSpace = diskSpace;
    }

    public OsFamily getOsFamily()
    {
        return osFamily;
    }

    public void setOsFamily( OsFamily osFamily )
    {
        this.osFamily = osFamily;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    public Boolean getDeprecated()
    {
        return deprecated;
    }

    public void setDeprecated( Boolean deprecated )
    {
        this.deprecated = deprecated;
    }
}
