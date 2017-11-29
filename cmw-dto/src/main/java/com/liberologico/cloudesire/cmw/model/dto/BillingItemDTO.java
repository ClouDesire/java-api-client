package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.BillingItemType;
import com.liberologico.cloudesire.cmw.model.enums.BillingItemValueType;
import com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

import static com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys.INVALID_SIZE;

public class BillingItemDTO extends NamedEntityDTO
{
    @Pattern( regexp = "^[a-zA-Z0-9]*$", message = ConstraintKeys.ALPHANUMERIC )
    private String identifier;

    @NotEmpty
    @Size( max = 255, message = INVALID_SIZE )
    private String unit;

    @NotEmpty
    @Size( max = 8192, message = INVALID_SIZE )
    private String description;

    @NotNull
    private BillingItemType type;

    private BillingItemValueType valueType;

    private BigDecimal cloudesireQuota;

    private boolean required;

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

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "BillingItemDTO{" );
        sb.append( "identifier='" ).append( identifier ).append( '\'' );
        sb.append( '}' );
        return sb.toString();
    }
    // endregion
}
