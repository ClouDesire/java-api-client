package com.cloudesire.platform.apiclient.dto.model.dto;

import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.annotations.ApiModel;

@ApiModel( description = "Which cloud resources the customer will get for this order" )
public class BudgetVMConfigurationDTO extends DTO
{
    private OSType operatingSystem;

    private Integer rootDiskSpace;

    private Integer dataDiskSpace;

    private Integer cpu;

    private Integer ram;

    public OSType getOperatingSystem()
    {
        return operatingSystem;
    }

    public void setOperatingSystem( OSType operatingSystem )
    {
        this.operatingSystem = operatingSystem;
    }

    public Integer getRootDiskSpace()
    {
        return rootDiskSpace;
    }

    public void setRootDiskSpace( Integer rootDiskSpace )
    {
        this.rootDiskSpace = rootDiskSpace;
    }

    public Integer getDataDiskSpace()
    {
        return dataDiskSpace;
    }

    public void setDataDiskSpace( Integer dataDiskSpace )
    {
        this.dataDiskSpace = dataDiskSpace;
    }

    public Integer getCpu()
    {
        return cpu;
    }

    public void setCpu( Integer cpu )
    {
        this.cpu = cpu;
    }

    public Integer getRam()
    {
        return ram;
    }

    public void setRam( Integer ram )
    {
        this.ram = ram;
    }
}
