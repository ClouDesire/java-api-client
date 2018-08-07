package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class VirtualMachineConfigurationDTO extends NamedEntityDTO
{
    @NotNull
    private BigDecimal cpu;

    // Initial ram configuration, in MB.
    @NotNull
    private Integer ram;

    // In GB, Predefined disk space to be allocated as user data
    @Min( 0 )
    @NotNull
    private Integer diskSpace;

    @Valid
    private Set<UrlEntityDTO> productVersions;

    @Valid
    private List<UrlEntityDTO> applicationFile = new ArrayList<>();

    @Valid
    private List<UrlEntityDTO> stableApplications = new ArrayList<>();

    @Valid
    private List<UrlEntityDTO> latestApplications = new ArrayList<>();

    private boolean gpu = false;

    private OSType osType = OSType.UBUNTU_12_04;

    // region Auto-generated code
    public BigDecimal getCpu()
    {
        return cpu;
    }

    public void setCpu( BigDecimal cpu )
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

    public Integer getDiskSpace()
    {
        return diskSpace;
    }

    public void setDiskSpace( Integer diskSpace )
    {
        this.diskSpace = diskSpace;
    }

    public Set<UrlEntityDTO> getProductVersions()
    {
        return productVersions;
    }

    public void setProductVersions( Set<UrlEntityDTO> productVersions )
    {
        this.productVersions = productVersions;
    }

    public List<UrlEntityDTO> getApplicationFile()
    {
        return applicationFile;
    }

    public void setApplicationFile( List<UrlEntityDTO> applicationFile )
    {
        this.applicationFile = applicationFile;
    }

    public boolean isGpu()
    {
        return gpu;
    }

    public void setGpu( boolean gpu )
    {
        this.gpu = gpu;
    }

    public OSType getOsType()
    {
        return osType;
    }

    public void setOsType( OSType osType )
    {
        this.osType = osType;
    }

    @Deprecated
    public List<UrlEntityDTO> getActiveApplicationFile()
    {
        return stableApplications;
    }

    @Deprecated
    public void setActiveApplicationFile( List<UrlEntityDTO> activeApplicationFile )
    {
        this.stableApplications = activeApplicationFile;
    }

    public List<UrlEntityDTO> getStableApplications()
    {
        return stableApplications;
    }

    public void setStableApplications( List<UrlEntityDTO> stableApplications )
    {
        this.stableApplications = stableApplications;
    }

    public List<UrlEntityDTO> getLatestApplications()
    {
        return latestApplications;
    }

    public void setLatestApplications( List<UrlEntityDTO> latestApplications )
    {
        this.latestApplications = latestApplications;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        VirtualMachineConfigurationDTO that = (VirtualMachineConfigurationDTO) o;
        return Objects.equals( cpu, that.cpu ) && Objects.equals( ram, that.ram ) && Objects
                .equals( diskSpace, that.diskSpace );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), cpu, ram, diskSpace );
    }
    // endregion
}
