package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.Map;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@Schema( description = "A draft of a product description" )
public class ProductDraftDTO extends BaseEntityDTO implements ProductL10nDTO
{
    @Valid
    private UrlEntityDTO original;

    @Schema( description = "Short description of the product")
    @Size( max = 4000, message = INVALID_SIZE )
    private String shortDescription;

    @Schema( description = "Long description of the product")
    @Size( max = 8192, message = INVALID_SIZE )
    private String longDescription;

    @Schema( description = "Instructions shown to the customer that buys a subscription")
    private String endUserInstructions;

    @Schema( description = "Terms of service")
    private String termsOfService;

    @Schema( description = "Privacy policy")
    private String privacy;

    @Schema( description = "Service level agreement")
    private String serviceLevelAgreement;

    @Schema( description = "Localized product metadata")
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Map<String, Object> extraData;

    @Schema( description = "Frequently asked questions")
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Map<String, String> faq;

    @Schema( description = "Message to display to the user on subscription termination")
    private String terminationMessage;

    @Schema( description = "Message to display to the user for Terms of Service acceptance")
    private String tosAcceptance;

    //region Auto-generated code
    public UrlEntityDTO getOriginal()
    {
        return original;
    }

    public ProductDraftDTO setOriginal( UrlEntityDTO original )
    {
        this.original = original;
        return this;
    }

    public String getLongDescription()
    {
        return longDescription;
    }

    public void setLongDescription( String longDescription )
    {
        this.longDescription = longDescription;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription( String shortDescription )
    {
        this.shortDescription = shortDescription;
    }

    public String getEndUserInstructions()
    {
        return endUserInstructions;
    }

    public void setEndUserInstructions( String endUserInstructions )
    {
        this.endUserInstructions = endUserInstructions;
    }

    public String getTermsOfService()
    {
        return termsOfService;
    }

    public void setTermsOfService( String termsOfService )
    {
        this.termsOfService = termsOfService;
    }

    public String getPrivacy()
    {
        return privacy;
    }

    public void setPrivacy( String privacy )
    {
        this.privacy = privacy;
    }

    public String getServiceLevelAgreement()
    {
        return serviceLevelAgreement;
    }

    public void setServiceLevelAgreement( String serviceLevelAgreement )
    {
        this.serviceLevelAgreement = serviceLevelAgreement;
    }

    public Map<String, Object> getExtraData()
    {
        return extraData;
    }

    public void setExtraData( Map<String, Object> extraData )
    {
        this.extraData = extraData;
    }

    @Override
    public Map<String, String> getFaq()
    {
        return faq;
    }

    @Override
    public void setFaq( Map<String, String> faq )
    {
        this.faq = faq;
    }

    @Override
    public String getTerminationMessage()
    {
        return terminationMessage;
    }

    @Override
    public void setTerminationMessage( String terminationMessage )
    {
        this.terminationMessage = terminationMessage;
    }

    @Override
    public String getTosAcceptance()
    {
        return tosAcceptance;
    }

    @Override
    public void setTosAcceptance( String tosAcceptance )
    {
        this.tosAcceptance = tosAcceptance;
    }
    //endregion
}
