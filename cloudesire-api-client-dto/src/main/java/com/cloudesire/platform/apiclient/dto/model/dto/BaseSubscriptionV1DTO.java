package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.DeploymentStatus;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static com.cloudesire.platform.apiclient.dto.ApiVersion.V20201202;
import static com.cloudesire.platform.apiclient.dto.ApiVersion.V20220211;
import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY;

public abstract class BaseSubscriptionV1DTO extends NamedEntityDTO
{
    @ApiModelProperty( value = "When the first billing period is started, after the successful provisioning", readOnly = true )
    private Date startDate;

    @ApiModelProperty( value = "When the subscription expire, if not renewed", readOnly = true )
    private Date endDate;

    @ApiModelProperty( value = "Current status of the subscription", readOnly = true )
    private DeploymentStatus deploymentStatus;

    @Valid
    private Set<UrlEntityDTO> virtualMachineInstance = new HashSet<>();

    /**
     * @deprecated use {@link #deploymentLog}
     */
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

    @ApiModelProperty( "When the current billing period has started" )
    @FieldAPI( sinceVersion = V20201202 )
    private Date billingPeriodStart;

    @ApiModelProperty( hidden = true )
    @UnsupportedAPI( sinceVersion = V20201202 )
    private Date lastInvoice;

    @ApiModelProperty( "When the current billing period will end" )
    @FieldAPI( sinceVersion = V20220211 )
    private Date billingPeriodEnd;

    @ApiModelProperty( hidden = true )
    @UnsupportedAPI( sinceVersion = V20220211 )
    private Date nextInvoice;

    @ApiModelProperty( value = "The type of this subscription", allowableValues = "NORMAL, TRIAL, SANDBOX", accessMode = READ_ONLY )
    private OrderType type;

    /**
     * @deprecated use {@link #endpoints}
     */
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

    @ApiModelProperty( value = "When the subscription has been last modified", readOnly = true )
    private Date updatedAt;

    @ApiModelProperty( value = "How much bandwidth in GB is available", readOnly = true )
    private BigDecimal bandwidth;

    /**
     * @deprecated by {@link #bandwidth}
     */
    @ApiModelProperty( value = "Deprecated", hidden = true )
    @Deprecated
    private BigInteger bandwidthInGB;

    @ApiModelProperty( "If the subscription automatically renews before expiring or not" )
    private boolean autoRenew;

    @ApiModelProperty( value = "Historical serialized data of the subscription", readOnly = true )
    private String productBillingInfo;

    private Set<EndpointDTO> endpoints = new HashSet<>();

    @Valid
    private UrlEntityDTO productVersion;

    @Valid
    private UrlEntityDTO cloudProvider;

    @Valid
    private UrlEntityDTO coupon;

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

    public DeploymentStatus getDeploymentStatus()
    {
        return deploymentStatus;
    }

    public void setDeploymentStatus( DeploymentStatus deploymentStatus )
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

    public Date getBillingPeriodStart()
    {
        return billingPeriodStart;
    }

    public void setBillingPeriodStart( Date billingPeriodStart )
    {
        this.billingPeriodStart = billingPeriodStart;
    }

    public Date getBillingPeriodEnd()
    {
        return billingPeriodEnd;
    }

    public void setBillingPeriodEnd( Date billingPeriodEnd )
    {
        this.billingPeriodEnd = billingPeriodEnd;
    }

    /**
     * @deprecated by {@link #getBillingPeriodStart()}
     */
    @Deprecated
    public Date getLastInvoice()
    {
        return lastInvoice;
    }

    /**
     * @deprecated by {@link #setBillingPeriodStart(Date)}
     */
    @Deprecated
    public void setLastInvoice( Date lastInvoice )
    {
        this.lastInvoice = lastInvoice;
    }

    /**
     * @deprecated by {@link #getBillingPeriodEnd()}
     */
    @Deprecated
    public Date getNextInvoice()
    {
        return nextInvoice;
    }

    /**
     * @deprecated by {@link #setBillingPeriodEnd(Date)}
     */
    @Deprecated
    public void setNextInvoice( Date nextInvoice )
    {
        this.nextInvoice = nextInvoice;
    }

    public List<UrlEntityDTO> getInvoices()
    {
        return invoices;
    }

    public void setInvoices( List<UrlEntityDTO> invoices )
    {
        this.invoices = invoices;
    }

    public OrderType getType()
    {
        return type;
    }

    public void setType( OrderType type )
    {
        this.type = type;
    }

    public Set<EndpointDTO> getEndpoints()
    {
        return endpoints;
    }

    public BaseSubscriptionV1DTO setEndpoints( Set<EndpointDTO> endpoints )
    {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * @deprecated use {@link #getEndpoints()}
     */
    @Deprecated
    public Set<String> getSyndicatedEndpoints()
    {
        return syndicatedEndpoints;
    }

    /**
     * @deprecated use {@link #setEndpoints(Set)}
     */
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

    /**
     * @deprecated use {@link #getDeploymentLog()}
     */
    @Deprecated
    public List<UrlEntityDTO> getDeploymentStatusStory()
    {
        return deploymentStatusStory;
    }

    /**
     * @deprecated use {@link #setDeploymentLog(List)}
     */
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

    public BigDecimal getBandwidth()
    {
        return bandwidth;
    }

    public void setBandwidth( BigDecimal bandwidth )
    {
        this.bandwidth = bandwidth;
    }

    /**
     * @deprecated use {@link #getBandwidth()}
     */
    @Deprecated
    public BigInteger getBandwidthInGB()
    {
        return bandwidthInGB;
    }

    /**
     * @deprecated use {@link #setBandwidth(BigDecimal)}
     */
    @Deprecated
    public void setBandwidthInGB( BigInteger bandwidthInGB )
    {
        this.bandwidthInGB = bandwidthInGB;
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
        if ( ! ( o instanceof BaseSubscriptionV1DTO ) ) return false;
        if ( ! super.equals( o ) ) return false;
        BaseSubscriptionV1DTO that = (BaseSubscriptionV1DTO) o;
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
