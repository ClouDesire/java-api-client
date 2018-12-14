package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel( "VM instance sizing" )
public class InstanceTypeDTO extends DTO
{
    @ApiModelProperty( "RAM quantity" )
    @NotNull
    private Integer ram;

    @ApiModelProperty( "CPU cores" )
    @NotNull
    private BigDecimal cpu;

    @ApiModelProperty( "Root disk space" )
    private Integer diskSpace;

    public InstanceTypeDTO( Integer ram, BigDecimal cpu, Integer diskSpace )
    {
        this.ram = ram;
        this.cpu = cpu;
        this.diskSpace = diskSpace;
    }

    public InstanceTypeDTO()
    {
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

    @Override
    public String toString()
    {
        return "InstanceTypeDTO{" + "ram=" + ram + ", cpu=" + cpu + "}";
    }
}
