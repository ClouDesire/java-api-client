package com.liberologico.cloudesire.cmw.model.enums;

public enum BackupFrequency
{
    DAILY(24), WEEKLY(168), MONTHLY(672);

    private final int period;

    BackupFrequency( int i )
    {
        this.period = i;
    }

    public int getPeriod()
    {
        return period;
    }
}
