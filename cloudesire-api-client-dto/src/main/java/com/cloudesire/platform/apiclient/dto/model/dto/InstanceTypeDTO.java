package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( description = "VM instance sizing" )
public class InstanceTypeDTO extends NamedEntityDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO cloudProvider;

    @ApiModelProperty( "RAM quantity" )
    @NotNull
    private Integer ram;

    @ApiModelProperty( "CPU cores" )
    @NotNull
    private BigDecimal cpu;

    @ApiModelProperty( "Root disk space" )
    @NotNull
    private Integer rootDiskSpace;

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
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

    public Integer getRootDiskSpace()
    {
        return rootDiskSpace;
    }

    public void setRootDiskSpace( Integer rootDiskSpace )
    {
        this.rootDiskSpace = rootDiskSpace;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        InstanceTypeDTO that = (InstanceTypeDTO) o;
        return Objects.equals( cloudProvider, that.cloudProvider ) && Objects.equals( ram, that.ram ) && Objects
                .equals( cpu, that.cpu ) && Objects.equals( rootDiskSpace, that.rootDiskSpace );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cloudProvider, ram, cpu, rootDiskSpace );
    }

    @Override
    public String toString()
    {
        return "InstanceTypeDTO{" + "ram=" + ram + ", cpu=" + cpu + "}";
    }
}
