package com.cloudesire.platform.apiclient.dto.model.dto.changelog;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.dto.UrlEntityDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.CmwEventType;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommitDTO implements DTO
{
    private BigDecimal id;

    private UrlEntityDTO author;

    private ZonedDateTime date;

    private CmwEventType change = CmwEventType.MODIFIED;

    private final List<ValueChangeDTO> changes = new ArrayList<>();

    private final Map<String, String> properties = new HashMap<>();

    public CommitDTO( BigDecimal id, String author, ZonedDateTime date, Map<String, String> properties )
    {
        this.id = id;
        this.author = new UrlEntityDTO( author );
        this.date = date;
        this.properties.putAll( properties );
    }

    public CommitDTO()
    {
    }

    public BigDecimal getId()
    {
        return id;
    }

    public UrlEntityDTO getAuthor()
    {
        return author;
    }

    public ZonedDateTime getDate()
    {
        return date;
    }

    public CmwEventType getChange()
    {
        return change;
    }

    public void setChange( CmwEventType change )
    {
        this.change = change;
    }

    public List<ValueChangeDTO> getChanges()
    {
        return changes;
    }

    public void addChange( ValueChangeDTO change )
    {
        changes.add( change );
    }

    public Map<String, String> getProperties()
    {
        return properties;
    }
}
