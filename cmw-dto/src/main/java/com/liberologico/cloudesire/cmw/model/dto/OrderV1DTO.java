package com.liberologico.cloudesire.cmw.model.dto;

public class OrderV1DTO extends BaseOrderDTO
{
    private String reseller;

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }
}
