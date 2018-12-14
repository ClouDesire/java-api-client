package com.cloudesire.platform.apiclient.dto.model.dto;

public class CountryCodeDTO extends BaseEntityDTO implements Comparable<CountryCodeDTO>
{
    private String countryCode;
    private String country;

    public CountryCodeDTO( String countryCode, String country )
    {
        this.countryCode = countryCode;
        this.country = country;
    }

    public CountryCodeDTO()
    {
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode( String countryCode )
    {
        this.countryCode = countryCode;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
    }

    @Override
    public int compareTo( CountryCodeDTO arg0 )
    {
        return country.compareTo( arg0.country );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        CountryCodeDTO that = (CountryCodeDTO) o;

        return compareTo( that ) == 0;
    }

    @Override
    public int hashCode()
    {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + ( country != null ? country.hashCode() : 0 );
        return result;
    }
}
