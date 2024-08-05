package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

public class CspArmProductDTO extends CspProductDTO
{
    @Schema( description = "The ARM template URL")
    @NotNull
    @URL
    private String template;

    public CspArmProductDTO( String name, String identifier, BigDecimal price, UrlEntityDTO company )
    {
        super( name, identifier, CspProductType.ARM_TEMPLATE, price, company );
    }

    public CspArmProductDTO()
    {
    }

    public String getTemplate()
    {
        return template;
    }

    public void setTemplate( String template )
    {
        this.template = template;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        CspArmProductDTO that = (CspArmProductDTO) o;
        return template.equals( that.template );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), template );
    }
}
