package com.cloudesire.platform.apiclient.dto.model.enums;

public enum FeaturedType
{
    ENABLED,
    DISABLED;

    @Override
    public String toString()
    {
        return super.toString().toLowerCase();
    }
}
