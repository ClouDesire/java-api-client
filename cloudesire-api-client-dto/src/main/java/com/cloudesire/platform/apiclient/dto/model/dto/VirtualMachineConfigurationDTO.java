package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
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
    @Valid
    private UrlEntityDTO instancePricing;

    @ApiModelProperty( value = "CPU cores", hidden = true )
    @Min( 1 )
    @Max( 128 )
    private BigDecimal cpu;

    @ApiModelProperty( value = "Memory available, in MB", hidden = true )
    @Min( 1024 )
    private Integer ram;

    @ApiModelProperty( "Minimum additional disk space for user data, in GB" )
    @NotNull
    @Min( 0 )
    private Integer diskSpace;

    @Valid
    private Set<UrlEntityDTO> productVersions;

    @Valid
    private List<UrlEntityDTO> applicationFile = new ArrayList<>();

    @Valid
    private List<UrlEntityDTO> stableApplications = new ArrayList<>();

    @Valid
    private List<UrlEntityDTO> latestApplications = new ArrayList<>();

    @ApiModelProperty( "GPU support" )
    private boolean gpu = false;

    private OSType osType;

    // region Auto-generated code
    public UrlEntityDTO getInstancePricing()
    {
        return instancePricing;
    }

    public void setInstancePricing( UrlEntityDTO instancePricing )
    {
        this.instancePricing = instancePricing;
    }

    public BigDecimal getCpu()
    {
        return cpu;
    }

    @Deprecated
    public void setCpu( BigDecimal cpu )
    {
        this.cpu = cpu;
    }

    public Integer getRam()
    {
        return ram;
    }

    @Deprecated
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

    /**
     * @deprecated use {@link #getStableApplications()}
     */
    @Deprecated
    public List<UrlEntityDTO> getActiveApplicationFile()
    {
        return getStableApplications();
    }

    /**
     * @deprecated use {@link #setStableApplications(List)}
     */
    @Deprecated
    public void setActiveApplicationFile( List<UrlEntityDTO> activeApplicationFile )
    {
        setStableApplications( activeApplicationFile );
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
