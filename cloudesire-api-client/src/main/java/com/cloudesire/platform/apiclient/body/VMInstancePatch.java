package com.cloudesire.platform.apiclient.body;

import com.liberologico.cloudesire.cmw.model.enums.BackupFrequency;

public class VMInstancePatch
{
    private BackupFrequency backupFrequency;

    public VMInstancePatch setBackupFrequency( BackupFrequency value )
    {
        this.backupFrequency = value;
        return this;
    }
}
