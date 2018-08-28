package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.enums.SortDirection;

public abstract class PageRequestQuery extends BaseQuery
{
    private Integer pageNumber;
    private Integer pageSize;
    private SortDirection sortDirection;
    private String sortField;

    public String getSortField()
    {
        return sortField;
    }

    public PageRequestQuery setSortField( String sortField )
    {
        this.sortField = sortField;
        return this;
    }

    public SortDirection getSortDirection()
    {
        return sortDirection;
    }

    public PageRequestQuery setSortDirection( SortDirection sortDirection )
    {
        this.sortDirection = sortDirection;
        return this;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public PageRequestQuery setPageSize( Integer pageSize )
    {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public PageRequestQuery setPageNumber( Integer pageNumber )
    {
        this.pageNumber = pageNumber;
        return this;
    }
}
