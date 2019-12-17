package com.cloudesire.platform.apiclient.query;

public class CommentQuery extends BaseQuery
{
    private static final String PRODUCT_ID = "productId";
    private static final String USER_ID = "userId";

    public CommentQuery( int productId )
    {
        put( PRODUCT_ID, productId );
    }

    public CommentQuery setUserId( int userId )
    {
        put( USER_ID, userId );
        return this;
    }

    public CommentQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }
}
