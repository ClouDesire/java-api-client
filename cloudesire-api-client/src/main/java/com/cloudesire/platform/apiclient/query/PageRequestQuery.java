package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.enums.SortDirection;

public class PageRequestQuery extends BaseQuery
{
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
