package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

public class InvoiceQuery extends BaseQuery
{
    private static final String EXPIRED = "expired";
    private static final String FROM = "from";
    private static final String NOMINEE = "nominee";
    private static final String PAID = "paid";
    private static final String SELF_BILLED = "selfBilled";
    private static final String TO = "to";
    private static final String TYPE = "type";

    public InvoiceQuery setExpired( boolean expired )
    {
        put( EXPIRED, expired );
        return this;
    }

    public InvoiceQuery setFrom( Date from )
    {
        put( FROM, SimpleDateFormatFactory.dateFormat().format( from ) );
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

    public InvoiceQuery setTo( Date to )
    {
        put( TO, SimpleDateFormatFactory.dateFormat().format( to ) );
        return this;
    }

    public InvoiceQuery setType( OrderType type )
    {
        put( TYPE, type.toString() );
        return this;
    }
}
