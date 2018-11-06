package com.liberologico.cloudesire.cmw.model.dto.body;

import com.liberologico.cloudesire.cmw.model.enums.BackupFrequency;

import java.util.Map;

public class VMInstancePatch
{
    private VMInstancePatchAction action;

    private Integer diskSize;

    private Integer appId;
    private Map<String, String> environment;

    private BackupFrequency backupFrequency;

    public VMInstancePatchAction getAction()
    {
        return action;
    }

    public void setAction( VMInstancePatchAction action )
    {
        this.action = action;
    }

    public Integer getDiskSize()
    {
        return diskSize;
    }

    public void setDiskSize( Integer diskSize )
    {
        this.diskSize = diskSize;
    }

    public Integer getAppId()
    {
        return appId;
    }

    public void setAppId( Integer appId )
    {
        this.appId = appId;
    }

    public Map<String, String> getEnvironment()
    {
        return environment;
    }

    public void setEnvironment( Map<String, String> environment )
    {
        this.environment = environment;
    }

    public BackupFrequency getBackupFrequency()
    {
        return backupFrequency;
    }

    public void setBackupFrequency( BackupFrequency backupFrequency )
    {
        this.backupFrequency = backupFrequency;
    }

    public enum VMInstancePatchAction
    {
        DISK_UPGRADE("diskUpgrade"),
        SET_ENVIRONMENT("setEnvironment"),
        APPLICATIONS_UPDATE("applicationsUpdate");

        private final String toString;

        VMInstancePatchAction( String name )
        {
            this.toString = name;
        }

        @Override
        public String toString()
        {
            return this.toString;
        }
    }
}
