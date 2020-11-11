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
}
