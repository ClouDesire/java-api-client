package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import com.liberologico.cloudesire.common.validators.RegExp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.URL;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@Schema( description = "A parameter that the user can fill for each subscription" )
public class ConfigurationParameterDTO extends NamedEntityDTO
{
    @Schema( description = "Identifier for the configuration parameter")
    @Size( max = 250, message = INVALID_SIZE )
    @Pattern( regexp = "[A-Za-z][A-Za-z0-9_]*", message = ErrorKeys.ALPHANUMERIC_START_WITH_LETTER )
    private String code;

    @Schema( description = "Extended description")
    @NotEmpty
    @Size( max = 4096, message = INVALID_SIZE )
    private String description;

    @Schema( description = "Regular expression to validate the parameter value")
    @RegExp
    private String validation;

    @Schema( description = "Possible labeled values for the parameter")
    private Map<String, String> acceptedValues;

    @Schema( description = "External endpoint to obtain possible values for the parameter")
    @URL
    private String externalValuesUrl;

    @Schema( description = "Accepted number range for the values of the parameter")
    @Valid
    private Range range;

    @Schema( description = "Short description to help user compiling the correct value")
    private String hint;

    @Schema( description = "Whether compiling the parameter is required")
    private boolean required;

    @Schema( description = "Weight order for displaying on the marketplace")
    private Integer weight;

    @Schema( description = "Whether to hide the parameter values")
    private boolean sensitive;

    public ConfigurationParameterDTO( String name, String code, String description )
    {
        this( name, description );
        this.code = code;
    }

    public ConfigurationParameterDTO( String name, Map<String, String> acceptedValues, String description )
    {
        this( name, description );
        this.acceptedValues = acceptedValues;
    }

    public ConfigurationParameterDTO( String name, String description )
    {
        super( name );
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

    public Map<String, String> getAcceptedValues()
    {
        return acceptedValues;
    }

    public ConfigurationParameterDTO setAcceptedValues( Map<String, String> acceptedValues )
    {
        this.acceptedValues = acceptedValues;
        return this;
    }

    public String getExternalValuesUrl()
    {
        return externalValuesUrl;
    }

    public ConfigurationParameterDTO setExternalValuesUrl( String externalValuesUrl )
    {
        this.externalValuesUrl = externalValuesUrl;
        return this;
    }

    public Range getRange()
    {
        return range;
    }

    public ConfigurationParameterDTO setRange( Range range )
    {
        this.range = range;
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

    public Integer getWeight()
    {
        return weight;
    }

    public ConfigurationParameterDTO setWeight( Integer weight )
    {
        this.weight = weight;
        return this;
    }

    public boolean isSensitive()
    {
        return sensitive;
    }

    public ConfigurationParameterDTO setSensitive( boolean sensitive )
    {
        this.sensitive = sensitive;
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

    public static class Range implements Serializable
    {
        @NotNull
        Integer min;

        @NotNull
        Integer max;

        public Range( Integer min, Integer max )
        {
            this.min = min;
            this.max = max;
        }

        public Range()
        {
        }

        public Integer getMin()
        {
            return min;
        }

        public void setMin( Integer min )
        {
            this.min = min;
        }

        public Integer getMax()
        {
            return max;
        }

        public void setMax( Integer max )
        {
            this.max = max;
        }

        @Override
        public boolean equals( Object o )
        {
            if ( this == o ) return true;
            if ( o == null || getClass() != o.getClass() ) return false;
            Range range = (Range) o;
            return Objects.equals( min, range.min ) && Objects.equals( max, range.max );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( min, max );
        }
    }
}
