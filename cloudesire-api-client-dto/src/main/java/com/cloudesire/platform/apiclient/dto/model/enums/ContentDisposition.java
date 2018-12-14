package com.cloudesire.platform.apiclient.dto.model.enums;

public enum ContentDisposition
{
    ATTACHMENT,
    INLINE;

    @Override
    public String toString()
    {
        return super.toString().toLowerCase();
    }
}
