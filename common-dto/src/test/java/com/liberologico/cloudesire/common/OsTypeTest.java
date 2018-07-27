package com.liberologico.cloudesire.common;

import com.liberologico.cloudesire.common.enums.OSType;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OsTypeTest
{
    @Test
    public void osType()
    {
        assertThat( OSType.fromNameAndVersion( "Ubuntu", "14.04" ) )
                .isEqualTo( OSType.UBUNTU_14_04 );
        assertThat( OSType.fromNameAndVersion( "UBUNTU", "14.04.5" ) )
                .isEqualTo( OSType.UBUNTU_14_04 );
    }
}
