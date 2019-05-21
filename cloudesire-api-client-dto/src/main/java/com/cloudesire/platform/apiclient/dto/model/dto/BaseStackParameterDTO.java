package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.StackParameterValueType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel( description = "A software stack requirement" )
public abstract class BaseStackParameterDTO extends BaseEntityDTO
{
    @ApiModelProperty( value = "Identifier of the parameter", readOnly = true )
    private String parameterIdentifier;

    @ApiModelProperty( value = "Regex to validate values of the parameter", readOnly = true )
    private String regexRule;

    @ApiModelProperty( value = "Descriptive label", readOnly = true )
    private String label;

    @ApiModelProperty( value = "The type of the parameter's values", readOnly = true )
    private StackParameterValueType type = StackParameterValueType.STRING;

    public String getParameterIdentifier()
    {
        return parameterIdentifier;
    }

    public void setParameterIdentifier( String parameterIdentifier )
    {
        this.parameterIdentifier = parameterIdentifier;
    }

    public String getRegexRule()
    {
        return regexRule;
    }

    public void setRegexRule( String regexRule )
    {
        this.regexRule = regexRule;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    public StackParameterValueType getType()
    {
        return type;
    }

    public void setType( StackParameterValueType type )
    {
        this.type = type;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        BaseStackParameterDTO that = (BaseStackParameterDTO) o;
        return Objects.equals( parameterIdentifier, that.parameterIdentifier ) && Objects
                .equals( regexRule, that.regexRule ) && Objects.equals( label, that.label ) && type == that.type;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), parameterIdentifier, regexRule, label, type );
    }
}
