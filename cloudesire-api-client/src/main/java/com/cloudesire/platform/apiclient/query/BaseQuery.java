package com.cloudesire.platform.apiclient.query;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class BaseQuery extends AbstractMap<String, String>
{
    protected BaseQuery()
    {
    }

    @Override
    @JsonIgnore
    public Set<Entry<String, String>> entrySet()
    {
        Map<String, String> map = new HashMap<>();
        for ( Method method : this.getClass().getMethods() )
        {
            if ( method.getName().startsWith( "get" ) )
            {
                try
                {
                    Object invoke = method.invoke( this, null );
                    if ( invoke instanceof String )
                    {
                        map.put( getterToField( method.getName() ), (String) invoke );
                    }
                }
                catch ( IllegalArgumentException | IllegalAccessException | InvocationTargetException e )
                {
                    // skip
                }
            }
        }
        return map.entrySet();
    }

    private static String getterToField( String methodName )
    {
        if ( methodName == null || methodName.length() == 0 )
        {
            return methodName;
        }
        String fieldName = methodName.replace( "get", "" );
        char c[] = fieldName.toCharArray();
        c[0] = Character.toLowerCase( c[0] );
        return new String( c );
    }

}
