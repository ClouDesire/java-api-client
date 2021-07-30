package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

public class VendorOrderLineDTO extends CustomOrderLineDTO
{
    public VendorOrderLineDTO( BigDecimal value )
    {
        super( value );
    }

    public VendorOrderLineDTO( BigDecimal value, BigDecimal vat )
    {
        super( value, vat );
    }

    public VendorOrderLineDTO()
    {
        super();
    }

    @ApiModelProperty( "Identifies the custom line for possible further deletion" )
    @Length( max = 125 )
    private String tag;

    @Override
    public LineType getType()
    {
        return LineType.CUSTOM;
    }

    @Override
    public void setType( LineType type )
    {
        // type is fixed to CUSTOM
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag( String tag )
    {
        this.tag = tag;
    }
}
