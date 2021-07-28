package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.util.Date;

@JsonPropertyOrder( { "id", "name", "deploymentStatus", "type", "cloudProvider", "buyer", "startDate", "endDate" } )
public class SubscriptionCsvDTO implements DTO
{
    private Integer id;

    private String name;

    private String deploymentStatus;

    private String type;

    private String cloudProvider;

    private String buyer;

    private Date startDate;

    private Date endDate;

    // region Auto-generated code
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDeploymentStatus()
    {
        return deploymentStatus;
    }

    public void setDeploymentStatus( String deploymentStatus )
    {
        this.deploymentStatus = deploymentStatus;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( String cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    public String getBuyer()
    {
        return buyer;
    }

    public void setBuyer( String buyer )
    {
        this.buyer = buyer;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate( Date startDate )
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate( Date endDate )
    {
        this.endDate = endDate;
    }
    // endregion
}
