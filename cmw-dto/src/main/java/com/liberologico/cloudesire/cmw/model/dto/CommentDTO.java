package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.HttpMethods;
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

    @Valid
    private UrlEntityDTO product;

    @ApiModelProperty( "Product rating" )
    private int rating = 3;

    @ApiModelProperty( "The actual comment" )
    @NotNull
    private String comment;

    @ApiModelProperty( "Comment date" )
    private Date date = new Date();

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

    public int getRating()
    {
        return rating;
    }

    public void setRating( int rating )
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
        if ( !( o instanceof CommentDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        CommentDTO that = (CommentDTO) o;
        return getRating() == that.getRating() && Objects.equals( getUserName(), that.getUserName() ) && Objects
                .equals( getProduct(), that.getProduct() ) && Objects.equals( getComment(), that.getComment() )
                && Objects.equals( getDate(), that.getDate() );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), getUserName(), getProduct(), getRating(), getComment(), getDate() );
    }
}
