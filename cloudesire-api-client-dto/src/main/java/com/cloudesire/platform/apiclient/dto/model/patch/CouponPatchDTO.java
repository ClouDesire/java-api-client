package com.cloudesire.platform.apiclient.dto.model.patch;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
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

    public CouponPatchDTO setEmail( String email )
    {
        this.email = email;
        return this;
    }

    public BigDecimal getPlafond()
    {
        return plafond;
    }

    public CouponPatchDTO setPlafond( BigDecimal plafond )
    {
        this.plafond = plafond;
        return this;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public CouponPatchDTO setExpiration( Date expiration )
    {
        this.expiration = expiration;
        return this;
    }
}
