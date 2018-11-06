package com.liberologico.cloudesire.cmw.model.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class BodyParser
{
    private BodyParser()
    {
    }

    /**
     * Parse a string like `product/id` returning the id if found
     */
    public static Integer getResourceId( String url )
    {
        String identifier = getResourceIdentifier( url, "\\d+$" );
        if ( identifier == null ) return null;
        return Integer.parseInt( identifier );
    }

    /**
     * Parse a string like `stackParameter/identifier` returning the identifier if found
     */
    public static String getResourceIdentifier( String url )
    {
        return getResourceIdentifier( url, "\\w+$" );
    }

    private static String getResourceIdentifier( String url, String regex )
    {
        if ( StringUtils.isEmpty( url ) ) return null;
        Pattern pattern = Pattern.compile( regex );
        Matcher match = pattern.matcher( url );
        if ( ! match.find() ) throw new IllegalArgumentException( "Invalid URL: " + url + "!" );
        return url.subSequence( match.start(), match.end() ).toString();
    }

}
