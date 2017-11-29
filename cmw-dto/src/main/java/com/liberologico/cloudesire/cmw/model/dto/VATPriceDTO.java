package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.common.MathConfiguration;
import com.liberologico.cloudesire.common.MathUtils;

import java.math.BigDecimal;
import java.util.Objects;

public class VATPriceDTO extends PriceDTO
{
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
        return Objects.equals( price, priceDTO.price ) &&
                Objects.equals( VAT, priceDTO.VAT ) &&
                Objects.equals( currency, priceDTO.currency );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( price, VAT, currency );
    }
}
