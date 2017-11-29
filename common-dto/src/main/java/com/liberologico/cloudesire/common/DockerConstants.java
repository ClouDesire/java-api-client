package com.liberologico.cloudesire.common;

public final class DockerConstants
{
    public static final String SCHEMA = "docker://";
    public static final String VALID = "^" + SCHEMA + "[^:]+(:.+)?$";
    public static final String MISSING_VERSION = "^" + SCHEMA + "[^:]+[^:.+]$";

    private DockerConstants()
    {
        throw new AssertionError();
    }
}
