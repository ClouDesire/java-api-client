package com.cloudesire.platform.apiclient.query;

import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderUpgradeStatus;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;

import java.util.Date;

public class OrderQuery extends PageRequestQuery
{
    private static final String TYPE = "type";
    private static final String UPGRADE_STATUS = "upgradeStatus";
    private static final String TEXT_FIELD = "textField";
    private static final String COUPON = "coupon";
    private static final String FROM = "from";
    private static final String TO = "to";

    public OrderQuery setPageRequest( PageRequestQuery pageRequestQuery )
    {
        putAll( pageRequestQuery );
        return this;
    }

    public OrderQuery setType( OrderType type )
    {
        put( TYPE, type.toString() );
        return this;
    }

    public OrderQuery setUpgradeStatus( OrderUpgradeStatus upgradeStatus )
    {
        put( UPGRADE_STATUS, upgradeStatus.toString() );
        return this;
    }

    public OrderQuery setTextField( String textField )
    {
        put( TEXT_FIELD, textField );
        return this;
    }

    public OrderQuery setCoupon( boolean coupon )
    {
        put( COUPON, coupon );
        return this;
    }

    public OrderQuery setFrom( Date from )
    {
        put( FROM, SimpleDateFormatFactory.dateFormat().format( from ) );
        return this;
    }

    public OrderQuery setTo( Date to )
    {
        put( TO, SimpleDateFormatFactory.dateFormat().format( to ) );
        return this;
    }

    public OrderQuery setMetadata( MetadataQuery metadata )
    {
        putAll( metadata );
        return this;
    }

}
