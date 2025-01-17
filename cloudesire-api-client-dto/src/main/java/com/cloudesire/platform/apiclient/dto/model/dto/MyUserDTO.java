package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.constants.ErrorKeys;
import com.cloudesire.platform.apiclient.dto.model.enums.UserGroup;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Schema( description = "A user that can login on the platform" )
public class MyUserDTO extends BaseEntityDTO implements INamedEntityDTO
{
    public static final String USERNAME_REGEXP = "^[a-zA-Z0-9@.+\\-_]{4,255}$";

    @NotNull
    @Pattern( regexp = USERNAME_REGEXP, message = ErrorKeys.CHARACTERS_NOT_PERMITTED )
    private String userName;

    @Schema( description = "Given name", required = true )
    @NotEmpty
    @Size( max = 255 )
    private String name;

    @Schema( description = "Family name", required = true )
    @NotEmpty
    @Size( max = 255 )
    private String surname;

    @Schema( description = "Concatenation of name and surname", readOnly = true )
    private String fullName;

    @Schema( description = "Plain-text password, used only when setting a new password")
    private String password;

    @Schema( description = "The hashed password, visible to platform administrator only", readOnly = true )
    private String passwordHash;

    @Schema( description = "Preferred user language")
    @Size( min = 2, max = 2 )
    private String language;

    @Schema( description = "User email address to receive platform notifications", required = true )
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @NotNull
    @Size( max = 255 )
    private String email;

    @Schema( description = "User PEC address for Italian electronic invoicing")
    @Email( regexp = Regexp.INTERNET_EMAIL )
    @Size( min = 7, max = 256 )
    private String pec;

    @Size( max = 20 )
    private String phoneNumber;

    @Valid
    @Schema( description = "Company of the user, if userRole is ROLE_VENDOR")
    private UrlEntityDTO company;

    @Schema( description = "Company of the user, if userRole is ROLE_USER")
    @Valid
    private UrlEntityDTO userCompany;

    @Valid
    private UrlEntityDTO companyGroup;

    @Schema( description = "Billing address of the user")
    private AddressDTO address;

    @Schema( description = "Secondary address of the user")
    private AddressDTO homeAddress;

    @Schema( description = "The platform role of the user", required = true )
    private UserRole userRole;

    private Set<UserGroup> groups;

    /**
     * These are used to populate company when creating a ROLE_VENDOR
     **/
    @Schema( description = "Write-only field to specify a company name when creating a user with userRole ROLE_VENDOR")
    private String companyName;

    @Schema( description = "Write-only field to specify a company tax code when creating a user with userRole ROLE_VENDOR")
    private String companyTaxCode;

    @Schema( description = "If the user can login or not")
    private Boolean enabled;

    @Schema( description = "If the user has a confirmed email address")
    private Boolean activated;

    @Schema( description = "If the user profile can be updated or is synchronized from an external system", readOnly = true )
    private boolean readOnly = false;

    @Schema( description = "If the user does not wants to be tracked")
    private boolean doNotTrack;

    @Schema( description = "If the user has accepted terms and conditions")
    private Boolean acceptedTerms;

    @Schema( description = "The name of the environment this user belongs to", readOnly = true )
    private String environment;

    @Schema( description = "When the user has confirmed successfully his email address")
    private Date activationDate;

    @Schema( description = "When the user has created his account")
    private Date creationDate;

    @Schema( description = "An externalId if the user is synchronized from an external system")
    private String externalId;

    @Schema( description = "The account id of the user when using the Keycloak SSO integration", readOnly = true )
    private String keycloakToken;

    @Schema( description = "If the current user is authenticated via Keycloak SSO integration")
    @JsonInclude( JsonInclude.Include.NON_DEFAULT )
    private boolean keycloakAuthenticated;

    @Schema( description = "Fiscal code of a private customer, used only when userRole is ROLE_USER")
    private String fiscalCode;

    @Schema( description = "IBAN of the user, to receive manually executed refunds")
    @Size( max = 34 )
    private String iban;

    @Schema( description = "If the user has a valid payment method available", readOnly = true )
    private boolean paymentDataSaved;

    @Schema( description = "String representation of the culture, derived from language and country code", readOnly = true, example = "en_US" )
    private String culture;

    @Schema( description = "If the user has a password set")
    private boolean passwordAlreadySet;

    @Schema( description = "If the user want to receive email notifications generated by the platform")
    private boolean subscribedToNotificationEmails = true;

    @Schema( description = "When creating a new user, if a welcome email should be sent", hidden = true )
    private Boolean sendActivationEmail;

    @Schema( description = "If the user has been deleted", readOnly = true )
    private boolean deleted;

    @Schema( hidden = true )
    private String vendorNotes;

    @Valid
    @Schema( description = "The risk profile of the user")
    private UrlEntityDTO riskProfile;

    @Schema( description = "The reseller catalog associated to the user")
    @Valid
    private UrlEntityDTO resellerCatalog;

    @Schema( description = "What roles can this user impersonate", readOnly = true )
    private Set<UserRole> canImpersonate;

    @Schema( description = "What roles can this user create", readOnly = true )
    private Set<UserRole> canCreate;

    @Schema( description = "If the user has a configured valid address", readOnly = true )
    private boolean validAddress;

    @Schema( description = "If the user has configured valid billing data", readOnly = true )
    private boolean validBillingData;

    @Schema( description = "The user's SSH public key")
    private String publicKey;

    @Schema( description = "Auto-generated string uniquely identifying the user")
    private String slug;

    @Schema( description = "Whether the user can be impersonated by the requesting client")
    private Boolean canBeImpersonated;

    @JsonIgnore
    @Override
    public String getDisplayName()
    {
        return getFullName();
    }

    @Override
    public String getResourceName()
    {
        if ( this.entityToken == null ) return "user";
        return this.entityToken;
    }

    @JsonIgnore
    public String getTaxCountryCode()
    {
        if ( address == null ) return null;
        return address.getCountryCode();
    }

    public UserRole getUserRole()
    {
        return userRole;
    }

    public void setUserRole( UserRole userRole )
    {
        this.userRole = userRole;
    }

    public Set<UserGroup> getGroups()
    {
        return groups;
    }

    public void setGroups( Set<UserGroup> groups )
    {
        this.groups = groups;
    }

    public Boolean getEnabled()
    {
        return isEnabled();
    }

    public Boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled( Boolean enabled )
    {
        this.enabled = enabled;
    }

    public AddressDTO getAddress()
    {
        return address;
    }

    public void setAddress( AddressDTO address )
    {
        this.address = address;
    }

    public AddressDTO getHomeAddress()
    {
        return homeAddress;
    }

    public void setHomeAddress( AddressDTO homeAddress )
    {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    /**
     * @deprecated by {@link #getCompany()}
     */
    @Deprecated
    public UrlEntityDTO getUserCompany()
    {
        return userCompany;
    }

    /**
     * @deprecated by {@link #setCompany(UrlEntityDTO)}
     */
    @Deprecated
    public void setUserCompany( UrlEntityDTO userCompany )
    {
        this.userCompany = userCompany;
    }

    public UrlEntityDTO getCompanyGroup()
    {
        return companyGroup;
    }

    public void setCompanyGroup( UrlEntityDTO companyGroup )
    {
        this.companyGroup = companyGroup;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPec()
    {
        return pec;
    }

    public void setPec( String pec )
    {
        this.pec = pec;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getPasswordHash()
    {
        return passwordHash;
    }

    public void setPasswordHash( String passwordHash )
    {
        this.passwordHash = passwordHash;
    }

    public Boolean getActivated()
    {
        return isActivated();
    }

    public Boolean isActivated()
    {
        return activated;
    }

    public void setActivated( Boolean activated )
    {
        this.activated = activated;
    }

    public Boolean getAcceptedTerms()
    {
        return isAcceptedTerms();
    }

    public Boolean isAcceptedTerms()
    {
        return acceptedTerms;
    }

    public void setAcceptedTerms( Boolean acceptedTerms )
    {
        this.acceptedTerms = acceptedTerms;
    }

    public String getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( String environment )
    {
        this.environment = environment;
    }

    public UrlEntityDTO getMetadata()
    {
        return new UrlEntityDTO( getSelf() + "/metadata" );
    }

    public Date getActivationDate()
    {
        return activationDate;
    }

    public void setActivationDate( Date activationDate )
    {
        this.activationDate = activationDate;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName( String companyName )
    {
        this.companyName = companyName;
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname( String surname )
    {
        this.surname = surname;
    }

    public String getExternalId()
    {
        return externalId;
    }

    public void setExternalId( String externalId )
    {
        this.externalId = externalId;
    }

    public boolean isReadOnly()
    {
        return readOnly;
    }

    public void setReadOnly( boolean readOnly )
    {
        this.readOnly = readOnly;
    }

    public boolean isDoNotTrack()
    {
        return doNotTrack;
    }

    public void setDoNotTrack( boolean doNotTrack )
    {
        this.doNotTrack = doNotTrack;
    }

    public String getCompanyTaxCode()
    {
        return companyTaxCode;
    }

    public void setCompanyTaxCode( String companyTaxCode )
    {
        this.companyTaxCode = companyTaxCode;
    }

    public String getKeycloakToken()
    {
        return keycloakToken;
    }

    public void setKeycloakToken( String keycloakToken )
    {
        this.keycloakToken = keycloakToken;
    }

    public boolean isKeycloakAuthenticated()
    {
        return keycloakAuthenticated;
    }

    public void setKeycloakAuthenticated( boolean keycloakAuthenticated )
    {
        this.keycloakAuthenticated = keycloakAuthenticated;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName( String fullName )
    {
        this.fullName = fullName;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }

    public String getFiscalCode()
    {
        return fiscalCode;
    }

    public void setFiscalCode( String fiscalCode )
    {
        this.fiscalCode = fiscalCode;
    }

    public String getIban()
    {
        return iban;
    }

    public void setIban( String iban )
    {
        this.iban = iban;
    }

    public boolean isPaymentDataSaved()
    {
        return paymentDataSaved;
    }

    public void setPaymentDataSaved( boolean paymentDataSaved )
    {
        this.paymentDataSaved = paymentDataSaved;
    }

    public String getCulture()
    {
        return culture;
    }

    public void setCulture( String culture )
    {
        this.culture = culture;
    }

    public boolean isPasswordAlreadySet()
    {
        return passwordAlreadySet;
    }

    public void setPasswordAlreadySet( boolean passwordAlreadySet )
    {
        this.passwordAlreadySet = passwordAlreadySet;
    }

    public boolean isSubscribedToNotificationEmails()
    {
        return subscribedToNotificationEmails;
    }

    public void setSubscribedToNotificationEmails( boolean subscribedToNotificationEmails )
    {
        this.subscribedToNotificationEmails = subscribedToNotificationEmails;
    }

    /**
     * @deprecated by {@link EnvironmentDTO.ConfigurationEnvironment#getSendActivationEmail()}
     */
    @Deprecated
    public Boolean getSendActivationEmail()
    {
        return sendActivationEmail;
    }

    /**
     * @deprecated by {@link EnvironmentDTO.ConfigurationEnvironment#setSendActivationEmail(Boolean)}
     */
    @Deprecated
    public void setSendActivationEmail( Boolean sendActivationEmail )
    {
        this.sendActivationEmail = sendActivationEmail;
    }

    public boolean isDeleted()
    {
        return deleted;
    }

    public void setDeleted( boolean deleted )
    {
        this.deleted = deleted;
    }

    public String getVendorNotes()
    {
        return vendorNotes;
    }

    public void setVendorNotes( String vendorNotes )
    {
        this.vendorNotes = vendorNotes;
    }

    public UrlEntityDTO getRiskProfile()
    {
        return riskProfile;
    }

    public void setRiskProfile( UrlEntityDTO riskProfile )
    {
        this.riskProfile = riskProfile;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public Set<UserRole> getCanImpersonate()
    {
        return canImpersonate;
    }

    public void setCanImpersonate( Set<UserRole> canImpersonate )
    {
        this.canImpersonate = canImpersonate;
    }

    public Set<UserRole> getCanCreate()
    {
        return canCreate;
    }

    public void setCanCreate( Set<UserRole> canCreate )
    {
        this.canCreate = canCreate;
    }

    public boolean isValidAddress()
    {
        return validAddress;
    }

    public void setValidAddress( boolean validAddress )
    {
        this.validAddress = validAddress;
    }

    public boolean isValidBillingData()
    {
        return validBillingData;
    }

    public void setValidBillingData( boolean validBillingData )
    {
        this.validBillingData = validBillingData;
    }

    public String getPublicKey()
    {
        return publicKey;
    }

    public void setPublicKey( String publicKey )
    {
        this.publicKey = publicKey;
    }

    public String getSlug()
    {
        return slug;
    }

    public void setSlug( String slug )
    {
        this.slug = slug;
    }

    public Boolean getCanBeImpersonated()
    {
        return canBeImpersonated;
    }

    public void setCanBeImpersonated( Boolean canBeImpersonated )
    {
        this.canBeImpersonated = canBeImpersonated;
    }

    @Override
    public String toString()
    {
        return "MyUserDTO{" + "userName='" + userName + '\'' + ", userRole='" + userRole + '\'' + '}';
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        MyUserDTO myUserDTO = (MyUserDTO) o;
        return Objects.equals( userName, myUserDTO.userName ) && Objects.equals( email, myUserDTO.email )
                && userRole == myUserDTO.userRole;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash( super.hashCode(), userName, email, userRole );
    }
}
