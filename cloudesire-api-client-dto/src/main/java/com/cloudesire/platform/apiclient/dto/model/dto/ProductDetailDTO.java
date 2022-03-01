package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

public class ProductDetailDTO extends ProductDTO
{
    @ApiModelProperty( "Application metrics associated to the product" )
    @Valid
    private List<UrlEntityDTO> metrics;

    private MinimumCostDTO minimumCost;

    @Valid
    private List<ProductChangelogEntryDTO> changelog;

    public List<UrlEntityDTO> getMetrics()
    {
        return metrics;
    }

    public void setMetrics( List<UrlEntityDTO> metrics )
    {
        this.metrics = metrics;
    }

    public MinimumCostDTO getMinimumCost()
    {
        return minimumCost;
    }

    public void setMinimumCost( MinimumCostDTO minimumCost )
    {
        this.minimumCost = minimumCost;
    }

    public List<ProductChangelogEntryDTO> getChangelog()
    {
        return changelog;
    }

    public void setChangelog( List<ProductChangelogEntryDTO> changelog )
    {
        this.changelog = changelog;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( ! ( o instanceof ProductDetailDTO ) ) return false;
        if ( ! super.equals( o ) ) return false;
        ProductDetailDTO that = (ProductDetailDTO) o;
        return Objects.equals( minimumCost, that.minimumCost );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), minimumCost );
    }
}
