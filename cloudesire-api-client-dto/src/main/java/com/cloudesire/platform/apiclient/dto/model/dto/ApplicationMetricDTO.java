package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.cloudesire.platform.apiclient.dto.model.enums.FrequenceType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class ApplicationMetricDTO extends BaseEntityDTO
{
    @Valid
    @NotNull
    private UrlEntityDTO billingItem;

    @ApiModelProperty( "If the value of the metric always increment or not" )
    private boolean counter = false;

    @Valid
    private UrlEntityDTO applicationFile;

    @Valid
    private UrlEntityDTO product;

    @NotNull
    @ApiModelProperty( "URL to fetch a metric for syndicated products or partial path for managed products" )
    private String endpoint;

    @NotNull
    private FrequenceType frequence;

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public Boolean getCounter()
    {
        return counter;
    }

    public void setCounter( boolean counter )
    {
        this.counter = counter;
    }

    public String getEndpoint()
    {
        return endpoint;
    }

    public void setEndpoint( String endpoint )
    {
        this.endpoint = endpoint;
    }

    public FrequenceType getFrequence()
    {
        return frequence;
    }

    public void setFrequence( FrequenceType frequence )
    {
        this.frequence = frequence;
    }

    public UrlEntityDTO getApplicationFile()
    {
        return applicationFile;
    }

    public void setApplicationFile( UrlEntityDTO applicationFile )
    {
        this.applicationFile = applicationFile;
    }

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    @JsonIgnore
    public boolean isDeployedByUs()
    {
        return product == null;
    }

    @JsonIgnore
    public boolean isSyndicated()
    {
        return product != null && applicationFile == null;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        ApplicationMetricDTO that = (ApplicationMetricDTO) o;
        return counter == that.counter && billingItem.equals( that.billingItem ) && Objects
                .equals( applicationFile, that.applicationFile ) && Objects.equals( product, that.product ) && endpoint
                .equals( that.endpoint ) && frequence == that.frequence;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), billingItem, counter, applicationFile, product, endpoint, frequence );
    }
}
