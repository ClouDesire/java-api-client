package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import com.liberologico.cloudesire.common.validators.RegExp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Map;
import java.util.Objects;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( description = "A parameter that the user can fill for each subscription" )
public class ConfigurationParameterDTO extends NamedEntityDTO
{
    @ApiModelProperty( "Identifier for the configuration parameter" )
    @Size( max = 250, message = INVALID_SIZE )
    @Pattern( regexp = "[A-Za-z][A-Za-z0-9_]*", message = ErrorKeys.ALPHANUMERIC_START_WITH_LETTER )
    private String code;

    @ApiModelProperty( "Extended description" )
    @NotEmpty
    @Size( max = 4096, message = INVALID_SIZE )
    private String description;

    @ApiModelProperty( "Regular expression to validate the parameter value" )
    @RegExp
    private String validation;

    @ApiModelProperty( "Short description to help user compiling the correct value" )
    private String hint;

    @ApiModelProperty( "Whether compiling the parameter is required" )
    private boolean required;

    @ApiModelProperty( "Weight order for displaying on the marketplace" )
    private Integer weight;

    @ApiModelProperty( "Whether to hide the parameter values" )
    private boolean sensitive;

    private Map<String, String> labeledValues;

    public ConfigurationParameterDTO( String name, String code, String description )
    {
        this( name, description );
        this.code = code;
    }

    public ConfigurationParameterDTO( String name, Map<String, String> labeledValues, String description )
    {
        this( name, description );
        this.labeledValues = labeledValues;
    }

    private ConfigurationParameterDTO( String name, String description )
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

    public Map<String, String> getLabeledValues()
    {
        return labeledValues;
    }

    public ConfigurationParameterDTO setLabeledValues( Map<String, String> labeledValues )
    {
        this.labeledValues = labeledValues;
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
