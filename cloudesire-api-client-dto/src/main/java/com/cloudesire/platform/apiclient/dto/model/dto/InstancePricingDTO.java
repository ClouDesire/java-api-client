package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;
import com.liberologico.cloudesire.common.enums.OsFamily;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "Defines pricing of disk usage of a VM" )
public class InstancePricingDTO extends CloudPricingDTO
{
    @ApiModelProperty( "Descriptive name of the pricing" )
    @NotEmpty
    @Size( max = 125, message = INVALID_SIZE )
    private String name;

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

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
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
