package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

public class ResellerDTO extends ParentChildCompanyDTO
{
    private List<UrlEntityDTO> distributors;

    @Schema( description = "Set to false and fill the rest of the data to bill for yourself")
    private Boolean billsToDistributor;

    @Schema( description = "The prefix of this reseller's invoice numbers")
    @Size( min = 3, max = 8 )
    private String invoicePrefix;

    @Size( max = 125 )
    private String senderName;

    @Email
    @Size( max = 125 )
    private String replyTo;

    @URL
    private String logo;

    @Size( max = 125 )
    private String signature;

    @Size( max = 125 )
    private String storeName;

    @Valid
    private UrlEntityDTO defaultCatalog;

    public ResellerDTO( String name, String email )
    {
        super( name, email );
    }

    public ResellerDTO( String name )
    {
        super( name );
    }

    public ResellerDTO()
    {
        super();
    }

    // region Auto-generated code
    public List<UrlEntityDTO> getDistributors()
    {
        return distributors;
    }

    public void setDistributors( List<UrlEntityDTO> distributors )
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

    public String getSenderName()
    {
        return senderName;
    }

    public void setSenderName( String senderName )
    {
        this.senderName = senderName;
    }

    public String getReplyTo()
    {
        return replyTo;
    }

    public void setReplyTo( String replyTo )
    {
        this.replyTo = replyTo;
    }

    public String getLogo()
    {
        return logo;
    }

    public void setLogo( String logo )
    {
        this.logo = logo;
    }

    public String getSignature()
    {
        return signature;
    }

    public void setSignature( String signature )
    {
        this.signature = signature;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public void setStoreName( String storeName )
    {
        this.storeName = storeName;
    }

    public UrlEntityDTO getDefaultCatalog()
    {
        return defaultCatalog;
    }

    public void setDefaultCatalog( UrlEntityDTO defaultCatalog )
    {
        this.defaultCatalog = defaultCatalog;
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
