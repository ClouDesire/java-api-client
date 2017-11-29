package com.liberologico.cloudesire.cmw.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ResellingReportLineDTO extends ReportLineDTO
{
    @ApiModelProperty( value = "The distributor of this product", readOnly = true )
    private UrlEntityDTO distributor;

    @ApiModelProperty( value = "The reseller who sold this", readOnly = true )
    private UrlEntityDTO reseller;

    @ApiModelProperty( value = "The proceeds for the distributor", readOnly = true )
    private BigDecimal sellin;

    @ApiModelProperty( value = "The proceeds for the reseller", readOnly = true )
    private BigDecimal netSellout;

    @ApiModelProperty( value = "The costs for the distributor", readOnly = true )
    private CostsDTO costs;

    @ApiModelProperty( value = "The gross proceeds for the reseller", readOnly = true )
    public BigDecimal getSellout()
    {
        return sellin.add( netSellout );
    }

    // region Auto-generated code
    public UrlEntityDTO getDistributor()
    {
        return distributor;
    }

    public void setDistributor( UrlEntityDTO distributor )
    {
        this.distributor = distributor;
    }

    public UrlEntityDTO getReseller()
    {
        return reseller;
    }

    public void setReseller( UrlEntityDTO reseller )
    {
        this.reseller = reseller;
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin )
    {
        this.sellin = sellin;
    }

    public BigDecimal getNetSellout()
    {
        return netSellout;
    }

    public void setNetSellout( BigDecimal netSellout )
    {
        this.netSellout = netSellout;
    }

    public CostsDTO getCosts()
    {
        return costs;
    }

    public void setCosts( CostsDTO costs )
    {
        this.costs = costs;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ResellingReportLineDTO that = (ResellingReportLineDTO) o;
        return Objects.equals( distributor, that.distributor ) && Objects.equals( reseller, that.reseller ) && Objects
                .equals( sellin, that.sellin ) && Objects.equals( netSellout, that.netSellout );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), distributor, reseller, sellin, netSellout );
    }
    // endregion

    public static class CostsDTO
    {
        @ApiModelProperty( value = "The chargeback for the vendor", readOnly = true )
        private BigDecimal license;

        @ApiModelProperty( value = "The cloud costs to refund to the platform", readOnly = true )
        private BigDecimal iaas;

        public CostsDTO( BigDecimal license, BigDecimal iaas )
        {
            this.license = license;
            this.iaas = iaas;
        }

        public CostsDTO()
        {
        }

        public BigDecimal getLicense()
        {
            return license;
        }

        public void setLicense( BigDecimal license )
        {
            this.license = license;
        }

        public BigDecimal getIaas()
        {
            return iaas;
        }

        public void setIaas( BigDecimal iaas )
        {
            this.iaas = iaas;
        }
    }
}
