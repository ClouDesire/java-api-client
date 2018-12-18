package com.cloudesire.platform.apiclient.query;

import com.liberologico.cloudesire.cmw.model.enums.OrderType;

public class InvoiceQuery extends BaseQuery
{
    private static final String EXPIRED = "expired";
    private static final String NOMINEE = "nominee";
    private static final String PAID = "paid";
    private static final String SELF_BILLED = "selfBilled";
    private static final String TYPE = "type";

    public InvoiceQuery setExpired( boolean expired )
    {
        put( EXPIRED, expired );
        return this;
    }

    public InvoiceQuery setNominee( Boolean nominee )
    {
        put( NOMINEE, nominee );
        return this;
    }

    public InvoiceQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public InvoiceQuery setPaid( Boolean paid )
    {
        put( PAID, paid );
        return this;
    }

    public InvoiceQuery setSelfBilled( Boolean selfBilled )
    {
        put( SELF_BILLED, selfBilled );
        return this;
    }

    public InvoiceQuery setType( OrderType type )
    {
        put( TYPE, type.toString() );
        return this;
    }
}
