package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Map;

import static com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys.INVALID_SIZE;

@ApiModel( "A draft of a product description" )
public class ProductDraftDTO extends BaseEntityDTO implements ProductL10nDTO
{
    @Valid
    private UrlEntityDTO original;

    @ApiModelProperty( "Short description of the product" )
    @Size( max = 4000, message = INVALID_SIZE )
    private String shortDescription;

    @ApiModelProperty( "Long description of the product" )
    @Size( max = 8192, message = INVALID_SIZE )
    private String longDescription;

    @ApiModelProperty( "Instructions shown to the customer that buys a subscription" )
    private String endUserInstructions;

    @ApiModelProperty( "Terms of service" )
    private String termsOfService;

    @ApiModelProperty( "Privacy policy" )
    private String privacy;

    @ApiModelProperty( "Service level agreement" )
    private String serviceLevelAgreement;

    @ApiModelProperty( "Localized product metadata" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Map<String, Object> extraData;

    @ApiModelProperty( "Frequently asked questions" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    private Map<String, String> faq;

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
    //endregion
}
