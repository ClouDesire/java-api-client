package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.liberologico.cloudesire.common.enums.OSType;
import com.liberologico.cloudesire.common.enums.OsFamily;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "Defines pricing of disk usage of a VM" )
public class InstancePricingDTO extends CloudPricingDTO
{
    @NotNull
    @Valid
    private UrlEntityDTO instanceType;

    @ApiModelProperty( value = "Descriptive name of the pricing", hidden = true )
    @Size( max = 125, message = INVALID_SIZE )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20190902 )
    private String name;

    @ApiModelProperty( value = "RAM quantity", hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20190902 )
    private Integer ram;

    @ApiModelProperty( value = "CPU Cores", hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20190902 )
    private BigDecimal cpu;

    @ApiModelProperty( value = "Root disk space", hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20190902 )
    private Integer diskSpace;

    @ApiModelProperty( "Operating system family" )
    private OsFamily osFamily;

    @ApiModelProperty( "Operating system" )
    private OSType operatingSystem;

    @ApiModelProperty( "Whether the pricing will not be linked to any Virtual Machine Configuration" )
    private Boolean deprecated;

    @ApiModelProperty( "Configure pricing according to order minimum duration" )
    @Valid
    private Map<Integer, ReservedCloudPricingDTO> reservedCloudPricing;

    public UrlEntityDTO getInstanceType()
    {
        return instanceType;
    }

    public void setInstanceType( UrlEntityDTO instanceType )
    {
        this.instanceType = instanceType;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public String getName()
    {
        return name;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public Integer getRam()
    {
        return ram;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public void setRam( Integer ram )
    {
        this.ram = ram;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public BigDecimal getCpu()
    {
        return cpu;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public void setCpu( BigDecimal cpu )
    {
        this.cpu = cpu;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public Integer getDiskSpace()
    {
        return diskSpace;
    }

    /**
     * @deprecated by {@link InstanceTypeDTO}
     */
    @Deprecated
    public void setDiskSpace( Integer diskSpace )
    {
        this.diskSpace = diskSpace;
    }

    public OsFamily getOsFamily()
    {
        return osFamily;
    }

    public void setOsFamily( OsFamily osFamily )
    {
        this.osFamily = osFamily;
    }

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    public Boolean getDeprecated()
    {
        return deprecated;
    }

    public void setDeprecated( Boolean deprecated )
    {
        this.deprecated = deprecated;
    }

    public Map<Integer, ReservedCloudPricingDTO> getReservedCloudPricing()
    {
        return reservedCloudPricing;
    }

    public void setReservedCloudPricing( Map<Integer, ReservedCloudPricingDTO> reservedCloudPricing )
    {
        this.reservedCloudPricing = reservedCloudPricing;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        InstancePricingDTO that = (InstancePricingDTO) o;
        return Objects.equals( instanceType, that.instanceType )
                && osFamily == that.osFamily && operatingSystem == that.operatingSystem && Objects
                .equals( deprecated, that.deprecated );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), instanceType, osFamily, operatingSystem, deprecated );
    }
}
