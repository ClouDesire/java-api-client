package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.liberologico.cloudesire.cmw.model.enums.CmwEventType;
import com.liberologico.cloudesire.cmw.model.enums.EventRecipientType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Date;

/**
 * This is the object exposed by the API, not the notification sent via HTTP
 *
 * @see EventNotificationDTO
 */
@ApiModel( "An event dispatched by the platform to a recipient" )
public class EventDTO extends BaseEntityDTO
{
    @ApiModelProperty( value = "The name of the entity", example = "Subscription" )
    private String entityName;

    @ApiModelProperty( value = "The Id of the entity", example = "123" )
    private Integer entityId;

    @ApiModelProperty( value = "If the platform has successfully dispatched this event", readOnly = true )
    private Boolean notified = false;

    @ApiModelProperty( value = "When the event has been generated", readOnly = true )
    private Date date = new Date();

    private CmwEventType type;

    private EventRecipientType recipient = EventRecipientType.COMPANY;

    @ApiModelProperty( readOnly = true )
    private EventNotificationDTO payload;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    @Valid
    private UrlEntityDTO product;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    @Valid
    private UrlEntityDTO vendor;

    @JsonInclude ( JsonInclude.Include.NON_NULL )
    private String lastError;

    @Valid
    private UrlEntityDTO entityUrl;

    @ApiModelProperty( value = "Editable only by admin - Generally not used", hidden = true )
    private String environment;

    public String getEntityName()
    {
        return entityName;
    }

    public void setEntityName( String entityName )
    {
        this.entityName = entityName;
    }

    public Integer getEntityId()
    {
        return entityId;
    }

    public void setEntityId( Integer entityId )
    {
        this.entityId = entityId;
    }

    public Boolean getNotified()
    {
        return notified;
    }

    public void setNotified( Boolean notified )
    {
        this.notified = notified;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public CmwEventType getType()
    {
        return type;
    }

    public void setType( CmwEventType type )
    {
        this.type = type;
    }

    public UrlEntityDTO getVendor()
    {
        return vendor;
    }

    public void setVendor( UrlEntityDTO vendor )
    {
        this.vendor = vendor;
    }

    public String getLastError()
    {
        return lastError;
    }

    public void setLastError( String lastError )
    {
        this.lastError = lastError;
    }

    public EventNotificationDTO getPayload()
    {
        return payload;
    }

    public void setPayload( EventNotificationDTO payload )
    {
        this.payload = payload;
    }

    public UrlEntityDTO getEntityUrl()
    {
        return entityUrl;
    }

    public void setEntityUrl( UrlEntityDTO entityUrl )
    {
        this.entityUrl = entityUrl;
    }

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    public String getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( String environment )
    {
        this.environment = environment;
    }

    public EventRecipientType getRecipient()
    {
        return recipient;
    }

    public void setRecipient( EventRecipientType recipient )
    {
        this.recipient = recipient;
    }
}
