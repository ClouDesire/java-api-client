package com.liberologico.cloudesire.common;

import java.text.Normalizer;
import java.util.Collections;
import java.util.List;

public final class Slugger
{
    public static String slugifyError( String errorMessage, boolean forceLowerCase )
    {
        if ( errorMessage == null ) return "";

        String slugged = errorMessage.replaceAll( "\\.|\\s|'|_", "-" );
        if ( forceLowerCase ) return slugged.toLowerCase();
        return slugged;
    }

    public static String slugifyError( String errorMessage )
    {
        return slugifyError( errorMessage, false );
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

    private Slugger()
    {
    }
}
