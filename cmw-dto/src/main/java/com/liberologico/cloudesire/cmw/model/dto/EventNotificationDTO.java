package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CmwEventType;

import java.util.Date;

/**
 * This is the object sent for event notification, not
 * the API that expose events
 *
 * @see EventDTO
 */
public class EventNotificationDTO extends BaseEntityDTO
{
    private String entity;
    private Date date;
    private CmwEventType type;
    private String entityUrl;

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
}
