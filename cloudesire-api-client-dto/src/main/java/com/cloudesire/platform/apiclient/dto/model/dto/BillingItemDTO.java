package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.BillingItemType;
import com.cloudesire.platform.apiclient.dto.model.enums.BillingItemValueType;
import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "Definition of the pricing of an extra resource" )
public class BillingItemDTO extends NamedEntityDTO
{
    @ApiModelProperty( "Unique identifier of the billing item" )
    @Pattern( regexp = "^[a-zA-Z0-9]*$", message = ErrorKeys.ALPHANUMERIC )
    private String identifier;

    @ApiModelProperty( value = "Descriptive name of a single item", example = "user, license" )
    @NotEmpty
    @Size( max = 255, message = INVALID_SIZE )
    private String unit;

    @ApiModelProperty( "Description of the billing item" )
    @NotEmpty
    @Size( max = 8192, message = INVALID_SIZE )
    private String description;

    @NotNull
    private BillingItemType type;

    private BillingItemValueType valueType;

    @ApiModelProperty( "Percentage of revenues for the platform owner" )
    private BigDecimal cloudesireQuota;

    @ApiModelProperty( "Whether the billing item will be included in every subscription" )
    private boolean required;

    private ApiEndpointDTO endpoint;

    public BillingItemDTO( BillingItemType type, String name, String unit, String description )
    {
        super( name );
        this.type = type;
        this.unit = unit;
        this.description = description;
    }

    // region Auto-generated code
    public BillingItemDTO()
    {
        super();
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public BillingItemDTO setIdentifier( String identifier )
    {
        this.identifier = identifier;
        return this;
    }

    public String getUnit()
    {
        return unit;
    }

    public BillingItemDTO setUnit( String unit )
    {
        this.unit = unit;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public BillingItemDTO setDescription( String description )
    {
        this.description = description;
        return this;
    }

    public BillingItemType getType()
    {
        return type;
    }

    public BillingItemDTO setType( BillingItemType type )
    {
        this.type = type;
        return this;
    }

    public BigDecimal getCloudesireQuota()
    {
        return cloudesireQuota;
    }

    public BillingItemDTO setCloudesireQuota( BigDecimal cloudesireQuota )
    {
        this.cloudesireQuota = cloudesireQuota;
        return this;
    }

    public boolean isRequired()
    {
        return required;
    }

    public BillingItemDTO setRequired( boolean required )
    {
        this.required = required;
        return this;
    }

    public BillingItemValueType getValueType()
    {
        return valueType;
    }

    public BillingItemDTO setValueType( BillingItemValueType valueType )
    {
        this.valueType = valueType;
        return this;
    }

    public ApiEndpointDTO getEndpoint()
    {
        return endpoint;
    }

    public BillingItemDTO setEndpoint( ApiEndpointDTO endpoint )
    {
        this.endpoint = endpoint;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BillingItemDTO that = (BillingItemDTO) o;
        return Objects.equals( identifier, that.identifier );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( identifier );
    }
    // endregion
}
