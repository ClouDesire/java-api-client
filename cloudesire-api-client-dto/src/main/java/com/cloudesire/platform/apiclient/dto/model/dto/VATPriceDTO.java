package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.MathConfiguration;
import com.liberologico.cloudesire.common.MathUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

@ApiModel( "A price with VAT" )
public class VATPriceDTO extends PriceDTO
{
    @ApiModelProperty( "VAT total amount" )
    private BigDecimal vatSpunOff;

    private BigDecimal VAT;

    public VATPriceDTO( BigDecimal price, String currency, BigDecimal vatSpunOff, BigDecimal VAT )
    {
        super( price, currency );
        this.vatSpunOff = vatSpunOff;
        this.VAT = VAT;
    }

    public static VATPriceDTO with( String sPrice, String sVAT, String currency )
    {
        BigDecimal price = new BigDecimal( sPrice );
        BigDecimal VAT = new BigDecimal( sVAT );
        BigDecimal vatSpunOff = MathUtils.percentage( price, VAT, MathConfiguration.DEFAULT_PRECISION );
        return new VATPriceDTO( price, currency, vatSpunOff, VAT );
    }

    public VATPriceDTO( String price )
    {
        this.price = new BigDecimal( price );
    }

    public VATPriceDTO()
    {
    }

    @ApiModelProperty( value = "Amount plus VAT", readOnly = true )
    @Override
    public BigDecimal getTotal()
    {
        if ( vatSpunOff == null ) return null;

        return super.getTotal().add( vatSpunOff );
    }

    public BigDecimal getVatSpunOff()
    {
        return vatSpunOff;
    }

    public void setVatSpunOff( BigDecimal vatSpunOff )
    {
        this.vatSpunOff = vatSpunOff;
    }

    @ApiModelProperty( value = "VAT percentage", example = "22" )
    public BigDecimal getVAT()
    {
        return VAT;
    }

    public void setVAT( BigDecimal VAT )
    {
        this.VAT = VAT;
    }

    // region Fluent methods
    @Override
    public VATPriceDTO withCurrency( String currency )
    {
        this.currency = currency;
        return this;
    }

    @Override
    public VATPriceDTO withValue( BigDecimal value )
    {
        price = value;
        return this;
    }

    public VATPriceDTO withVAT( BigDecimal vAT )
    {
        VAT = vAT;
        return this;
    }
    // endregion

    @Override
    public String toString()
    {
        return "PriceDTO [price=" + price + ", VAT=" + VAT + "%, currency=" + currency + "]";
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        VATPriceDTO priceDTO = (VATPriceDTO) o;
        return Objects.equals( price, priceDTO.price ) && Objects.equals( VAT, priceDTO.VAT );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( price, VAT, currency );
    }
}
