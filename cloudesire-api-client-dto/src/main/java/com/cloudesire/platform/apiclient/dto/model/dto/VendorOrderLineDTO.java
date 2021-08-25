package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Date;

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

    @ApiModelProperty( "Purchase date of the custom cost, defaults to now" )
    private Date purchased;

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

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
    }
}
