package com.liberologico.cloudesire.cmw.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude ( JsonInclude.Include.NON_NULL )
public class GitVersionDTO
{
    private static final String UNDEFINED = "undefined";

    private String branch = UNDEFINED;
    private String describe = UNDEFINED;
    private String commitId = UNDEFINED;
    private String commitIdAbbrev = UNDEFINED;
    private String buildUserName = UNDEFINED;
    private String buildUserEmail = UNDEFINED;
    private String buildTime = UNDEFINED;
    private String commitUserName = UNDEFINED;
    private String commitUserEmail = UNDEFINED;
    private String commitMessageFull = UNDEFINED;
    private String commitMessageShort = UNDEFINED;
    private String commitTime = UNDEFINED;
    private String jenkinsBuild = UNDEFINED;
    private String pomVersion = UNDEFINED;

    public String getBranch()
    {
        return branch;
    }

    public void setBranch( String branch )
    {
        this.branch = branch;
    }

    public String getDescribe()
    {
        return describe;
    }

    public void setDescribe( String describe )
    {
        this.describe = describe;
    }

    public String getCommitId()
    {
        return commitId;
    }

    public void setCommitId( String commitId )
    {
        this.commitId = commitId;
    }

    public String getCommitIdAbbrev()
    {
        return commitIdAbbrev;
    }

    public void setCommitIdAbbrev( String commitIdAbbrev )
    {
        this.commitIdAbbrev = commitIdAbbrev;
    }

    public String getBuildUserName()
    {
        return buildUserName;
    }

    public void setBuildUserName( String buildUserName )
    {
        this.buildUserName = buildUserName;
    }

    public String getBuildUserEmail()
    {
        return buildUserEmail;
    }

    public void setBuildUserEmail( String buildUserEmail )
    {
        this.buildUserEmail = buildUserEmail;
    }

    public String getBuildTime()
    {
        return buildTime;
    }

    public void setBuildTime( String buildTime )
    {
        this.buildTime = buildTime;
    }

    public String getCommitUserName()
    {
        return commitUserName;
    }

    public void setCommitUserName( String commitUserName )
    {
        this.commitUserName = commitUserName;
    }

    public String getCommitUserEmail()
    {
        return commitUserEmail;
    }

    public void setCommitUserEmail( String commitUserEmail )
    {
        this.commitUserEmail = commitUserEmail;
    }

    public String getCommitMessageFull()
    {
        return commitMessageFull;
    }

    public void setCommitMessageFull( String commitMessageFull )
    {
        this.commitMessageFull = commitMessageFull;
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

    public String getJenkinsBuild()
    {
        return jenkinsBuild;
    }

    public void setJenkinsBuild( String jenkinsBuild )
    {
        this.jenkinsBuild = jenkinsBuild;
    }

    public String getPomVersion()
    {
        return pomVersion;
    }

    public void setPomVersion( String pomVersion )
    {
        this.pomVersion = pomVersion;
    }

    @Override
    public String toString()
    {
        return "GitVersionDTO{" +
                "branch='" + branch + '\'' +
                ", describe='" + describe + '\'' +
                ", commitId='" + commitId + '\'' +
                ", commitIdAbbrev='" + commitIdAbbrev + '\'' +
                ", buildUserName='" + buildUserName + '\'' +
                ", buildUserEmail='" + buildUserEmail + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", commitUserName='" + commitUserName + '\'' +
                ", commitUserEmail='" + commitUserEmail + '\'' +
                ", commitMessageFull='" + commitMessageFull + '\'' +
                ", commitMessageShort='" + commitMessageShort + '\'' +
                ", commitTime='" + commitTime + '\'' +
                ", jenkinsBuild='" + jenkinsBuild + '\'' +
                ", pomVersion='" + pomVersion + '\'' +
                '}';
    }
}
