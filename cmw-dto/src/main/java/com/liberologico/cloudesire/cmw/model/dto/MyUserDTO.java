package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.cmw.model.enums.UserGroup;
import com.liberologico.cloudesire.cmw.model.enums.UserRole;
import com.liberologico.cloudesire.cmw.model.utils.ConstraintKeys;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class MyUserDTO extends NamedEntityDTO
{
    public static final String USERNAME_REGEXP = "^[a-zA-Z0-9@.+\\-_]{4,255}$";
    
    @Pattern( regexp = USERNAME_REGEXP, message = ConstraintKeys.CHARACTERS_NOT_PERMITTED )
    private String userName;

    @NotEmpty
    private String surname;

    private String fullName;

    private String password;

    private String passwordHash;

    @NotNull
    private String language = "en";

    @NotEmpty
    @Email( regexp = Regexp.INTERNET_EMAIL )
    private String email;

    private String phoneNumber;

    @Valid
    private UrlEntityDTO company;

    @Valid
    private UrlEntityDTO userCompany;

    private AddressDTO address;

    private AddressDTO homeAddress;

    @NotEmpty
    private String userRole = "ROLE_USER";

    private List<UserGroup> groups;

    /**
     * These are used to populate company when creating a ROLE_VENDOR
     **/
    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String companyName;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String companyTaxCode;

    private Boolean enabled;

    private Boolean activated;

    private boolean readOnly = false;

    private Boolean acceptedTerms;

    private String environment;
    
    private Date activationDate;

    private Date creationDate;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String externalId;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String facebookToken;

    @JsonInclude ( JsonInclude.Include.NON_DEFAULT )
    private boolean facebookAuthenticated = false;

    private String fiscalCode;

    @Size( max = 34 )
    private String iban;

    private boolean paymentDataSaved;

    /**
     * Auto generated from language and address.countryCode
     */
    private String culture;

    private String vatExemptionDeclarationNumber;
    private Date vatExemptionDeclarationDate;
    private String vatExemptionInternalProtocolNumber;

    private boolean passwordAlreadySet;

    private boolean subscribedToNotificationEmails = true;

    private Boolean sendActivationEmail;

    private boolean deleted;

    private String vendorNotes;

    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" )
    private Date birthday;

    private String birthPlace;

    private String gender;

    private IdentificationDocumentDTO document;

    @Valid
    private UrlEntityDTO riskProfile;

    @ApiModelProperty( value = "What roles can this user impersonate", readOnly = true )
    private Set<UserRole> canImpersonate;

    @ApiModelProperty( value = "What roles can this user create", readOnly = true )
    private Set<UserRole> canCreate;

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

    public String getUserRole()
    {
        return userRole;
    }

    public void setUserRole( String userRole )
    {
        this.userRole = userRole;
    }

    public void setUserRole( @NotNull UserRole userRole )
    {
        this.userRole = userRole.toString();
    }

    public List<UserGroup> getGroups()
    {
        return groups;
    }

    public void setGroups( List<UserGroup> groups )
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

    public UrlEntityDTO getUserCompany()
    {
        return userCompany;
    }

    public void setUserCompany( UrlEntityDTO userCompany )
    {
        this.userCompany = userCompany;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
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

    public String getPasswordHash ()
    {
        return passwordHash;
    }

    public void setPasswordHash ( String passwordHash )
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

    public String getCompanyTaxCode()
    {
        return companyTaxCode;
    }

    public void setCompanyTaxCode( String companyTaxCode )
    {
        this.companyTaxCode = companyTaxCode;
    }

    public String getFacebookToken()
    {
        return facebookToken;
    }

    public void setFacebookToken( String facebookToken )
    {
        this.facebookToken = facebookToken;
    }

    public boolean isFacebookAuthenticated()
    {
        return facebookAuthenticated;
    }

    public void setFacebookAuthenticated( boolean facebookAuthenticated )
    {
        this.facebookAuthenticated = facebookAuthenticated;
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
        return language.toLowerCase();
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

    public String getVatExemptionDeclarationNumber()
    {
        return vatExemptionDeclarationNumber;
    }

    public void setVatExemptionDeclarationNumber( String vatExemptionDeclarationNumber )
    {
        this.vatExemptionDeclarationNumber = vatExemptionDeclarationNumber;
    }

    public Date getVatExemptionDeclarationDate()
    {
        return vatExemptionDeclarationDate;
    }

    public void setVatExemptionDeclarationDate( Date vatExemptionDeclarationDate )
    {
        this.vatExemptionDeclarationDate = vatExemptionDeclarationDate;
    }

    public String getVatExemptionInternalProtocolNumber()
    {
        return vatExemptionInternalProtocolNumber;
    }

    public void setVatExemptionInternalProtocolNumber( String vatExemptionInternalProtocolNumber )
    {
        this.vatExemptionInternalProtocolNumber = vatExemptionInternalProtocolNumber;
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

    public Boolean getSendActivationEmail()
    {
        return sendActivationEmail;
    }

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

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday( Date birthday )
    {
        this.birthday = birthday;
    }

    public String getBirthPlace()
    {
        return birthPlace;
    }

    public void setBirthPlace( String birthPlace )
    {
        this.birthPlace = birthPlace;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender( String gender )
    {
        this.gender = gender;
    }

    public IdentificationDocumentDTO getDocument()
    {
        return document;
    }

    public void setDocument( IdentificationDocumentDTO document )
    {
        this.document = document;
    }

    public UrlEntityDTO getRiskProfile()
    {
        return riskProfile;
    }

    public void setRiskProfile( UrlEntityDTO riskProfile )
    {
        this.riskProfile = riskProfile;
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
        if ( ! super.equals( o ) ) return false;
        MyUserDTO myUserDTO = (MyUserDTO) o;
        return Objects.equals( userName, myUserDTO.userName ) && Objects.equals( email, myUserDTO.email ) && Objects
                .equals( userRole, myUserDTO.userRole );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), userName, email, userRole );
    }
}
