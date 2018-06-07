package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CspProductType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CspArmProductDTO extends CspProductDTO
{
    @ApiModelProperty( "The ARM template URL" )
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
}
