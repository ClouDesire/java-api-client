package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

public class BackupDTO extends BaseEntityDTO
{
    private Date date;

    private Integer size;

    private boolean completed;

    @Valid
    private List<UrlEntityDTO> appVersions;

    @Valid
    private UrlEntityDTO virtualMachineInstance;

    private byte[] hash;

    private Date deletion;

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public Integer getSize()
    {
        return size;
    }

    public void setSize( Integer size )
    {
        this.size = size;
    }

    public List<UrlEntityDTO> getAppVersions()
    {
        return appVersions;
    }

    public void setAppVersion( List<UrlEntityDTO> appVersion )
    {
        this.appVersions = appVersion;
    }

    public UrlEntityDTO getVirtualMachineInstance()
    {
        return virtualMachineInstance;
    }

    public void setVirtualMachineInstance( UrlEntityDTO virtualMachineInstance )
    {
        this.virtualMachineInstance = virtualMachineInstance;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted( boolean completed )
    {
        this.completed = completed;
    }

    public byte[] getHash()
    {
        return hash;
    }

    public void setHash( byte[] hash )
    {
        this.hash = hash;
    }

    public Date getDeletion()
    {
        return deletion;
    }

    public void setDeletion( Date deletion )
    {
        this.deletion = deletion;
    }
}
