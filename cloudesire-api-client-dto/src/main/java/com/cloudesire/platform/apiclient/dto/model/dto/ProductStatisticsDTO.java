package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductStatisticsDTO implements Comparable<ProductStatisticsDTO>, DTO
{
    private UrlEntityDTO product;

    private BigDecimal sold;

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
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
    public int compareTo( ProductStatisticsDTO that )
    {
        return this.sold.compareTo( that.sold );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ProductStatisticsDTO that = (ProductStatisticsDTO) o;
        return Objects.equals( product, that.product ) && Objects.equals( sold, that.sold );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( product, sold );
    }
}
