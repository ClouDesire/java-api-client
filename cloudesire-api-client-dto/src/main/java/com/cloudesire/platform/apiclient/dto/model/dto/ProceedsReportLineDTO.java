package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ProceedsReportLineDTO extends ReportLineDTO
{
    private UrlEntityDTO distributor;

    private UrlEntityDTO reseller;

    private LineType type;

    @ApiModelProperty( "The description of the invoice line" )
    private String description;

    @ApiModelProperty( "The quantity sold" )
    private BigDecimal quantity;

    private UrlEntityDTO vendor;

    @ApiModelProperty( "The proceeds for the parent" )
    private BigDecimal wholesale;

    @ApiModelProperty( "The proceeds for the distributor" )
    private BigDecimal sellin;

    @ApiModelProperty( "The proceeds for the reseller" )
    private BigDecimal sellout;

    @ApiModelProperty( "The proceeds for the vendor" )
    private BigDecimal vendorIncome;

    @ApiModelProperty( "The costs for the distributor" )
    private CostsDTO costs;

    @ApiModelProperty( "Total earnings minus total costs" )
    private BigDecimal margin;

    private UrlEntityDTO subscription;

    private UrlEntityDTO billingItem;

    @ApiModelProperty( "Custom billing identifier" )
    private String identifier;

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

    public LineType getType()
    {
        return type;
    }

    public void setType( LineType type )
    {
        this.type = type;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public BigDecimal getQuantity()
    {
        return quantity;
    }

    public void setQuantity( BigDecimal quantity )
    {
        this.quantity = quantity;
    }

    public UrlEntityDTO getVendor()
    {
        return vendor;
    }

    public void setVendor( UrlEntityDTO vendor )
    {
        this.vendor = vendor;
    }

    public BigDecimal getWholesale()
    {
        return wholesale;
    }

    public void setWholesale( BigDecimal wholesale )
    {
        this.wholesale = wholesale;
    }

    public BigDecimal getSellin()
    {
        return sellin;
    }

    public void setSellin( BigDecimal sellin )
    {
        this.sellin = sellin;
    }

    public BigDecimal getSellout()
    {
        return sellout;
    }

    public void setSellout( BigDecimal sellout )
    {
        this.sellout = sellout;
    }

    public BigDecimal getVendorIncome()
    {
        return vendorIncome;
    }

    public void setVendorIncome( BigDecimal vendorIncome )
    {
        this.vendorIncome = vendorIncome;
    }

    public CostsDTO getCosts()
    {
        return costs;
    }

    public void setCosts( CostsDTO costs )
    {
        this.costs = costs;
    }

    public BigDecimal getMargin()
    {
        return margin;
    }

    public void setMargin( BigDecimal margin )
    {
        this.margin = margin;
    }

    public UrlEntityDTO getSubscription()
    {
        return subscription;
    }

    public void setSubscription( UrlEntityDTO subscription )
    {
        this.subscription = subscription;
    }

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setIdentifier( String identifier )
    {
        this.identifier = identifier;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ProceedsReportLineDTO that = (ProceedsReportLineDTO) o;
        return Objects.equals( distributor, that.distributor ) && Objects.equals( reseller, that.reseller )
                && type == that.type && Objects.equals( vendor, that.vendor ) && Objects
                .equals( wholesale, that.wholesale ) && Objects.equals( sellin, that.sellin ) && Objects
                .equals( sellout, that.sellout ) && Objects.equals( costs, that.costs ) && Objects
                .equals( margin, that.margin );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), distributor, reseller, type, vendor, wholesale, sellin, sellout, costs,
                margin );
    }

    @Override
    public String toString()
    {
        return "ResellingReportLineDTO{" + "type='" + type + '\'' + ", quantity=" + quantity
                + ", wholesale=" + wholesale + ", sellin=" + sellin + ", sellout=" + sellout + '}';
    }

    // endregion

    public static class CostsDTO
    {
        @ApiModelProperty( "The chargeback for the vendor" )
        private BigDecimal license;

        @ApiModelProperty( "The cloud costs to refund to the platform" )
        private BigDecimal iaas;

        public CostsDTO( BigDecimal license, BigDecimal iaas )
        {
            this.license = license;
            this.iaas = iaas;
        }

        public CostsDTO()
        {
        }

        public BigDecimal getTotal()
        {
            if ( license == null ) return iaas;
            else if ( iaas == null ) return license;
            else return license.add( iaas );
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

        @Override
        public boolean equals( Object o )
        {
            if ( this == o ) return true;
            if ( o == null || getClass() != o.getClass() ) return false;
            CostsDTO costsDTO = (CostsDTO) o;
            return Objects.equals( license, costsDTO.license ) && Objects.equals( iaas, costsDTO.iaas );
        }

        @Override
        public int hashCode()
        {
            return Objects.hash( license, iaas );
        }
    }
}
