package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import com.cloudesire.platform.apiclient.dto.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.Map;

public class PageRequestDTO
{
    public static final int DEFAULT_PAGE_NUMBER = 1;
    public static final int DEFAULT_PAGE_SIZE = 20;

    public static class Fields
    {
        public static final String PAGE_NUMBER = "pageNumber";
        public static final String PAGE_SIZE = "pageSize";
        public static final String SORT_DIRECTION = "sortDirection";
        public static final String SORT_FIELD = "sortField";

        private Fields()
        {
        }
    }

    @Schema( description = "Page number to retrieve", type = "integer", defaultValue = "1" )
    @Min( value = 1, message = ErrorKeys.INVALID_MIN )
    private Integer pageNumber = DEFAULT_PAGE_NUMBER;

    @Schema( description = "Number of elements for the requested page", type = "integer", defaultValue = "20" )
    @Max( value = 50, message = ErrorKeys.INVALID_MAX )
    private Integer pageSize = DEFAULT_PAGE_SIZE;

    @Parameter( description = "Elements sort direction" )
    private SortDirection sortDirection;

    @Parameter( description = "Field to sort by" )
    private String sortField;

    public PageRequestDTO( int pageNumber, int pageSize )
    {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public PageRequestDTO( int pageNumber, int pageSize, String sortField )
    {
        this( pageNumber, pageSize );
        this.sortField = sortField;
    }

    public PageRequestDTO( int pageNumber, int pageSize, String sortField, SortDirection sortDirection )
    {
        this( pageNumber, pageSize, sortField );
        this.sortDirection = sortDirection;
    }

    /**
     * @deprecated migrate to PageRequestQuery
     */
    @Deprecated
    public Map<String, String> toMap()
    {
        Map<String, String> map = new HashMap<>();
        map.put( Fields.PAGE_NUMBER, Integer.toString( pageNumber ) );
        map.put( Fields.PAGE_SIZE, Integer.toString( pageSize ) );
        if ( sortDirection != null ) map.put( Fields.SORT_DIRECTION, sortDirection.toString() );
        if ( sortField != null ) map.put( Fields.SORT_FIELD, sortField );
        return map;
    }

    /**
     * @deprecated migrate to PageRequestQuery
     */
    @Deprecated
    public static Map<String, String> pager( int number, int size )
    {
        return new PageRequestDTO( number, size ).toMap();
    }

    /**
     * @deprecated migrate to PageRequestQuery
     */
    @Deprecated
    public static Map<String, String> defaultPager()
    {
        return new PageRequestDTO().toMap();
    }

    // region Auto-generated code
    public PageRequestDTO()
    {
    }

    @Hidden
    @JsonIgnore
    public boolean isAscending()
    {
        return sortDirection == SortDirection.ASC;
    }

    @Hidden
    @JsonIgnore
    public boolean isSet()
    {
        return pageNumber != null && pageSize != null;
    }

    public PageRequestDTO setSort( String field, SortDirection direction )
    {
        this.sortField = field;
        this.sortDirection = direction;
        return this;
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public void setPageNumber( Integer pageNumber )
    {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize( Integer pageSize )
    {
        this.pageSize = pageSize;
    }

    public SortDirection getSortDirection()
    {
        return sortDirection;
    }

    public void setSortDirection( SortDirection sortDirection )
    {
        this.sortDirection = sortDirection;
    }

    public String getSortField()
    {
        return sortField;
    }

    public void setSortField( String sortField )
    {
        this.sortField = sortField;
    }
    // endregion
}
