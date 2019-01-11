package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel( "Environment variables for an application" )
public class ApplicationFileEnvironmentDTO extends BaseEntityDTO
{
    /**
     * Null when instance is embedded inside ApplicationFileDTO
     */
    @Valid
    private UrlEntityDTO applicationFile;

    @ApiModelProperty( "Variable name" )
    @NotNull
    private String variable;

    @ApiModelProperty( "Variable value" )
    @NotNull
    private String value;

    @ApiModelProperty( "Whether the value is editable by a customer" )
    private boolean editableByCustomer = false;

    public ApplicationFileEnvironmentDTO( String applicationUrl, String variable, String value )
    {
        this.applicationFile = new UrlEntityDTO( applicationUrl );
        this.variable = variable;
        this.value = value;
    }

    public ApplicationFileEnvironmentDTO()
    {
    }

    public UrlEntityDTO getApplicationFile()
    {
        return applicationFile;
    }

    public void setApplicationFile( UrlEntityDTO applicationFile )
    {
        this.applicationFile = applicationFile;
    }

    public String getVariable()
    {
        return variable;
    }

    public void setVariable( String variable )
    {
        this.variable = variable;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public boolean isEditableByCustomer()
    {
        return editableByCustomer;
    }

    public void setEditableByCustomer( boolean editableByCustomer )
    {
        this.editableByCustomer = editableByCustomer;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof ApplicationFileEnvironmentDTO ) ) return false;
        ApplicationFileEnvironmentDTO that = (ApplicationFileEnvironmentDTO) o;
        return Objects.equals( editableByCustomer, that.editableByCustomer ) &&
                Objects.equals( applicationFile, that.applicationFile ) &&
                Objects.equals( variable, that.variable ) &&
                Objects.equals( value, that.value );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( applicationFile, variable, value, editableByCustomer );
    }
}