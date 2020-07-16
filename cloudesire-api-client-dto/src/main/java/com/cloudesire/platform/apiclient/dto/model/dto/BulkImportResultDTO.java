package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.response.error.ErrorResponseEntry;

import java.util.List;

public class BulkImportResultDTO extends DTO
{
    private String requestId;

    private UrlEntityDTO executor;

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
}
