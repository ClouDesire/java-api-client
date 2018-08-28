package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.enums.ProductType;

public class ProductQuery extends PageRequestQuery
{
    private String name;

    private String reseller;

    private ProductType productType;

    private Boolean ownCompany;

    public String getName()
    {
        return name;
    }

    public ProductQuery setName( String name )
    {
        this.name = name;
        return this;
    }

    public String getReseller()
    {
        return reseller;
    }

    public ProductQuery setReseller( String reseller )
    {
        this.reseller = reseller;
        return this;
    }

    public ProductType getProductType()
    {
        return productType;
    }

    public ProductQuery setProductType( ProductType productType )
    {
        this.productType = productType;
        return this;
    }

    public Boolean getOwnCompany()
    {
        return ownCompany;
    }

    public ProductQuery setOwnCompany( Boolean ownCompany )
    {
        this.ownCompany = ownCompany;
        return this;
    }
}
