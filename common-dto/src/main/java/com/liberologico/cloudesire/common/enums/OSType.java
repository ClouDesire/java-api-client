package com.liberologico.cloudesire.common.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Locale;

@ApiModel( "The operating system version" )
public enum OSType
{
    @ApiModelProperty("Unsupported operating system")
    OTHER(1, "Other", "", "", OsFamily.UNRECOGNIZED),

    @ApiModelProperty("Ubuntu Precise Pangolin 12.04 LTS 64BIT" )
    UBUNTU_12_04(11, "Ubuntu", "12.04", "ubuntu-precise-12.04-amd64-server", OsFamily.LINUX),

    @ApiModelProperty( "Ubuntu Precise Pangolin 14.04 LTS 64BIT" )
    UBUNTU_14_04(12, "Ubuntu", "14.04", "ubuntu-trusty-14.04-amd64-server", OsFamily.LINUX),

    @ApiModelProperty( "Debian 7" )
    DEBIAN_7(13, "Debian", "7", "wheezy-amd64-pvm", OsFamily.LINUX),

    @ApiModelProperty("Microsoft Windows Server 2008 R2")
    WINDOWS_SERVER_2008_R2(101, "Windows", "2008", "Server-2008-R2_SP1-English-64Bit-Base", OsFamily.WINDOWS),

    @ApiModelProperty( "Microsoft Windows Server 2008 R2 SP1 64-bit English with SQL 2008 R2 Standard" )
    WINDOWS_SERVER_2008_R2_SQL_2008_R2(102, "Windows", "2008", "Windows_Server-2008-R2_SP1-English-64Bit-SQL_2008_R2_SP2_Standard", OsFamily.WINDOWS),

    @ApiModelProperty( "Windows Server 2012 + SQL Server 2012 SP1 Standard" )
    WINDOWS_SERVER_2012_SQL_2012_SP1(103, "Windows", "2012", "Windows Server 2012 + SQL Server 2012 SP1 Standard", OsFamily.WINDOWS),

    @ApiModelProperty( "Unknown operating system" )
    UNRECOGNIZED(Integer.MAX_VALUE, "UNRECOGNIZED", "", "", OsFamily.UNRECOGNIZED);

    public int getCode()
    {
        return code;
    }

    public String getValue()
    {
        return value;
    }

    public OsFamily getFamily()
    {
        return family;
    }

    public String getVersion()
    {
        return version;
    }

    public String getDescription()
    {
        return description;
    }

    private final int code;
    private final String value;
    private final String version;
    private final String description;
    private final OsFamily family;

    OSType( int code, String value, String version, String description, OsFamily family )
    {
        this.code = code;
        this.value = value;
        this.version = version;
        this.description = description;
        this.family = family;
    }

    public static OSType fromCode( int code )
    {
        for ( OSType type : values() )
        {
            if ( type.code == code )
                return type;
        }
        return UNRECOGNIZED;
    }

    public static OSType fromNameAndVersion( String name, String version )
    {
        if(name != null && version != null)
            for ( OSType type : values() )
            {
                if ( type.value.toLowerCase(Locale.ROOT).equals(name.toLowerCase(Locale.ROOT)) &&
                        type.version.toLowerCase(Locale.ROOT).equals(version.toLowerCase(Locale.ROOT)))
                    return type;
            }
        return UNRECOGNIZED;
    }

    public String getFullName()
    {
        return value.concat(" ").concat(description).replaceAll("-", " ").replaceAll("_", " ");
    }

    public boolean isWindows()
    {
        return OsFamily.WINDOWS.equals( family );
    }

    public boolean isLinux()
    {
        return OsFamily.LINUX.equals( family );
    }
}
