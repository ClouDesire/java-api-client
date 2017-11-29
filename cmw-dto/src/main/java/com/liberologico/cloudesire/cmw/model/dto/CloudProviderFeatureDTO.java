package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.CloudProviderTags;

public class CloudProviderFeatureDTO
{
    private CloudProviderTags feature;
    private Integer value;

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

        if ( feature != that.feature ) return false;
        if ( value != null ? !value.equals( that.value ) : that.value != null ) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = feature != null ? feature.hashCode() : 0;
        result = 31 * result + ( value != null ? value.hashCode() : 0 );
        return result;
    }
}
