package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.BillingItemPresence;
import com.cloudesire.platform.apiclient.dto.model.enums.BillingItemType;
import com.cloudesire.platform.apiclient.dto.model.enums.BillingItemValueType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@Schema( description = "Definition of the pricing of an extra resource" )
public class BillingItemDTO extends NamedEntityDTO
{
    @Schema( description = "Unique identifier of the billing item")
    private String identifier;

    @Schema( description = "Descriptive name of a single item", example = "user, license" )
    @NotEmpty
    @Size( max = 255, message = INVALID_SIZE )
    private String unit;

    @Schema( description = "Description of the billing item")
    @NotEmpty
    @Size( max = 8192, message = INVALID_SIZE )
    private String description;

    @Schema( description = "Extended description of the billing item")
    private String longDescription;

    private UrlEntityDTO owner;

    private UrlEntityDTO reseller;

    @NotNull
    private BillingItemType type;

    private BillingItemValueType valueType;

    @Schema( description = "Percentage of revenues for the platform owner")
    private BigDecimal cloudesireQuota;

    @FieldAPI( sinceVersion = ApiVersion.V20211004 )
    private BillingItemPresence presence = BillingItemPresence.OPTIONAL;

    @Schema( description = "Whether the billing item will be included in every subscription", hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20211004 )
    private Boolean required;

    @Schema( description = "Whether the billing item can be downgraded")
    private boolean downgradable = true;

    private ApiEndpointDTO endpoint;

    @Schema( description = "Weight order for displaying on the marketplace")
    private Integer weight;

    public BillingItemDTO( BillingItemType type, String name, String unit, String description )
    {
        super( name );
        this.type = type;
        this.unit = unit;
        this.description = description;
    }

    @JsonIgnore
    @Override
    public String getDisplayName()
    {
        return getIdentifier();
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

    public String getLongDescription()
    {
        return longDescription;
    }

    public BillingItemDTO setLongDescription( String longDescription )
    {
        this.longDescription = longDescription;
        return this;
    }

    public UrlEntityDTO getOwner()
    {
        return owner;
    }

    public BillingItemDTO setOwner( UrlEntityDTO owner )
    {
        this.owner = owner;
        return this;
    }

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public BillingItemDTO setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
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

    public BillingItemPresence getPresence()
    {
        return presence;
    }

    public BillingItemDTO setPresence( BillingItemPresence presence )
    {
        this.presence = presence;
        return this;
    }

    /**
     * @deprecated by {@link #getPresence()}
     */
    @Deprecated
    public Boolean isRequired()
    {
        return required;
    }

    /**
     * @deprecated by {@link #setPresence(BillingItemPresence)}
     */
    @Deprecated
    public BillingItemDTO setRequired( Boolean required )
    {
        this.required = required;
        return this;
    }

    public boolean isDowngradable()
    {
        return downgradable;
    }

    public BillingItemDTO setDowngradable( boolean downgradable )
    {
        this.downgradable = downgradable;
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

    public Integer getWeight()
    {
        return weight;
    }

    public BillingItemDTO setWeight( Integer weight )
    {
        this.weight = weight;
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
