package com.liberologico.cloudesire.common;

import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RandomStringUtilsTest
{
    @Test
    public void commonsTextRandomStringGenerator()
    {
        assertThat( RandomStringUtils.randomToken( 64 ) ).matches( "^[a-zA-Z0-9]*$" ).hasSize( 64 );
        assertThat( RandomStringUtils.randomToken( 1 ) ).matches( "^[a-zA-Z0-9]*$" ).hasSize( 1 );
        assertThat( RandomStringUtils.randomToken( 17 ) ).matches( "^[a-zA-Z0-9]*$" ).hasSize( 17 );

        assertThatThrownBy( new ThrowableAssert.ThrowingCallable()
        {
            @Override
            public void call() throws Throwable
            {
                RandomStringUtils.randomToken(0);
            }
        } ).isInstanceOf( IllegalArgumentException.class );
        assertThatThrownBy( new ThrowableAssert.ThrowingCallable()
        {
            @Override
            public void call() throws Throwable
            {
                RandomStringUtils.randomToken(-1);
            }
        } ).isInstanceOf( IllegalArgumentException.class );
    }
}
