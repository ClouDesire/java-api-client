package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        DeploymentStatusDTO that = (DeploymentStatusDTO) o;
        return Objects.equals( statusMessage, that.statusMessage ) && Objects
                .equals( descriptiveMessage, that.descriptiveMessage ) && Objects.equals( error, that.error ) && Objects
                .equals( attemptsLeft, that.attemptsLeft ) && Objects.equals( temporaryFailure, that.temporaryFailure )
                && Objects.equals( phaseName, that.phaseName );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), statusMessage, descriptiveMessage, error, attemptsLeft, temporaryFailure,
                phaseName );
    }
}
