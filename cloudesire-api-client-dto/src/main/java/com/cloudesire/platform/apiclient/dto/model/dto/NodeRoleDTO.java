package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CategoryType;
import com.liberologico.cloudesire.common.enums.OSType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@ApiModel( description = "A software dependency that can be provisioned automatically on a VM" )
public class NodeRoleDTO extends NamedEntityDTO
{
    @ApiModelProperty( "The name of the chef cookbook available on the platform to install and configure a software" )
    @NotEmpty
    private String recipe;

    @NotNull
    @ApiModelProperty( "If the nodeRole is available to the user" )
    private Boolean enabled = true;

    @NotNull
    private CategoryType category;

    @NotNull
    private OSType osType;

    @Valid
    private List<UrlEntityDTO> requirements;

    public String getRecipe()
    {
        return recipe;
    }

    public void setRecipe( String recipe )
    {
        this.recipe = recipe;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled( Boolean enabled )
    {
        this.enabled = enabled;
    }

    public CategoryType getCategory()
    {
        return category;
    }

    public void setCategory( CategoryType category )
    {
        this.category = category;
    }

    public List<UrlEntityDTO> getRequirements()
    {
        return requirements;
    }

    public void setRequirements( List<UrlEntityDTO> requirements )
    {
        this.requirements = requirements;
    }

    public OSType getOsType()
    {
        return osType;
    }

    public void setOsType( OSType osType )
    {
        this.osType = osType;
    }

    @Override
    public String toString()
    {
        return "NodeRoleDTO [name=" + getName() + ",recipe=" + recipe + ", enabled=" + enabled + ", category="
                + category + "]";
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        NodeRoleDTO that = (NodeRoleDTO) o;
        return Objects.equals( recipe, that.recipe ) &&
                Objects.equals( enabled, that.enabled ) &&
                Objects.equals( category, that.category ) &&
                osType == that.osType &&
                Objects.equals( requirements, that.requirements );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( recipe, enabled, category, osType, requirements );
    }
}
