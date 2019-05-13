package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.AssociationType;

public class ApplicationFileQuery extends PageRequestQuery
{
    private static final String NAME = "name";
    private static final String VERSION = "version";
    private static final String ASSOCIATION_TYPE = "associationType";

    public ApplicationFileQuery setName( String name )
    {
        put( NAME, name );
        return this;
    }

    public ApplicationFileQuery setVersion( String version )
    {
        put( VERSION, version );
        return this;
    }

    public ApplicationFileQuery setAssociationType( AssociationType associationType )
    {
        put( ASSOCIATION_TYPE, associationType );
        return this;
    }

    public ApplicationFileQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

}
