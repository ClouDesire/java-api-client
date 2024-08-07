package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CmwEventType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * This is the object sent for event notification, not
 * the API that expose events
 *
 * @see EventDTO
 */
@Schema( description = "Payload sent to the HTTP endpoint" )
public class EventNotificationDTO extends BaseEntityDTO
{
    @Schema( description = "The ID of the Event", example = "123" )
    private Integer eventId;

    @Schema( description = "The name of the Event", example = "Subscription" )
    private String entity;

    @Schema( description = "The date of Event creation" )
    private Date date;

    private CmwEventType type;

    @Schema( description = "Concatenation of entity name and ID", example = "subscription/123" )
    private String entityUrl;

    @Schema( description = "Generic payload that can be sent along with the event")
    private Map<String, Object> metadata;

    public Integer getEventId()
    {
        return eventId;
    }

    public void setEventId( Integer eventId )
    {
        this.eventId = eventId;
    }

    public String getEntity()
    {
        return entity;
    }

    public void setEntity( String entity )
    {
        this.entity = entity;
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

    public String getEntityUrl()
    {
        return entityUrl;
    }

    public void setEntityUrl( String entityUrl )
    {
        this.entityUrl = entityUrl;
    }

    public Map<String, Object> getMetadata()
    {
        return metadata;
    }

    public void setMetadata( Map<String, Object> metadata )
    {
        this.metadata = metadata;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        EventNotificationDTO that = (EventNotificationDTO) o;
        return Objects.equals( eventId, that.eventId ) && Objects.equals( entity, that.entity ) && Objects
                .equals( date, that.date ) && type == that.type && Objects.equals( entityUrl, that.entityUrl );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), eventId, entity, date, type, entityUrl );
    }
}
