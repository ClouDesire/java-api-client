package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class CouponPatchDTO extends DTO
{
    @ApiModelProperty( "Coupon recipient email address" )
    private String email;

    @ApiModelProperty( "New plafond for an extended trial coupon" )
    private BigDecimal plafond;

    @ApiModelProperty( "New coupon expiration date" )
    private Date expiration;

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public BigDecimal getPlafond()
    {
        return plafond;
    }

    public void setPlafond( BigDecimal plafond )
    {
        this.plafond = plafond;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration( Date expiration )
    {
        this.expiration = expiration;
    }
}
