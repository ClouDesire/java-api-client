package com.liberologico.cloudesire.common.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "The operating system version" )
public enum OSType
{
    @ApiModelProperty("Unsupported operating system")
    OTHER( "Other", "", OsFamily.UNRECOGNIZED ),

    @ApiModelProperty("Ubuntu Precise Pangolin 12.04 LTS 64BIT" )
    UBUNTU_12_04( "Ubuntu", "12.04", OsFamily.LINUX ),

    @ApiModelProperty( "Ubuntu Precise Pangolin 14.04 LTS 64BIT" )
    UBUNTU_14_04( "Ubuntu", "14.04", OsFamily.LINUX ),

    @ApiModelProperty( "Debian 7" )
    DEBIAN_7( "Debian", "7", OsFamily.LINUX ),

    @ApiModelProperty( "Microsoft Windows Server 2008 R2" )
    WINDOWS_SERVER_2008_R2( "Microsoft Windows", "Server 2008 R2", OsFamily.WINDOWS ),

    @ApiModelProperty( "Microsoft Windows Server 2008 R2 SP1 64-bit English with SQL 2008 R2 Standard" )
    WINDOWS_SERVER_2008_R2_SQL_2008_R2( "Microsoft Windows", "Server 2008 R2", OsFamily.WINDOWS ),

    @ApiModelProperty( "Microsoft Windows Server 2012 R2" )
    WINDOWS_SERVER_2012_R2( "Microsoft Windows", "Server 2012 R2", OsFamily.WINDOWS ),

    @ApiModelProperty( "Windows Server 2012 + SQL Server 2012 SP1 Standard" )
    WINDOWS_SERVER_2012_SQL_2012_SP1( "Microsoft Windows", "Server 2012", OsFamily.WINDOWS ),

    @ApiModelProperty( "Microsoft Windows Server 2016" )
    WINDOWS_SERVER_2016( "Microsoft Windows", "Server 2016", OsFamily.WINDOWS ),

    @ApiModelProperty( "Ubuntu Xenial Xerus 16.04 LTS 64bit" )
    UBUNTU_16_04( "Ubuntu", "16.04", OsFamily.LINUX ),

    @ApiModelProperty( "Ubuntu Bionic Beaver 18.04 LTS 64bit" )
    UBUNTU_18_04( "Ubuntu", "18.04", OsFamily.LINUX ),

    @ApiModelProperty( "Debian 9" )
    DEBIAN_9( "Debian", "9", OsFamily.LINUX ),

    @ApiModelProperty( "Red Hat Enterprise Linux 6" )
    RED_HAT_6( "Red Hat Enterprise Linux", "6", OsFamily.LINUX ),

    @ApiModelProperty( "Red Hat Enterprise Linux 7" )
    RED_HAT_7( "Red Hat Enterprise Linux", "7", OsFamily.LINUX ),

    @ApiModelProperty( "CentOS 6" )
    CENTOS_6( "CentOS", "6", OsFamily.LINUX ),

    @ApiModelProperty( "CentOS 7" )
    CENTOS_7( "CentOS", "7", OsFamily.LINUX );

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

    private final String value;
    private final String version;
    private final OsFamily family;

    OSType( String value, String version, OsFamily family )
    {
        this.value = value;
        this.version = version;
        this.family = family;
    }

    public static OSType fromNameAndVersion( String name, String version )
    {
        if ( name == null || version == null ) return OTHER;

        OSType exactMatch = null;
        OSType similarMatch = null;

        for ( OSType type : values() )
        {
            if ( type.value.equalsIgnoreCase( name ) )
            {
                if ( version.equals( type.version ) ) exactMatch = type;
                if ( version.contains( type.version ) ) similarMatch = type;
            }
        }

        if ( exactMatch != null ) return exactMatch;
        if ( similarMatch != null ) return similarMatch;

        return OTHER;
    }

    public static OSType getDefaultOs()
    {
        return OSType.UBUNTU_18_04;
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
