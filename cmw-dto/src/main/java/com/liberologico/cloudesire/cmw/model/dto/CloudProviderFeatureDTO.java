package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CloudProviderTags;

import java.util.Objects;

public class CloudProviderFeatureDTO
{
    private CloudProviderTags feature;
    private Integer value;

    public CloudProviderFeatureDTO( CloudProviderTags feature, Integer value )
    {
        this( feature );
        this.value = value;
    }

    public CloudProviderFeatureDTO( CloudProviderTags feature )
    {
        this.feature = feature;
    }

    public CloudProviderFeatureDTO()
    {
    }

    public CloudProviderTags getFeature()
    {
        return feature;
    }

    public void setFeature( CloudProviderTags feature )
    {
        this.feature = feature;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue( Integer value )
    {
        this.value = value;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        CloudProviderFeatureDTO that = (CloudProviderFeatureDTO) o;
        return feature == that.feature && Objects.equals( value, that.value );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( feature, value );
    }
}
