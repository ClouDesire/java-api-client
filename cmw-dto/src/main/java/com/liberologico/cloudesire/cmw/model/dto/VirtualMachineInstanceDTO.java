package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.BackupFrequency;
import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

public class VirtualMachineInstanceDTO extends NamedEntityDTO
{
    @Valid
    private UrlEntityDTO subscription;

    @ApiModelProperty("CPU cores current allocation (starting from 1.00)")
    private Double cpu;

    @ApiModelProperty( "Actual ram configuration, in MB")
    private Integer ram;

    @ApiModelProperty( "How often take automatic backups" )
    private BackupFrequency backupFrequency;

    private String publicIP;

    private String privateIP;

    private String diskSpace;

    @Valid
    private UrlEntityDTO cloudProvider;

    private String user;

    private String password;

    private List<ApplicationDTO> installation;

    private OSType operatingSystem;

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    public Double getCpu()
    {
        return cpu;
    }

    public void setCpu( Double cpu )
    {
        this.cpu = cpu;
    }

    public Integer getRam()
    {
        return ram;
    }

    public void setRam( Integer ram )
    {
        this.ram = ram;
    }

    public String getPublicIP()
    {
        return publicIP;
    }

    public void setPublicIP( String publicIP )
    {
        this.publicIP = publicIP;
    }

    public String getPrivateIP()
    {
        return privateIP;
    }

    public void setPrivateIP( String privateIP )
    {
        this.privateIP = privateIP;
    }

    public String getDiskSpace()
    {
        return diskSpace;
    }

    public void setDiskSpace( String diskSpace )
    {
        this.diskSpace = diskSpace;
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public BackupFrequency getBackupFrequency()
    {
        return backupFrequency;
    }

    public void setBackupFrequency( BackupFrequency backupFrequency )
    {
        this.backupFrequency = backupFrequency;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser( String user )
    {
        this.user = user;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public List<ApplicationDTO> getInstallation()
    {
        return installation;
    }

    public void setInstallation( List<ApplicationDTO> installation )
    {
        this.installation = installation;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof VirtualMachineInstanceDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        VirtualMachineInstanceDTO that = (VirtualMachineInstanceDTO) o;
        return Objects.equals( subscription, that.subscription ) && Objects.equals( cpu, that.cpu ) && Objects
                .equals( ram, that.ram ) && backupFrequency == that.backupFrequency && Objects
                .equals( publicIP, that.publicIP ) && Objects.equals( diskSpace, that.diskSpace ) && Objects
                .equals( cloudProvider, that.cloudProvider );
    }

    @Override
    public int hashCode()
    {
        return Objects
                .hash( super.hashCode(), subscription, cpu, ram, backupFrequency, publicIP, diskSpace, cloudProvider );
    }
}
