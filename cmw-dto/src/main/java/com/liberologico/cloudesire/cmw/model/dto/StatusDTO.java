package com.liberologico.cloudesire.cmw.model.dto;

public class StatusDTO
{
    private int processors;

    public StatusDTO( int processors )
    {
        this.processors = processors;
    }

    public int getProcessors()
    {
        return processors;
    }

    public void setProcessors( int processors )
    {
        this.processors = processors;
    }
}
