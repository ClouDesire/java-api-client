package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CompanyDTO extends MinimalCompanyDTO
{
    public static final String MAX_CONCURRENT_INSTANCE = "maxConcurrentInstance";
    public static final String MAX_PUBLISHED_PRODUCTS = "maxPublishedProducts";
    public static final String SLUG = "slug";
    public static final String TRUSTED = "trusted";

    private String syndicationEndpoint;

    private String rea;

    private String ri;

    @ApiModelProperty(value = "Which type of corporate form")
    @Size( max = 255 )
    private String form;

    private String language = "EN";

    @Email( regexp = Regexp.INTERNET_EMAIL )
    private String technicalEmailAddress;

    private Boolean enableProviderCredential;

    private Integer maxConcurrentInstance;

    private String publicKey;

    private Integer maxPublishedProducts;

    private Integer currentPublishedProducts = 1;

    private Boolean trusted;

    @JsonInclude ( Include.NON_NULL )
    private String externalId;

    private Date lastInboundInvoice;

    @Size( max = 1024 )
    private String companyUrl;

    private String notificationSecretToken;

    @Valid
    private BankAccountDataDTO bankAccountData;

    private List<UrlEntityDTO> vendors;

    private CompanyFeatureTogglesDTO featureToggles;

    public enum Type
    {
        COMPANY, CUSTOMER_COMPANY
    }

    public CompanyDTO( String name, String taxCode )
    {
        this( name );
        setTaxCode( taxCode );
    }

    public CompanyDTO( String name )
    {
        super( name );
    }

    public CompanyDTO()
    {
        super();
    }

    public String getTechnicalEmailAddress()
    {
        return technicalEmailAddress;
    }

    public void setTechnicalEmailAddress( String technicalEmailAddress )
    {
        this.technicalEmailAddress = technicalEmailAddress;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }

    public String getRea()
    {
        return rea;
    }

    public void setRea( String rea )
    {
        this.rea = rea;
    }

    public String getRi()
    {
        return ri;
    }

    public void setRi( String ri )
    {
        this.ri = ri;
    }

    public Boolean getEnableProviderCredential()
    {
        return enableProviderCredential;
    }

    public void setEnableProviderCredential( Boolean enableProviderCredential )
    {
        this.enableProviderCredential = enableProviderCredential;
    }

    public Integer getMaxConcurrentInstance()
    {
        return maxConcurrentInstance;
    }

    public void setMaxConcurrentInstance( Integer maxConcurrentInstance )
    {
        this.maxConcurrentInstance = maxConcurrentInstance;
    }

    public String getPublicKey()
    {
        return publicKey;
    }

    public void setPublicKey( String publicKey )
    {
        this.publicKey = publicKey;
    }

    public Date getLastInboundInvoice()
    {
        return lastInboundInvoice;
    }

    public void setLastInboundInvoice( Date lastInboundInvoice )
    {
        this.lastInboundInvoice = lastInboundInvoice;
    }

    public Integer getMaxPublishedProducts()
    {
        return maxPublishedProducts;
    }

    public void setMaxPublishedProducts( Integer maxPublishedProducts )
    {
        this.maxPublishedProducts = maxPublishedProducts;
    }

    public String getExternalId()
    {
        return externalId;
    }

    public void setExternalId( String externalId )
    {
        this.externalId = externalId;
    }

    public Integer getCurrentPublishedProducts()
    {
        return currentPublishedProducts;
    }

    public void setCurrentPublishedProducts( Integer currentPublishedProducts )
    {
        this.currentPublishedProducts = currentPublishedProducts;
    }

    public String getSyndicationEndpoint()
    {
        return syndicationEndpoint;
    }

    public void setSyndicationEndpoint( String syndicationEndpoint )
    {
        this.syndicationEndpoint = syndicationEndpoint;
    }

    public Boolean isTrusted()
    {
        return trusted;
    }

    public void setTrusted( Boolean trusted )
    {
        this.trusted = trusted;
    }

    public String getCompanyUrl()
    {
        return companyUrl;
    }

    public void setCompanyUrl( String companyUrl )
    {
        this.companyUrl = companyUrl;
    }

    public String getNotificationSecretToken()
    {
        return notificationSecretToken;
    }

    public void setNotificationSecretToken( String notificationSecretToken )
    {
        this.notificationSecretToken = notificationSecretToken;
    }

    public List<UrlEntityDTO> getVendors()
    {
        return vendors;
    }

    public void setVendors( List<UrlEntityDTO> vendors )
    {
        this.vendors = vendors;
    }

    public String getForm()
    {
        return form;
    }

    public void setForm( String form )
    {
        this.form = form;
    }

    public BankAccountDataDTO getBankAccountData()
    {
        return bankAccountData;
    }

    public void setBankAccountData( BankAccountDataDTO bankAccountData )
    {
        this.bankAccountData = bankAccountData;
    }

    public CompanyFeatureTogglesDTO getFeatureToggles()
    {
        return featureToggles;
    }

    public void setFeatureToggles( CompanyFeatureTogglesDTO featureToggles )
    {
        this.featureToggles = featureToggles;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        return o instanceof CompanyDTO && super.equals( o );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode() );
    }
}
