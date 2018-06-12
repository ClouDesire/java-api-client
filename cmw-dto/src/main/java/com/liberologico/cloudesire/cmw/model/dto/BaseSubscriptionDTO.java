package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.DeploymentStatusEnum;
import com.liberologico.cloudesire.common.enums.dto.ActionDTO;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class BaseSubscriptionDTO extends NamedEntityDTO
{
    @ApiModelProperty( value = "When the first billing period is started, after the successful provisioning", readOnly = true )
    private Date startDate;

    @ApiModelProperty( value = "When the subscription expire, if not renewed", readOnly = true )
    private Date endDate;

    @ApiModelProperty( value = "Current status of the subscription", readOnly = true )
    private DeploymentStatusEnum deploymentStatus;

    @Valid
    private Set<UrlEntityDTO> virtualMachineInstance = new HashSet<>();

    @Deprecated
    @Valid
    private List<UrlEntityDTO> deploymentStatusStory = new LinkedList<>();

    @ApiModelProperty( value = "The list of status updates for the subscription", readOnly = true )
    private List<DeploymentStatusDTO> deploymentLog;

    @Valid
    private List<UrlEntityDTO> orders = new LinkedList<>();

    @Valid
    private List<UrlEntityDTO> invoices = new LinkedList<>();

    @ApiModelProperty( value = "The duration in months of the billing period", readOnly = true )
    private Integer billingPeriod;

    @ApiModelProperty( value = "When the next invoice will be emitted", readOnly = true )
    private Date nextInvoice;

    @ApiModelProperty( value = "When the last invoice has been emitted", readOnly = true )
    private Date lastInvoice;

    @ApiModelProperty( value = "The type of this subscription", readOnly = true, allowableValues = "NORMAL, TRIAL, SANDBOX" )
    private String type;

    @Deprecated
    @ApiModelProperty( hidden = true )
    private Set<String> syndicatedEndpoints;

    @ApiModelProperty( "End-User instructions to use the product" )
    @Length( max = 4096 )
    private String endUserInstructions;

    @Valid
    private UrlEntityDTO product;

    @Valid
    private UrlEntityDTO company;

    @Valid
    private UrlEntityDTO buyer;

    @ApiModelProperty( value = "When the subscription has been created", readOnly = true )
    private Date createdAt;

    @ApiModelProperty( value = "When the subscription has been modified", readOnly = true )
    private Date updatedAt;

    @ApiModelProperty( value = "How many bandwidth in GB is available for the subscritpion", readOnly = true )
    private BigInteger bandwidthInGB;

    private Set<ActionDTO> availableOperations = null;

    @ApiModelProperty( "If the subscription automatically renews before expiring or not" )
    private boolean autoRenew;

    @ApiModelProperty( value = "Historical serialized data of the subscription", readOnly = true )
    private String productBillingInfo;

    private List<RecurringCostLineDTO> recurringCosts = new ArrayList<>();

    private Set<EndpointDTO> endpoints = new HashSet<>();

    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO cloudProvider;

    @Valid
    private UrlEntityDTO coupon;

    @Valid
    @ApiModelProperty( value = "The value chosen by the customer for a list of ConfigurationParameters", example = "{ \"configurationParameter/123\": \"custom_value\"}" )
    private Map<UrlEntityDTO, String> configurationParameters = new HashMap<>();

    public UrlEntityDTO getMetadata()
    {
        return new UrlEntityDTO( getSelf() + "/metadata" );
    }

    @ApiModelProperty( value = "If every emitted invoice has been paid", readOnly = true )
    private boolean paid;

    // region Auto-generated code
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

    public DeploymentStatusEnum getDeploymentStatus()
    {
        return deploymentStatus;
    }

    public void setDeploymentStatus( DeploymentStatusEnum deploymentStatus )
    {
        this.deploymentStatus = deploymentStatus;
    }

    public List<UrlEntityDTO> getOrders()
    {
        return orders;
    }

    public void setOrders( List<UrlEntityDTO> orders )
    {
        this.orders = orders;
    }

    public Integer getBillingPeriod()
    {
        return billingPeriod;
    }

    public void setBillingPeriod( Integer billingPeriod )
    {
        this.billingPeriod = billingPeriod;
    }

    public Date getNextInvoice()
    {
        return nextInvoice;
    }

    public void setNextInvoice( Date nextInvoice )
    {
        this.nextInvoice = nextInvoice;
    }

    public Date getLastInvoice()
    {
        return lastInvoice;
    }

    public void setLastInvoice( Date lastInvoice )
    {
        this.lastInvoice = lastInvoice;
    }

    public List<UrlEntityDTO> getInvoices()
    {
        return invoices;
    }

    public void setInvoices( List<UrlEntityDTO> invoices )
    {
        this.invoices = invoices;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public Set<EndpointDTO> getEndpoints()
    {
        return endpoints;
    }

    public BaseSubscriptionDTO setEndpoints( Set<EndpointDTO> endpoints )
    {
        this.endpoints = endpoints;
        return this;
    }

    @Deprecated
    public Set<String> getSyndicatedEndpoints()
    {
        return syndicatedEndpoints;
    }

    @Deprecated
    public void setSyndicatedEndpoints( Set<String> syndicatedEndpoints )
    {
        this.syndicatedEndpoints = syndicatedEndpoints;
    }

    public String getEndUserInstructions()
    {
        return endUserInstructions;
    }

    public void setEndUserInstructions( String endUserIstructions )
    {
        this.endUserInstructions = endUserIstructions;
    }

    public Set<UrlEntityDTO> getVirtualMachineInstance()
    {
        return virtualMachineInstance;
    }

    public void setVirtualMachineInstance( Set<UrlEntityDTO> virtualMachineInstance )
    {
        this.virtualMachineInstance = virtualMachineInstance;
    }

    @Deprecated
    public List<UrlEntityDTO> getDeploymentStatusStory()
    {
        return deploymentStatusStory;
    }

    @Deprecated
    public void setDeploymentStatusStory( List<UrlEntityDTO> deploymentStatusStory )
    {
        this.deploymentStatusStory = deploymentStatusStory;
    }

    public List<DeploymentStatusDTO> getDeploymentLog()
    {
        return deploymentLog;
    }

    public void setDeploymentLog( List<DeploymentStatusDTO> deploymentLog )
    {
        this.deploymentLog = deploymentLog;
    }

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    public UrlEntityDTO getCompany()
    {
        return company;
    }

    public void setCompany( UrlEntityDTO company )
    {
        this.company = company;
    }

    public UrlEntityDTO getBuyer()
    {
        return buyer;
    }

    public void setBuyer( UrlEntityDTO buyer )
    {
        this.buyer = buyer;
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

    public BigInteger getBandwidthInGB()
    {
        return bandwidthInGB;
    }

    public void setBandwidthInGB( BigInteger bandwidthInGB )
    {
        this.bandwidthInGB = bandwidthInGB;
    }

    public Set<ActionDTO> getAvailableOperations()
    {
        return availableOperations;
    }

    public void setAvailableOperations( Set<ActionDTO> availableOperations )
    {
        this.availableOperations = availableOperations;
    }

    public boolean getAutoRenew()
    {
        return autoRenew;
    }

    public void setAutoRenew( boolean autoRenew )
    {
        this.autoRenew = autoRenew;
    }

    public UrlEntityDTO getProductVersion()
    {
        return productVersion;
    }

    public void setProductVersion( UrlEntityDTO productVersion )
    {
        this.productVersion = productVersion;
    }

    public List<RecurringCostLineDTO> getRecurringCosts()
    {
        return recurringCosts;
    }

    public BaseSubscriptionDTO setRecurringCosts( List<RecurringCostLineDTO> recurringCosts )
    {
        this.recurringCosts = recurringCosts;
        return this;
    }

    public String getProductBillingInfo()
    {
        return productBillingInfo;
    }

    public void setProductBillingInfo( String productBillingInfo )
    {
        this.productBillingInfo = productBillingInfo;
    }

    public UrlEntityDTO getCoupon()
    {
        return coupon;
    }

    public void setCoupon( UrlEntityDTO coupon )
    {
        this.coupon = coupon;
    }

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public BaseSubscriptionDTO setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public boolean isPaid()
    {
        return paid;
    }

    public void setPaid( boolean paid )
    {
        this.paid = paid;
    }

    public UrlEntityDTO getCloudProvider()
    {
        return cloudProvider;
    }

    public void setCloudProvider( UrlEntityDTO cloudProvider )
    {
        this.cloudProvider = cloudProvider;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof BaseSubscriptionDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        BaseSubscriptionDTO that = (BaseSubscriptionDTO) o;
        return Objects.equals( startDate, that.startDate ) && Objects.equals( endDate, that.endDate )
                && deploymentStatus == that.deploymentStatus && Objects.equals( type, that.type ) && Objects
                .equals( createdAt, that.createdAt ) && Objects.equals( updatedAt, that.updatedAt );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), startDate, endDate, deploymentStatus, type, createdAt, updatedAt );
    }
    // endregion
}
