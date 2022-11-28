package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.dto.PageRequestDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.SortDirection;

import java.util.Map;

public class PageRequestQuery extends BaseQuery
{
    public PageRequestQuery( Map<String, ?> m )
    {
        super( m );
    }

    public PageRequestQuery()
    {
    }

    public PageRequestQuery( int pageNumber, int pageSize, String sortField )
    {
        setPageNumber( pageNumber );
        setPageSize( pageSize );
        setSortField( sortField );
    }

    public PageRequestQuery setPageNumber( Integer pageNumber )
    {
        put( PageRequestDTO.Fields.PAGE_NUMBER, pageNumber );
        return this;
    }

    public PageRequestQuery setPageSize( Integer pageSize )
    {
        put( PageRequestDTO.Fields.PAGE_SIZE, pageSize );
        return this;
    }

    public PageRequestQuery setSortField( String sortField )
    {
        put( PageRequestDTO.Fields.SORT_FIELD, sortField );
        return this;
    }

    public PageRequestQuery setSortDirection( SortDirection sortDirection )
    {
        put( PageRequestDTO.Fields.SORT_DIRECTION, sortDirection );
        return this;
    }
}
