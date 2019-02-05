package com.cloudesire.platform.apiclient.dto.model.dto.csv;

public abstract class ResellingProceedsCsvDTO extends ProceedsCsvDTO
{
    private String vendor;

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor( String vendor )
    {
        this.vendor = vendor;
    }
}
