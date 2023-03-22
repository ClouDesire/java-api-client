package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class SellingStatisticDTO implements Comparable<SellingStatisticDTO>, DTO
{
    private UrlEntityDTO entity;

    private BigDecimal sold;

    public UrlEntityDTO getEntity()
    {
        return entity;
    }

    public void setEntity( UrlEntityDTO entity )
    {
        this.entity = entity;
    }

    public BigDecimal getSold()
    {
        return sold;
    }

    public void setSold( BigDecimal sold )
    {
        this.sold = sold;
    }

    @Override
    public int compareTo( SellingStatisticDTO that )
    {
        return this.sold.compareTo( that.sold );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        SellingStatisticDTO that = (SellingStatisticDTO) o;
        return Objects.equals( entity, that.entity ) && Objects.equals( sold, that.sold );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( entity, sold );
    }
}
