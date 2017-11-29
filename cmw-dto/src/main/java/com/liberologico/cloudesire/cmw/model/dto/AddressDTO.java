package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class AddressDTO extends BaseEntityDTO implements Serializable
{
    @Size( max = 255 )
    private String country;

    @Size( max = 255 )
    private String city;

    @Size( max = 255 )
    private String address;

    @Size( max = 255 )
    private String zipCode;

    @Size( min = 2, max = 2 )
    private String state;

    @Size( max = 2 )
    private String countryCode;

    public AddressDTO()
    {
    }

    public AddressDTO( String countryCode )
    {
        this.countryCode = countryCode;
    }

    public AddressDTO( String country, String city, String address, String zipCode, String state, String countryCode )
    {
        this( countryCode );
        this.country = country;
        this.city = city;
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
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

    @Override
    @JsonIgnore
    public String getSelf()
    {
        return null;
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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        AddressDTO that = (AddressDTO) o;

        if ( address != null ? !address.equals( that.address ) : that.address != null ) return false;
        if ( city != null ? !city.equals( that.city ) : that.city != null ) return false;
        if ( country != null ? !country.equals( that.country ) : that.country != null ) return false;
        if ( countryCode != null ? !countryCode.equals( that.countryCode ) : that.countryCode != null ) return false;
        if ( zipCode != null ? !zipCode.equals( that.zipCode ) : that.zipCode != null ) return false;
        if ( state != null ? !state.equals( that.state ) : that.state != null ) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + ( city != null ? city.hashCode() : 0 );
        result = 31 * result + ( address != null ? address.hashCode() : 0 );
        result = 31 * result + ( zipCode != null ? zipCode.hashCode() : 0 );
        result = 31 * result + ( state != null ? state.hashCode() : 0 );
        result = 31 * result + ( countryCode != null ? countryCode.hashCode() : 0 );
        return result;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "Address {" );
        sb.append( "country='" ).append( country ).append( '\'' );
        sb.append( ", city='" ).append( city ).append( '\'' );
        sb.append( ", address='" ).append( address ).append( '\'' );
        sb.append( ", zipCode='" ).append( zipCode ).append( '\'' );
        sb.append( ", state='" ).append( state ).append( '\'' );
        sb.append( '}' );
        return sb.toString();
    }
}
