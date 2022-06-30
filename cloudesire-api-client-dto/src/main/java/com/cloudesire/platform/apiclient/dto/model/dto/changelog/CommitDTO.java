package com.cloudesire.platform.apiclient.dto.model.dto.changelog;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;
import com.cloudesire.platform.apiclient.dto.model.enums.CmwEventType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommitDTO implements DTO
{
    private BigDecimal id;

    private String author;

    private LocalDateTime date;

    private CmwEventType change = CmwEventType.MODIFIED;

    private final List<ValueChangeDTO> changes = new ArrayList<>();

    public CommitDTO( BigDecimal id, String author, LocalDateTime date )
    {
        this.id = id;
        this.author = author;
        this.date = date;
    }

    public CommitDTO()
    {
    }

    public BigDecimal getId()
    {
        return id;
    }

    public String getAuthor()
    {
        return author;
    }

    public LocalDateTime getDate()
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
}
