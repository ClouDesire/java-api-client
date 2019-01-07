package com.cloudesire.platform.apiclient.dto.model.dto;

import javax.validation.Valid;

public class CountedProductDTO
{
    @Valid
    private UrlEntityDTO product;
    private Long count;

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO url )
    {
        this.product = url;
    }

    public Long getCount()
    {
        return count;
    }

    public void setCount( Long count )
    {
        this.count = count;
    }
}
