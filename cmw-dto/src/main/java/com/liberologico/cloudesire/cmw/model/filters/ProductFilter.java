package com.liberologico.cloudesire.cmw.model.filters;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.cmw.model.enums.OrderingType;

import java.util.Iterator;
import java.util.Set;

public class ProductFilter extends PageRequestDTO
{
    private String nameFilter;
    private String tag;
    private Integer categoryId;
    private OrderingType orderingType;
    private Set<String> excludedCategories;
    private String distributor;
    private String reseller;

    public String getNameFilter()
    {
        return nameFilter;
    }

    public void setNameFilter( String nameFilter )
    {
        this.nameFilter = nameFilter;
    }

    public Integer getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId( Integer categoryId )
    {
        this.categoryId = categoryId;
    }

    public OrderingType getOrderingType()
    {
        return orderingType;
    }

    public void setOrderingType( OrderingType orderingType )
    {
        this.orderingType = orderingType;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }

    public String getExcludedCategories()
    {
        if ( excludedCategories == null ) return null;

        StringBuilder sb = new StringBuilder();
        Iterator<String> it = excludedCategories.iterator();

        while ( it.hasNext() )
        {
            sb.append( it.next() );
            if ( it.hasNext() ) sb.append( "," );
        }

        return sb.toString();
    }

    public void setExcludedCategories( Set<String> excludedCategories )
    {
        this.excludedCategories = excludedCategories;
    }

    public String getDistributor()
    {
        return distributor;
    }

    public void setDistributor( String distributor )
    {
        this.distributor = distributor;
    }

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }
}
