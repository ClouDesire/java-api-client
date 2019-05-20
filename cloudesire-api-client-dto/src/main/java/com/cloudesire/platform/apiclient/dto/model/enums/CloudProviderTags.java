package com.cloudesire.platform.apiclient.dto.model.enums;

import com.liberologico.cloudesire.common.enums.OsFamily;

public enum CloudProviderTags
{
    ADDITIONAL_DISKS,
    BACKUP,
    BANDWIDTH_UPGRADE,
    CUSTOM_CREDENTIALS,
    DISK_SPACE_UPGRADE,
    GPU,
    LINUX( OsFamily.LINUX ),
    MINIMUM_DISK, // Takes a value, in GB
    MINIMUM_WINDOWS_RAM_GB,
    WINDOWS( OsFamily.WINDOWS );

    private final OsFamily support;

    CloudProviderTags( OsFamily support )
    {
        this.support = support;
    }

    CloudProviderTags()
    {
        this.support = OsFamily.UNRECOGNIZED;
    }

    public static String measureUnit( CloudProviderTags tag )
    {
        if ( tag.equals( CloudProviderTags.MINIMUM_DISK ) || tag.equals( CloudProviderTags.MINIMUM_WINDOWS_RAM_GB ) )
            return "integer - Gigabytes";
        return null;
    }

    public boolean supports( OsFamily family )
    {
        return support.equals( family );
    }
}
