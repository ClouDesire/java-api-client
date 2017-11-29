package com.liberologico.cloudesire.cmw.model.constants;

@SuppressWarnings( "squid:S1075" )
public final class Paths
{
    public static final String APPLICATION_FILE = "applicationFile";
    public static final String PRIVATE = "private";
    public static final String STATIC = "static";

    public static final String APPLICATION_FILE_PATH = "/" + APPLICATION_FILE;
    public static final String APPLICATION_FILE_PRIVATE = APPLICATION_FILE + "/" + PRIVATE;
    public static final String APPLICATION_FILE_STATIC = APPLICATION_FILE + "/" + STATIC;

    private Paths()
    {
    }
}
