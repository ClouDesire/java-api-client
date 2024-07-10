package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.Regexp;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY;

@Schema( description = "Defines the triggering events used to generate a budget notification email." )
public class BillingBudgetThresholdDTO implements DTO
{
    @Schema( description = "Send an alert when this threshold is exceeded")
    @Min( 0 )
    @Max( 100 )
    @NotNull
    private BigDecimal percent;

    @Schema( description = "Send an alert for this threshold to these extra addresses")
    private List<@Email( regexp = Regexp.INTERNET_EMAIL ) @NotNull String> additionalRecipients;

    @Schema( description = "When this threshold has been notified", accessMode = READ_ONLY )
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

    public List<String> getAdditionalRecipients()
    {
        return additionalRecipients;
    }

    public void setAdditionalRecipients( List<String> additionalRecipients )
    {
        this.additionalRecipients = additionalRecipients;
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
