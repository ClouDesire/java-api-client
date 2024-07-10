package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.LineType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class VendorOrderLineDTO extends CustomOrderLineDTO
{
    public VendorOrderLineDTO( BigDecimal value )
    {
        super( value );
    }

    public VendorOrderLineDTO( BigDecimal value, BigDecimal vat )
    {
        super( value, vat );
    }

    public VendorOrderLineDTO()
    {
        super();
    }

    @Schema( hidden = true )
    @Length( max = 125 )
    @UnsupportedAPI( sinceVersion = ApiVersion.V20221124 )
    private String tag;

    @Schema( description = "Tag custom costs")
    @FieldAPI( sinceVersion = ApiVersion.V20221124 )
    private Map<String, String> tags;

    @Schema( description = "Purchase date of the custom cost, defaults to now")
    private Date purchased;

    @Override
    public LineType getType()
    {
        return LineType.CUSTOM;
    }

    @Override
    public void setType( LineType type )
    {
        // type is fixed to CUSTOM
    }

    /**
     * @deprecated by {@link #getTags()}
     */
    @Deprecated( since = "3.0.2", forRemoval = true )
    @Override
    public String getTag()
    {
        return tag;
    }

    /**
     * @deprecated by {@link #setTags(Map)}
     */
    @Deprecated( since = "3.0.2", forRemoval = true )
    @Override
    public void setTag( String tag )
    {
        this.tag = tag;
    }

    public Map<String, String> getTags()
    {
        return tags;
    }

    public void setTags( Map<String, String> tags )
    {
        this.tags = tags;
    }

    public Date getPurchased()
    {
        return purchased;
    }

    public void setPurchased( Date purchased )
    {
        this.purchased = purchased;
    }
}
