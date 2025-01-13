package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.Grouping;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.LANGUAGE;

public class CostsQuery extends BaseQuery
{
    private static final String FROM = "from";
    private static final String TO = "to";
    private static final String SUBSCRIPTION_ID = "subscriptionId";
    private static final String GROUPING = "grouping";

    public CostsQuery setScrollRequest( ScrollRequestQuery scrollRequestQuery )
    {
        putAll( scrollRequestQuery );
        return this;
    }

    /**
     * @deprecated by {@link #setScrollRequest(ScrollRequestQuery)}
     */
    @Deprecated( since = "20250109", forRemoval = true )
    public CostsQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public CostsQuery setSearch( SearchQuery searchQuery )
    {
        putAll( searchQuery );
        return this;
    }

    public CostsQuery from( ZonedDateTime from )
    {
        put( FROM, from.format( DateTimeFormatter.ISO_OFFSET_DATE_TIME ) );
        return this;
    }

    /**
     * @deprecated by {@link #from(ZonedDateTime)}
     */
    @Deprecated( since = "3.6.1", forRemoval = true )
    public CostsQuery from( Date from )
    {
        put( FROM, SimpleDateFormatFactory.iso8601Format().format( from ) );
        return this;
    }

    public CostsQuery to( ZonedDateTime to )
    {
        put( TO, to.format( DateTimeFormatter.ISO_OFFSET_DATE_TIME ) );
        return this;
    }

    /**
     * @deprecated by {@link #to(ZonedDateTime)}
     */
    @Deprecated( since = "3.6.1", forRemoval = true )
    public CostsQuery to( Date to )
    {
        put( TO, SimpleDateFormatFactory.iso8601Format().format( to ) );
        return this;
    }

    /**
     * @deprecated by {@link #setSearch(SearchQuery)}
     */
    @Deprecated( since = "3.9.0" )
    public CostsQuery filter( String filter )
    {
        return setSearch( new SearchQuery( filter ) );
    }

    /**
     * @deprecated by {@link #filter(String)}
     */
    @Deprecated( since = "3.6.5" )
    public CostsQuery subscriptionId( int subscriptionId )
    {
        put( SUBSCRIPTION_ID, subscriptionId );
        return this;
    }

    public CostsQuery grouping( Grouping grouping )
    {
        put( GROUPING, grouping );
        return this;
    }

    public CostsQuery language( String language )
    {
        put( LANGUAGE, language );
        return this;
    }

    public CostsQuery subscriptionMetadata( MetadataQuery metadata )
    {
        putAll( metadata );
        return this;
    }

    public CostsQuery tags( TagsQuery tags )
    {
        putAll( tags );
        return this;
    }

}
