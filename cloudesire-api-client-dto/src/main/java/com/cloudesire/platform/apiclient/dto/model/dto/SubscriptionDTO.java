package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.dto.ActionDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Set;

public class SubscriptionDTO extends BaseSubscriptionDTO
{
    @ApiModelProperty( value = "Extra resources for this subscription", readOnly = true )
    private List<SubscriptionBillingItemDTO> billingItems;

    private Set<ActionDTO> availableOperations = null;

    @ApiModelProperty( "Slug of the reseller company for the subscription" )
    private String resellerSlug;

    private UrlEntityDTO resellerCatalog;

    private UrlEntityDTO cloudCredential;

    public List<SubscriptionBillingItemDTO> getBillingItems()
    {
        return billingItems;
    }

    public void setBillingItems( List<SubscriptionBillingItemDTO> billingItems )
    {
        this.billingItems = billingItems;
    }

    public Set<ActionDTO> getAvailableOperations()
    {
        return availableOperations;
    }

    public void setAvailableOperations( Set<ActionDTO> availableOperations )
    {
        this.availableOperations = availableOperations;
    }

    public String getResellerSlug()
    {
        return resellerSlug;
    }

    public void setResellerSlug( String resellerSlug )
    {
        this.resellerSlug = resellerSlug;
    }

    public UrlEntityDTO getResellerCatalog()
    {
        return resellerCatalog;
    }

    public void setResellerCatalog( UrlEntityDTO resellerCatalog )
    {
        this.resellerCatalog = resellerCatalog;
    }

    public UrlEntityDTO getCloudCredential()
    {
        return cloudCredential;
    }

    public void setCloudCredential( UrlEntityDTO cloudCredential )
    {
        this.cloudCredential = cloudCredential;
    }
}
