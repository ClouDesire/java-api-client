package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@ApiModel( description = "A physical address" )
public class AddressDTO extends BaseEntityDTO implements Serializable
{
    @Size( max = 255 )
    @ApiModelProperty( "Country name" )
    private String country;

    @Size( max = 255 )
    @ApiModelProperty( "City name" )
    private String city;

    @Size( max = 255 )
    @ApiModelProperty( "Street name, with number" )
    private String address;

    @Size( max = 255 )
    @ApiModelProperty( "Local postal code" )
    private String zipCode;

    @Size( min = 2, max = 2 )
    @ApiModelProperty( "Province/State code" )
    private String state;

    @Size( max = 2 )
    @ApiModelProperty( "Country code" )
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
    public String toString()
    {
        return "Address {" + "country='" + country + '\'' + ", city='" + city + '\'' + ", address='" + address + '\''
                + ", zipCode='" + zipCode + '\'' + ", state='" + state + '\'' + ", countryCode='" + countryCode + '\''
                + '}';
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        AddressDTO that = (AddressDTO) o;
        return Objects.equals( country, that.country ) && Objects.equals( city, that.city ) && Objects
                .equals( address, that.address ) && Objects.equals( zipCode, that.zipCode ) && Objects
                .equals( state, that.state ) && Objects.equals( countryCode, that.countryCode );
    }

    @Override
    public int hashCode()
    {

        return Objects.hash( country, city, address, zipCode, state, countryCode );
    }
}
