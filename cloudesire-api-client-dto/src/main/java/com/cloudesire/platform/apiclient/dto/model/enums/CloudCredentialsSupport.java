package com.cloudesire.platform.apiclient.dto.model.enums;

public enum CloudCredentialsSupport
{
    ENABLED, ENFORCED, DISABLED;

    public boolean isEnabled()
    {
        return this != DISABLED;
    }
}
