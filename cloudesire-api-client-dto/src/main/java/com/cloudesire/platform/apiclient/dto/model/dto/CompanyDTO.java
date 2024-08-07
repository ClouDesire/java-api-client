package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Schema( description = "Vendor company" )
public class CompanyDTO extends MinimalCompanyDTO
{
    @Schema( description = "Receives event notifications targeted to all the company products")
    private String syndicationEndpoint;

    @Schema( description = "Repertorio economico amministrativo - corporate data for Italian companies")
    private String rea;

    @Schema( description = "Registro imprese - corporate data for Italian companies")
    private String ri;

    @Schema( description = "Email address that will receive technical notifications")
    @Email( regexp = Regexp.INTERNET_EMAIL )
    private String technicalEmailAddress;

    @Schema( description = "SSH RSA public keys for every employee", readOnly = true )
    private String publicKey;

    @Schema( hidden = true )
    private Integer maxPublishedProducts;

    @Schema( description = "Counts the published products on the marketplace for the company", readOnly = true )
    private Integer currentPublishedProducts = 1;

    @Schema( hidden = true )
    private Boolean trusted;

    @Schema( description = "An externalId if the company is synchronized from an external system")
    private String externalId;

    @Schema( description = "Website of the company")
    @Size( max = 1024 )
    private String companyUrl;

    @Schema( description = "Shared secret used to sign events")
    private String notificationSecretToken;

    @Schema( description = "Users of the company")
    @FieldAPI( sinceVersion = ApiVersion.V20200108 )
    private List<UrlEntityDTO> users;

    @Schema( description = "Vendors of the company", hidden = true )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20200108 )
    private List<UrlEntityDTO> vendors;

    @Schema( hidden = true )
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

    public String getPublicKey()
    {
        return publicKey;
    }

    public void setPublicKey( String publicKey )
    {
        this.publicKey = publicKey;
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

    public List<UrlEntityDTO> getUsers()
    {
        return users;
    }

    public void setUsers( List<UrlEntityDTO> users )
    {
        this.users = users;
    }

    /**
     * @deprecated by {@link #getUsers()}
     */
    @Deprecated
    public List<UrlEntityDTO> getVendors()
    {
        return vendors;
    }

    /**
     * @deprecated by {@link #setUsers(List)}
     */
    @Deprecated
    public void setVendors( List<UrlEntityDTO> vendors )
    {
        this.vendors = vendors;
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

    public static class Fields
    {
        public static final String MAX_PUBLISHED_PRODUCTS = "maxPublishedProducts";
        public static final String TRUSTED = "trusted";

        private Fields()
        {
        }
    }
}
