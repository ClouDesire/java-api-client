package com.liberologico.cloudesire.cmw.model.dto;

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

    public InstanceTypeDTO( Integer ram, BigDecimal cpu )
    {
        this.ram = ram;
        this.cpu = cpu;
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

    @Override
    public String toString()
    {
        return "InstanceTypeDTO{" + "ram=" + ram + ", cpu=" + cpu + "}";
    }
}
