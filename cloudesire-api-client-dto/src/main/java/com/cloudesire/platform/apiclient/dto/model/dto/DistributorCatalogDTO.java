package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class DistributorCatalogDTO extends NamedEntityDTO
{
    @Valid
    private UrlEntityDTO distributor;

    private Set<UrlEntityDTO> resellers;

    private Set<UrlEntityDTO> pricings;

    @ApiModelProperty( value = "When the catalog has been created", readOnly = true )
    private Date createdAt;

    @ApiModelProperty( value = "When the catalog has been last modified", readOnly = true )
    private Date updatedAt;

    public DistributorCatalogDTO( String name )
    {
        super( name );
    }

    public DistributorCatalogDTO()
    {
    }

    public UrlEntityDTO getDistributor()
    {
        return distributor;
    }

    public void setDistributor( UrlEntityDTO distributor )
    {
        this.distributor = distributor;
    }

    public Set<UrlEntityDTO> getResellers()
    {
        return resellers;
    }

    public void setResellers( Set<UrlEntityDTO> resellers )
    {
        this.resellers = resellers;
    }

    public Set<UrlEntityDTO> getPricings()
    {
        return pricings;
    }

    public void setPricings( Set<UrlEntityDTO> pricings )
    {
        this.pricings = pricings;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt( Date createdAt )
    {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt( Date updatedAt )
    {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        DistributorCatalogDTO that = (DistributorCatalogDTO) o;
        return Objects.equals( distributor, that.distributor ) && Objects.equals( createdAt, that.createdAt );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), distributor, createdAt );
    }
}
