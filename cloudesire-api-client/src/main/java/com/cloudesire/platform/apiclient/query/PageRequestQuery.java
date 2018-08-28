package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.enums.SortDirection;

public final class PageRequestQuery extends BaseQuery
{
    public PageRequestQuery setSortField( String sortField )
    {
        put( PageRequestDTO.Fields.SORT_FIELD, sortField );
        return this;
    }

    public PageRequestQuery setSortDirection( SortDirection sortDirection )
    {
        put( PageRequestDTO.Fields.SORT_DIRECTION, sortDirection.toString() );
        return this;
    }

    public PageRequestQuery setPageSize( Integer pageSize )
    {
        put( PageRequestDTO.Fields.PAGE_SIZE, pageSize.toString() );
        return this;
    }

    public PageRequestQuery setPageNumber( Integer pageNumber )
    {
        put( PageRequestDTO.Fields.SORT_FIELD, pageNumber.toString() );
        return this;
    }
}
