package com.liberologico.cloudesire.cmw.model.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class InstanceTypeDTO extends DTO
{
    @NotNull
    private Integer ram;

    @NotNull
    private BigDecimal cpu;

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
        return "InstanceTypeDTO{" + "ram=" + ram + ", cpu=" + cpu + "} " + super.toString();
    }
}
