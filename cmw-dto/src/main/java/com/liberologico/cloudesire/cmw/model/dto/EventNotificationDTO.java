package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CmwEventType;

import java.util.Date;
import java.util.Objects;

/**
 * This is the object sent for event notification, not
 * the API that expose events
 *
 * @see EventDTO
 */
public class EventNotificationDTO extends BaseEntityDTO
{
    private Integer eventId;
    private String entity;
    private Date date;
    private CmwEventType type;
    private String entityUrl;

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
