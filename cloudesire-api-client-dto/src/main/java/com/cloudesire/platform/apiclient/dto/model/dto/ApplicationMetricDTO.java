package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.cloudesire.platform.apiclient.dto.model.enums.FrequenceType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
}