package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude ( JsonInclude.Include.NON_NULL )
public class GitVersionDTO
{
    private static final String UNDEFINED = "undefined";

    private String commitId = UNDEFINED;
    private String commitTime = UNDEFINED;
    private String buildTime = UNDEFINED;
    private String commitMessageShort = UNDEFINED;
    private String version = UNDEFINED;

    public String getCommitId()
    {
        return commitId;
    }

    public void setCommitId( String commitId )
    {
        this.commitId = commitId;
    }

    public String getBuildTime()
    {
        return buildTime;
    }

    public void setBuildTime( String buildTime )
    {
        this.buildTime = buildTime;
    }

    public String getCommitMessageShort()
    {
        return commitMessageShort;
    }

    public void setCommitMessageShort( String commitMessageShort )
    {
        this.commitMessageShort = commitMessageShort;
    }

    public String getCommitTime()
    {
        return commitTime;
    }

    public void setCommitTime( String commitTime )
    {
        this.commitTime = commitTime;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion( String version )
    {
        this.version = version;
    }
}
