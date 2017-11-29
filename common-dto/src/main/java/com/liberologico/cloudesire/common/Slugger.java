package com.liberologico.cloudesire.common;

import java.text.Normalizer;
import java.util.Collections;
import java.util.List;

public class Slugger
{
    public static String slugifyError( String errorMessage )
    {
        if ( errorMessage == null ) return "";

        return errorMessage.replaceAll( "\\.|\\s|'", "-" );
    }

    public static String slugify( String name )
    {
        List<String> empty = Collections.emptyList();
        return slugify( name, empty );
    }

    public static String slugify( String name, String replacement )
    {
        return slugify( name, replacement, Collections.<String>emptyList() );
    }

    public static String slugify( String name, List<String> exclusions )
    {
        return slugify( name, "-", exclusions );
    }

    public static String slugify( String name, String replacement, List<String> exclusions )
    {
        if (name == null) return "";

        String slug = name.trim().toLowerCase();

        slug = Normalizer.normalize( slug, Normalizer.Form.NFD )
                .replaceAll( "[^\\p{ASCII}]", "" )
                .replaceAll( "\\s+", replacement )
                .replaceAll( "[^\\w+-]", "" )
                .replaceAll( "[-]+", replacement )
                .replaceAll( "^-", "" )
                .replaceAll( "-$", "" );

        for ( String exclusion : exclusions )
        {
            slug = slug.replaceAll( replacement + exclusion.toLowerCase() + "$", "" );
        }

        return slug;
    }
}
