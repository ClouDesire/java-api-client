package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys;
import com.liberologico.cloudesire.common.validators.RegExp;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

import static com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys.INVALID_SIZE;

public class ConfigurationParameterDTO extends NamedEntityDTO
{
    @Size( max = 250, message = INVALID_SIZE )
    @Pattern( regexp = "[A-Za-z][A-Za-z0-9_]*", message = ConstraintKeys.ALPHANUMERIC_START_WITH_LETTER )
    private String code;

    @NotEmpty
    @Size( max = 4096, message = INVALID_SIZE )
    private String description;

    @RegExp
    private String validation;

    private String hint;

    private boolean required;

    public ConfigurationParameterDTO( String name, String code, String description )
    {
        super( name );
        this.code = code;
        this.description = description;
    }

    public ConfigurationParameterDTO()
    {
    }

    public String getCode()
    {
        return code;
    }

    public ConfigurationParameterDTO setCode( String code )
    {
        this.code = code;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public ConfigurationParameterDTO setDescription( String description )
    {
        this.description = description;
        return this;
    }

    public String getValidation()
    {
        return validation;
    }

    public ConfigurationParameterDTO setValidation( String validation )
    {
        this.validation = validation;
        return this;
    }

    public String getHint()
    {
        return hint;
    }

    public ConfigurationParameterDTO setHint( String hint )
    {
        this.hint = hint;
        return this;
    }

    public boolean isRequired()
    {
        return required;
    }

    public ConfigurationParameterDTO setRequired( boolean required )
    {
        this.required = required;
        return this;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ConfigurationParameterDTO that = (ConfigurationParameterDTO) o;
        return required == that.required && Objects.equals( code, that.code ) && Objects
                .equals( description, that.description ) && Objects.equals( validation, that.validation ) && Objects
                .equals( hint, that.hint );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( code, description, validation, hint, required );
    }
}
