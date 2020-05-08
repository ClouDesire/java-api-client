package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

abstract class CatalogCsvDTO extends DTO
{
    protected String plan;

    protected String extra;

    protected String planIdentifier;

    protected String extraIdentifier;

    protected Integer extraStart;

    protected Integer extraEnd;

    public abstract CatalogCsvDTO copyVersion();

    // region Getters & Setters
    CatalogCsvDTO( String plan, String planIdentifier )
    {
        this.plan = plan;
        this.planIdentifier = planIdentifier;
    }

    CatalogCsvDTO()
    {
    }

    public String getPlan()
    {
        return plan;
    }

    public void setPlan( String plan )
    {
        this.plan = plan;
    }

    public String getExtra()
    {
        return extra;
    }

    public void setExtra( String extra )
    {
        this.extra = extra;
    }

    public String getPlanIdentifier()
    {
        return planIdentifier;
    }

    public void setPlanIdentifier( String planIdentifier )
    {
        this.planIdentifier = planIdentifier;
    }

    public String getExtraIdentifier()
    {
        return extraIdentifier;
    }

    public void setExtraIdentifier( String extraIdentifier )
    {
        this.extraIdentifier = extraIdentifier;
    }

    public Integer getExtraStart()
    {
        return extraStart;
    }

    public void setExtraStart( Integer extraStart )
    {
        this.extraStart = extraStart;
    }

    public Integer getExtraEnd()
    {
        return extraEnd;
    }

    public void setExtraEnd( Integer extraEnd )
    {
        this.extraEnd = extraEnd;
    }

    @Override
    public String toString()
    {
        return '"'
                + plan + "\",\""
                + extra + "\",\""
                + planIdentifier + "\",\""
                + extraIdentifier + "\",\""
                + extraStart + "\",\""
                + extraEnd
                + '"';
    }
    // endregion
}
