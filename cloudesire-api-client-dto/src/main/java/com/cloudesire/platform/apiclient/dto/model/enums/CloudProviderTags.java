package com.cloudesire.platform.apiclient.dto.model.enums;

import com.liberologico.cloudesire.common.enums.OsFamily;

public enum CloudProviderTags
{
    ADDITIONAL_DISKS,
    BACKUP,
    BANDWIDTH_UPGRADE,
    CLOUD_SERVICES,
    CUSTOM_CREDENTIALS,
    CUSTOM_CREDENTIALS_ONLY,
    DISK_SPACE_UPGRADE,
    GPU,
    KUBERNETES,
    LINUX( OsFamily.LINUX ),
    /**
     * Minimum size for data volumes in GB
     */
    MINIMUM_DISK,
    MINIMUM_WINDOWS_RAM_GB,
    RAM_MULTIPLE_OF_MB,
    TIERED_DISK_PRICING,
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
        {
            return "integer - Gigabytes";
        }

        return "";
    }

    public boolean supports( OsFamily family )
    {
        return support.equals( family );
    }
}
