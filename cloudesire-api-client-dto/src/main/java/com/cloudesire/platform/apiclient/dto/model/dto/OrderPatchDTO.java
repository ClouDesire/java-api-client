package com.cloudesire.platform.apiclient.dto.model.dto;

import jakarta.validation.constraints.Future;
import java.util.Date;

public class OrderPatchDTO implements DTO
{
    private OrderPatchAction action;

    @Future
    private Date startDate;

    public OrderPatchDTO( OrderPatchAction action )
    {
        this.action = action;
    }

    public OrderPatchDTO()
    {
    }

    public OrderPatchAction getAction()
    {
        return action;
    }

    public OrderPatchDTO setAction( OrderPatchAction action )
    {
        this.action = action;
        return this;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public OrderPatchDTO setStartDate( Date startDate )
    {
        this.startDate = startDate;
        return this;
    }

    public enum OrderPatchAction
    {
        START_DATE
    }
}
