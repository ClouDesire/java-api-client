package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonPropertyOrder( {
        "userName", "name", "surname", "email", "pec", "phone", "password", "language", "enabled", "acceptedTerms",
        "activated", "fiscalCode", "companyName", "taxCode"
} )
public class CustomerCsvDTO extends BaseUserCsvDTO
{
    private String userName;

    private String password;

    private String language;

    private Boolean enabled;

    private Boolean acceptedTerms;

    private Boolean activated;

    private String fiscalCode;

    private String companyName;

    private String taxCode;

    @JsonUnwrapped( prefix = "address." )
    private Address address;

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

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String language )
    {
        this.language = language;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled( Boolean enabled )
    {
        this.enabled = enabled;
    }

    public Boolean getAcceptedTerms()
    {
        return acceptedTerms;
    }

    public void setAcceptedTerms( Boolean acceptedTerms )
    {
        this.acceptedTerms = acceptedTerms;
    }

    public Boolean getActivated()
    {
        return activated;
    }

    public void setActivated( Boolean activated )
    {
        this.activated = activated;
    }

    public String getFiscalCode()
    {
        return fiscalCode;
    }

    public void setFiscalCode( String fiscalCode )
    {
        this.fiscalCode = fiscalCode;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress( Address address )
    {
        this.address = address;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName( String companyName )
    {
        this.companyName = companyName;
    }

    public String getTaxCode()
    {
        return taxCode;
    }

    public void setTaxCode( String taxCode )
    {
        this.taxCode = taxCode;
    }

    @JsonPropertyOrder( {
            "country", "countryCode", "state", "city", "address", "zipCode"
    } )
    public static class Address
    {
        private String country;

        private String countryCode;

        private String state;

        private String city;

        private String address;

        private String zipCode;

        public String getCountry()
        {
            return country;
        }

        public void setCountry( String country )
        {
            this.country = country;
        }

        public String getCountryCode()
        {
            return countryCode;
        }

        public void setCountryCode( String countryCode )
        {
            this.countryCode = countryCode;
        }

        public String getState()
        {
            return state;
        }

        public void setState( String state )
        {
            this.state = state;
        }

        public String getCity()
        {
            return city;
        }

        public void setCity( String city )
        {
            this.city = city;
        }

        public String getAddress()
        {
            return address;
        }

        public void setAddress( String address )
        {
            this.address = address;
        }

        public String getZipCode()
        {
            return zipCode;
        }

        public void setZipCode( String zipCode )
        {
            this.zipCode = zipCode;
        }
    }
}
