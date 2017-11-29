package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CategoryType;
import com.liberologico.cloudesire.common.enums.OSType;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class NodeRoleDTO extends NamedEntityDTO
{
    @NotNull
    private String recipe;

    @NotNull
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
