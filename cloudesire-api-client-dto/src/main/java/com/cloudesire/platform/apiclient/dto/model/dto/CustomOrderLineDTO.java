package com.cloudesire.platform.apiclient.dto.model.dto;

import java.math.BigDecimal;

abstract class CustomOrderLineDTO extends OrderLineDTO
{
    public CustomOrderLineDTO( BigDecimal price )
    {
        this( price, null );
    }

    public CustomOrderLineDTO( BigDecimal price, BigDecimal vat )
    {
        this.setPrice( new VATPriceDTO().withValue( price ).withVAT( vat ) );
    }

    public CustomOrderLineDTO()
    {
    }
}
