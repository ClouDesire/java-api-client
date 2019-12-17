package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.VirtualMachineState;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        VirtualMachineStatusDTO that = (VirtualMachineStatusDTO) o;
        return Objects.equals( virtualMachineInstance, that.virtualMachineInstance ) && Objects
                .equals( statusMessage, that.statusMessage ) && Objects
                .equals( descriptiveMessage, that.descriptiveMessage ) && Objects
                .equals( progressPercentage, that.progressPercentage )
                && virtualMachineState == that.virtualMachineState && date.equals( that.date );
    }

    @Override
    public int hashCode()
    {
        return Objects
                .hash( super.hashCode(), virtualMachineInstance, statusMessage, descriptiveMessage, progressPercentage,
                        virtualMachineState, date );
    }
}
