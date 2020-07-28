package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.response.error.ErrorResponseEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Objects;

@ApiModel( "Bulk import execution result" )
public class BulkImportResultDTO extends DTO
{
    @ApiModelProperty( "Bulk import request ID" )
    private String requestId;

    private UrlEntityDTO executor;

    @ApiModelProperty( value = "What kind of import it has been requested", example = "CatalogCloudPricingCsvDTO,CatalogDistributorPricingCsvDTO" )
    private String type;

    private List<ErrorResponseEntry> errors;

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId( String requestId )
    {
        this.requestId = requestId;
    }

    public UrlEntityDTO getExecutor()
    {
        return executor;
    }

    public void setExecutor( UrlEntityDTO executor )
    {
        this.executor = executor;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public List<ErrorResponseEntry> getErrors()
    {
        return errors;
    }

    public void setErrors( List<ErrorResponseEntry> errors )
    {
        this.errors = errors;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BulkImportResultDTO that = (BulkImportResultDTO) o;
        return Objects.equals( requestId, that.requestId ) && Objects.equals( executor, that.executor )
                && Objects.equals( type, that.type );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( requestId, executor, type );
    }
}
