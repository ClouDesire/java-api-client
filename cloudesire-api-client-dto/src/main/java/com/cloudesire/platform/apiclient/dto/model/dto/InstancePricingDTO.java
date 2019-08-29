package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;
import com.liberologico.cloudesire.common.enums.OsFamily;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "Defines pricing of disk usage of a VM" )
public class InstancePricingDTO extends CloudPricingDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO instanceType;

    @ApiModelProperty( value = "Descriptive name of the pricing", hidden = true )
    @Deprecated
    @Size( max = 125, message = INVALID_SIZE )
    private String name;

    @ApiModelProperty( value = "RAM quantity", hidden = true )
    @Deprecated
    private Integer ram;

    @ApiModelProperty( value = "CPU Cores", hidden = true )
    @Deprecated
    private BigDecimal cpu;

    @ApiModelProperty( value = "Root disk space", hidden = true )
    @Deprecated
    private Integer diskSpace;

    @ApiModelProperty( "Operating system family" )
    private OsFamily osFamily;

    @ApiModelProperty( "Operating system" )
    private OSType operatingSystem;

    @ApiModelProperty( "Whether the pricing will not be linked to any Virtual Machine Configuration" )
    private Boolean deprecated;

    public UrlEntityDTO getInstanceType()
    {
        return instanceType;
    }

    public void setInstanceType( UrlEntityDTO instanceType )
    {
        this.instanceType = instanceType;
    }

    @Deprecated
    public String getName()
    {
        return name;
    }

    @Deprecated
    public void setName( String name )
    {
        this.name = name;
    }

    @Deprecated
    public Integer getRam()
    {
        return ram;
    }

    @Deprecated
    public void setRam( Integer ram )
    {
        this.ram = ram;
    }

    @Deprecated
    public BigDecimal getCpu()
    {
        return cpu;
    }

    @Deprecated
    public void setCpu( BigDecimal cpu )
    {
        this.cpu = cpu;
    }

    @Deprecated
    public Integer getDiskSpace()
    {
        return diskSpace;
    }

    @Deprecated
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        InstancePricingDTO that = (InstancePricingDTO) o;
        return ram.equals( that.ram ) && cpu.equals( that.cpu ) && Objects.equals( diskSpace, that.diskSpace )
                && osFamily == that.osFamily && operatingSystem == that.operatingSystem && Objects
                .equals( deprecated, that.deprecated );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), ram, cpu, diskSpace, osFamily, operatingSystem, deprecated );
    }
}
