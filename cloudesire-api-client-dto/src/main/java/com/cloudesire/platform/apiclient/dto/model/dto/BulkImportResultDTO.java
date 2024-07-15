package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.response.error.ErrorResponseEntry;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;

@Schema( description = "Bulk import execution result" )
public class BulkImportResultDTO implements DTO
{
    @Schema( description = "Bulk import request ID")
    private String requestId;

    private ZonedDateTime execution;

    private UrlEntityDTO executor;

    @Schema( description = "What kind of import it has been requested", example = "CatalogCloudPricingCsvDTO,CatalogDistributorPricingCsvDTO" )
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

    public ZonedDateTime getExecution()
    {
        return execution;
    }

    public void setExecution( ZonedDateTime execution )
    {
        this.execution = execution;
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
