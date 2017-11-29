package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Date;

public class DeploymentStatusDTO extends BaseEntityDTO
{
    private String statusMessage;

    private String descriptiveMessage;

    private Date date;

    private Integer progressPercentage;

    private String error;

    private Integer attemptsLeft;

    private Boolean temporaryFailure;

    private String phaseName;

    public String getPhaseName()
    {
        return phaseName;
    }

    public void setPhaseName( String phaseName )
    {
        this.phaseName = phaseName;
    }

    public String getError()
    {
        return error;
    }

    public void setError( String error )
    {
        this.error = error;
    }

    public Integer getAttemptsLeft()
    {
        return attemptsLeft;
    }

    public void setAttemptsLeft( Integer attemptsLeft )
    {
        this.attemptsLeft = attemptsLeft;
    }

    public Boolean getTemporaryFailure()
    {
        return temporaryFailure;
    }

    public void setTemporaryFailure( Boolean temporaryFailure )
    {
        this.temporaryFailure = temporaryFailure;
    }

    public String getStatusMessage()
    {
        return statusMessage;
    }

    public void setStatusMessage( String statusMessage )
    {
        this.statusMessage = statusMessage;
    }

    public String getDescriptiveMessage()
    {
        return descriptiveMessage;
    }

    public void setDescriptiveMessage( String descriptiveMessage )
    {
        this.descriptiveMessage = descriptiveMessage;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public Integer getProgressPercentage()
    {
        return progressPercentage;
    }

    public void setProgressPercentage( Integer progressPercentage )
    {
        this.progressPercentage = progressPercentage;
    }
}
