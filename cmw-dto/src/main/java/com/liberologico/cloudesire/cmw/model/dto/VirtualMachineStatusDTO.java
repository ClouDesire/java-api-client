package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.VirtualMachineState;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class VirtualMachineStatusDTO extends BaseEntityDTO
{
    @Valid
    private UrlEntityDTO virtualMachineInstance;

    private String statusMessage;

    private String descriptiveMessage;

    private Integer progressPercentage;

    @NotNull
    private VirtualMachineState virtualMachineState = VirtualMachineState.NEWBORN;

    @NotNull
    private Date date = new Date();

    public UrlEntityDTO getVirtualMachineInstance()
    {
        return virtualMachineInstance;
    }

    public void setVirtualMachineInstance( UrlEntityDTO virtualMachineInstance )
    {
        this.virtualMachineInstance = virtualMachineInstance;
    }

    public String getStatusMessage()
    {
        return statusMessage;
    }

    public void setStatusMessage( String statusMessage )
    {
        this.statusMessage = statusMessage;
    }

    public String getDescriptiveMessage()
    {
        return descriptiveMessage;
    }

    public void setDescriptiveMessage( String descriptiveMessage )
    {
        this.descriptiveMessage = descriptiveMessage;
    }

    public Integer getProgressPercentage()
    {
        return progressPercentage;
    }

    public void setProgressPercentage( Integer progressPercentage )
    {
        this.progressPercentage = progressPercentage;
    }

    public VirtualMachineState getVirtualMachineState()
    {
        return virtualMachineState;
    }

    public void setVirtualMachineState( VirtualMachineState virtualMachineState )
    {
        this.virtualMachineState = virtualMachineState;
    }

    public Date getDate()
    {
        if ( this.date != null ) return (Date) this.date.clone();
        return null;
    }

    public void setDate( Date date )
    {
        if ( date != null ) this.date = (Date) date.clone();
        this.date = date;
    }
}
