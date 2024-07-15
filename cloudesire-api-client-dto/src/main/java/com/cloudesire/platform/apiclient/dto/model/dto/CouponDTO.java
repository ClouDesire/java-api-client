package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CouponDestination;
import com.cloudesire.platform.apiclient.dto.model.enums.CouponType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.commons.lang3.ObjectUtils;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import static com.liberologico.cloudesire.common.DateFormats.DATE_TIME_PATTERN;

@Schema( description = "A generated coupon" )
public class CouponDTO extends BaseEntityDTO
{
    @Schema( description = "Email address to notify customer of the coupon", readOnly = true )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    private String emailCustomer;

    @Schema( description = "Unique identifier of the coupon", readOnly = true )
    @Length ( min = 48, max = 48 )
    private String hash;

    @Schema( description = "Human readable code of the coupon", readOnly = true )
    @Length( max = 36 )
    private String code;

    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO product;

    @Schema( description = "Coupon type", readOnly = true )
    @NotNull
    private CouponType type = CouponType.DISCOUNT;

    @Schema( description = "When the coupon has been created", readOnly = true )
    @NotNull
    @JsonFormat( pattern = DATE_TIME_PATTERN )
    private Date creationDate = new Date();

    @Schema( description = "When the coupon will expire", readOnly = true )
    @JsonFormat( pattern = DATE_TIME_PATTERN )
    private Date expirationDate;

    @Schema( description = "Fixed price", readOnly = true )
    @JsonInclude ( JsonInclude.Include.NON_NULL )
    @Min ( 0 )
    private BigDecimal newPrice;

    @Schema( description = "Discount percentage", readOnly = true )
    @JsonInclude ( JsonInclude.Include.NON_NULL )
    @Min ( 0 )
    @Max ( 100 )
    private BigDecimal percentage;

    @Schema( description = "Days of extension", readOnly = true )
    @JsonInclude ( JsonInclude.Include.NON_NULL )
    @Min ( 1 )
    private Integer days;

    @Schema( description = "Maximum budget for an extended trial", readOnly = true )
    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private BigDecimal plafond;

    @Schema( description = "Coupon state", allowableValues = "NEW, SENT, EXPIRED, USED", readOnly = true )
    private String state;

    @Schema( description = "Whether the coupon is reusable", readOnly = true )
    private boolean reusable;

    @Schema( description = "What lines does the coupon affect", readOnly = true )
    private CouponDestination destination;

    /**
     * @deprecated by {@link #destination}
     */
    @Schema( description = "Whether the coupon applies to the license cost only", hidden = true )
    @Deprecated
    private Boolean licenseOnly;

    public String getEmailCustomer()
    {
        return emailCustomer;
    }

    public void setEmailCustomer( String emailCustomer )
    {
        this.emailCustomer = emailCustomer;
    }

    public String getHash()
    {
        return hash;
    }

    public void setHash( String hash )
    {
        this.hash = hash;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate( Date expirationDate )
    {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getNewPrice()
    {
        return newPrice;
    }

    public void setNewPrice( BigDecimal newPrice )
    {
        this.newPrice = newPrice;
    }

    public BigDecimal getPercentage()
    {
        return percentage;
    }

    public void setPercentage( BigDecimal percentage )
    {
        this.percentage = percentage;
    }

    public CouponType getType()
    {
        return type;
    }

    public void setType( CouponType type )
    {
        this.type = type;
    }

    public Integer getDays()
    {
        return days;
    }

    public void setDays( Integer days )
    {
        this.days = days;
    }

    public BigDecimal getPlafond()
    {
        return plafond;
    }

    public void setPlafond( BigDecimal plafond )
    {
        this.plafond = plafond;
    }

    public String getState()
    {
        return state;
    }

    public void setState( String state )
    {
        this.state = state;
    }

    public boolean isReusable()
    {
        return reusable;
    }

    public void setReusable( boolean reusable )
    {
        this.reusable = reusable;
    }

    public CouponDestination getDestination()
    {
        return destination;
    }

    public void setDestination( CouponDestination destination )
    {
        this.destination = destination;
    }

    /**
     * @deprecated by {@link #getDestination()}
     */
    @Deprecated
    public boolean isLicenseOnly()
    {
        return licenseOnly;
    }

    /**
     * @deprecated use {@link #setDestination(CouponDestination)}
     */
    @Deprecated
    public void setLicenseOnly( boolean licenseOnly )
    {
        this.licenseOnly = licenseOnly;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        CouponDTO couponDTO = (CouponDTO) o;
        return Objects.equals( emailCustomer, couponDTO.emailCustomer )
                && Objects.equals( hash, couponDTO.hash )
                && Objects.equals( productVersion, couponDTO.productVersion )
                && Objects.equals( product, couponDTO.product )
                && Objects.equals( type, couponDTO.type )
                && Objects.equals( creationDate, couponDTO.creationDate )
                && Objects.equals( expirationDate, couponDTO.expirationDate )
                && ObjectUtils.compare( newPrice, couponDTO.newPrice ) == 0
                && ObjectUtils.compare( percentage, couponDTO.percentage ) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( emailCustomer, hash, productVersion, product, type, creationDate, expirationDate,
                newPrice != null ? newPrice.doubleValue() : 0,
                percentage != null ? percentage.doubleValue() : 0 );
    }
}
