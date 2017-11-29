package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.Set;

public class ResellerDTO extends UserProfileDTO
{
    private Set<UrlEntityDTO> distributors;

    @ApiModelProperty( "Set to false and fill the rest of the data to bill for yourself" )
    private Boolean billsToDistributor;

    @ApiModelProperty( "The prefix of this reseller's invoice numbers" )
    @Size( min = 3, max = 8 )
    private String invoicePrefix;

    // region Auto-generated code
    public Set<UrlEntityDTO> getDistributors()
    {
        return distributors;
    }

    public void setDistributors( Set<UrlEntityDTO> distributors )
    {
        this.distributors = distributors;
    }

    public Boolean getBillsToDistributor()
    {
        return billsToDistributor;
    }

    public void setBillsToDistributor( Boolean billsToDistributor )
    {
        this.billsToDistributor = billsToDistributor;
    }

    public String getInvoicePrefix()
    {
        return invoicePrefix;
    }

    public void setInvoicePrefix( String invoicePrefix )
    {
        this.invoicePrefix = invoicePrefix;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ResellerDTO that = (ResellerDTO) o;
        return Objects.equals( billsToDistributor, that.billsToDistributor );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( billsToDistributor );
    }
    // endregion
}
