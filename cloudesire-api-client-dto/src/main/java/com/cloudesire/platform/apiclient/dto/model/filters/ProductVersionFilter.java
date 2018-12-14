package com.cloudesire.platform.apiclient.dto.model.filters;

import com.cloudesire.platform.apiclient.dto.model.dto.PageRequestDTO;

public class ProductVersionFilter extends PageRequestDTO
{
    private Boolean withUnpublished;

    private String distributor;

    private String reseller;

    public Boolean getWithUnpublished()
    {
        return withUnpublished;
    }

    public void setWithUnpublished( Boolean withUnpublished )
    {
        this.withUnpublished = withUnpublished;
    }

    public String getDistributor()
    {
        return distributor;
    }

    public void setDistributor( String distributor )
    {
        this.distributor = distributor;
    }

    public String getReseller()
    {
        return reseller;
    }

    public void setReseller( String reseller )
    {
        this.reseller = reseller;
    }
}
