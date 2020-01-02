package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.HttpMethods;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class CommentDTO extends BaseEntityDTO
{
    @ApiModelProperty( "The username of the commenting User" )
    private String userName;

    @ApiModelProperty( "The real name of the commenting User" )
    private String realName;

    @NotNull
    @Valid
    private UrlEntityDTO product;

    @ApiModelProperty( "Product rating" )
    private Integer rating;

    @ApiModelProperty( "The actual comment" )
    private String comment;

    @ApiModelProperty( "Comment date" )
    private Date date;

    private Set<HttpMethods> availableOperations = null;

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment( String comment )
    {
        this.comment = comment;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public Integer getRating()
    {
        return rating;
    }

    public void setRating( Integer rating )
    {
        this.rating = rating;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getRealName()
    {
        return realName;
    }

    public void setRealName( String realName )
    {
        this.realName = realName;
    }

    public Set<HttpMethods> getAvailableOperations()
    {
        return availableOperations;
    }

    public void setAvailableOperations( Set<HttpMethods> availableOperations )
    {
        this.availableOperations = availableOperations;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        CommentDTO that = (CommentDTO) o;
        return Objects.equals( userName, that.userName ) && Objects.equals( product, that.product ) && Objects
                .equals( rating, that.rating ) && Objects.equals( comment, that.comment ) && Objects
                .equals( date, that.date );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), userName, product, rating, comment, date );
    }
}
