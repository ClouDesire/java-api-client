package com.liberologico.cloudesire.cmw.model.enums;

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
