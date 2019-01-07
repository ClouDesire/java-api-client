package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ArrayUtils;

import java.util.EnumSet;

import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_EXTRA;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_INCOME;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.MUST_BE_PAID;

@ApiModel( "Which kind of cost" )
public enum LineType
{
    BACKUP,
    BANDWIDTH( MUST_BE_PAID ),
    BILLINGITEMCOST( IS_EXTRA, IS_INCOME ),
    BILLINGITEMSETUP( IS_EXTRA, IS_INCOME ),
    BILLINGITEMRECURRING( IS_EXTRA, IS_INCOME ),
    /** What cloudesire takes out of product price */
    CLOUDESIREFEE,
    /** Monthly fee */
    CLOUDESIREPRICE( MUST_BE_PAID ),
    @ApiModelProperty( "License costs" )
    CONFIGURATION( IS_INCOME, MUST_BE_PAID ),
    COUPONDISCOUNT( IS_INCOME ),
    @ApiModelProperty( "Custom vendor invoice" )
    CUSTOM( IS_INCOME ),
    DISK_UPGRADE( MUST_BE_PAID ),
    DISKSPACE( MUST_BE_PAID ),
    IAASEXPENSE,
    @Deprecated
    @ApiModelProperty( hidden = true )
    METRIC( IS_INCOME, MUST_BE_PAID ),
    @Deprecated
    @ApiModelProperty( hidden = true )
    PRODUCT,
    RECURRINGCOST( IS_INCOME ),
    REFUND,
    SETUPFEE( IS_INCOME ),
    /** Bollo */
    STAMPDUTY,
    @ApiModelProperty( "Cloud costs" )
    VIRTUALMACHINE( MUST_BE_PAID );

    private final boolean isExtra;
    private final boolean isIncome;
    private final boolean mustBePaid;

    LineType( Option... options )
    {
        this.isExtra = ArrayUtils.contains( options, IS_EXTRA );
        this.isIncome = ArrayUtils.contains( options, IS_INCOME );
        this.mustBePaid = ArrayUtils.contains( options, MUST_BE_PAID );
    }

    LineType()
    {
        this.isExtra = false;
        this.isIncome = false;
        this.mustBePaid = false;
    }

    public boolean isExtra()
    {
        return isExtra;
    }

    public boolean isIaasCost()
    {
        return EnumSet.of( VIRTUALMACHINE, BANDWIDTH, DISKSPACE ).contains( this );
    }

    public boolean isIncome()
    {
        return isIncome;
    }

    public boolean mustBePaid()
    {
        return mustBePaid;
    }

    enum Option
    {
        /**
         * This LineType refers to a billing item cost
         */
        IS_EXTRA,

        /**
         * This LineType will generate an income line with a cloudesire fee
         */
        IS_INCOME,

        /**
         * This LineType will generate an income line for a self-billed invoice
         */
        MUST_BE_PAID
    }
}
