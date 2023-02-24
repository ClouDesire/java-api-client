package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY;

@ApiModel( description = "Defines the triggering events used to generate a budget notification email." )
public class BillingBudgetThresholdDTO implements DTO
{
    @ApiModelProperty( "Send an alert when this threshold is exceeded" )
    @Min( 0 )
    @Max( 100 )
    @NotNull
    private BigDecimal percent;

    @ApiModelProperty( value = "When this threshold has been notified", accessMode = READ_ONLY )
    private ZonedDateTime notifiedAt;

    public BillingBudgetThresholdDTO( String percent )
    {
        this.percent = new BigDecimal( percent );
    }

    public BillingBudgetThresholdDTO()
    {
    }

    public BigDecimal getPercent()
    {
        return percent;
    }

    public void setPercent( BigDecimal percent )
    {
        this.percent = percent;
    }

    public ZonedDateTime getNotifiedAt()
    {
        return notifiedAt;
    }

    public void setNotifiedAt( ZonedDateTime notifiedAt )
    {
        this.notifiedAt = notifiedAt;
    }
}
