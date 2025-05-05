package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;
import java.util.Map;

@JsonPropertyOrder( {
        "id", "productVersion", "name", "deploymentStatus", "type", "cloudProvider", "userCompany", "buyer", "startDate",
        "endDate", "metadata"
} )
public class SubscriptionCsvDTO implements DTO
{
    private Integer id;

    private String productVersion;

    private String name;

    private String deploymentStatus;

    private String type;

    private String cloudProvider;

    @JsonProperty( "company" )
    private String userCompany;

    @JsonProperty( "buyer" )
    private String nominee;

    private Date startDate;

    private Date endDate;

    private String metadata;

    @JsonIgnore
    private Map<String, String> customerMetadata;

    // region Auto-generated code
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( String productVersion )
    {
        this.productVersion = productVersion;
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

    public String getUserCompany()
    {
        return userCompany;
    }

    public void setUserCompany( String userCompany )
    {
        this.userCompany = userCompany;
    }

    public String getNominee()
    {
        return nominee;
    }

    public void setNominee( String nominee )
    {
        this.nominee = nominee;
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

    public String getMetadata()
    {
        return metadata;
    }

    public void setMetadata( String metadata )
    {
        this.metadata = metadata;
    }

    @JsonAnyGetter
    public Map<String, String> getCustomerMetadata()
    {
        return customerMetadata;
    }

    public void setCustomerMetadata( Map<String, String> customerMetadata )
    {
        this.customerMetadata = customerMetadata;
    }
    // endregion
}
