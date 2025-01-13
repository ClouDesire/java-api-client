package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class ScrollRequestDTO
{
    @Schema( description = "The (zero-based) offset of the first item returned in the collection", type = "integer", defaultValue = "0" )
    @Min( value = 0, message = ErrorKeys.INVALID_MIN )
    @Max( value = 999, message = ErrorKeys.INVALID_MAX )
    private long offset;

    @Schema( description = "The maximum number of entries to return", type = "integer", defaultValue = "10" )
    @Min( value = 0, message = ErrorKeys.INVALID_MIN )
    @Max( value = 50, message = ErrorKeys.INVALID_MAX )
    private long limit = 10;

    public long getOffset()
    {
        return offset;
    }

    public void setOffset( long offset )
    {
        this.offset = offset;
    }

    public long getLimit()
    {
        return limit;
    }

    public void setLimit( long limit )
    {
        this.limit = limit;
    }

}
