package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

import java.math.BigDecimal;

public class RecurringCostLineDTO extends CustomOrderLineDTO
{
    public RecurringCostLineDTO( BigDecimal price )
    {
        super( price );
    }

    public RecurringCostLineDTO( BigDecimal price, BigDecimal vat )
    {
        super( price, vat );
    }

    public RecurringCostLineDTO()
    {
        super();
    }

    @Override
    public LineType getType()
    {
        return LineType.RECURRINGCOST;
    }
}
