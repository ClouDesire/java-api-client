package com.liberologico.cloudesire.cmw.model.dto.csv;

import com.liberologico.cloudesire.cmw.model.dto.DTO;

import java.util.Date;

public class ProceedsCsvDTO extends DTO
{
    private String product;

    private String buyer;

    private Date purchased;

    // region Auto-generated codess

    public String getProduct()
    {
        return product;
    }

    public void setProduct( String product )
    {
        this.product = product;
    }

    public String getBuyer()
    {
        return buyer;
    }

    public void setBuyer( String buyer )
    {
        this.buyer = buyer;
    }

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
    }

    // endregion
}
