package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import java.math.BigDecimal;

public class OneshotCostLineDTO extends CustomOrderLineDTO
{
    public OneshotCostLineDTO( BigDecimal price )
    {
        super( price );
    }

    public OneshotCostLineDTO( BigDecimal price, BigDecimal vat )
    {
        super( price, vat );
    }

    public OneshotCostLineDTO()
    {
        super();
    }

    @Override
    public LineType getType()
    {
        return LineType.ONESHOTCOST;
    }
}
