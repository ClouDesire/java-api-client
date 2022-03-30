package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ArrayUtils;

import java.util.EnumSet;
import java.util.Set;

import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_CUSTOM;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_EXTRA;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_INCOME;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.MUST_BE_PAID;

@ApiModel( description = "Which kind of cost" )
public enum LineType
{
    BACKUP,
    BANDWIDTH( 40, MUST_BE_PAID ),
    BILLINGITEMCOST( IS_EXTRA, IS_INCOME ),
    BILLINGITEMSETUP( IS_EXTRA, IS_INCOME ),
    BILLINGITEMPROPORTIONALSETUP( IS_EXTRA, IS_INCOME ),
    @ApiModelProperty( hidden = true )
    @Deprecated
    BILLINGITEMRECURRING( IS_EXTRA, IS_INCOME ),
    @ApiModelProperty( hidden = true )
    @Deprecated
    CLOUDESIREFEE,
    /** Monthly fee */
    @ApiModelProperty( "License costs" )
    CONFIGURATION( 10, IS_INCOME, MUST_BE_PAID ),
    COUPONDISCOUNT( 15, IS_INCOME ),
    @ApiModelProperty( "Custom vendor invoice" )
    CUSTOM( IS_CUSTOM, IS_INCOME ),
    DISK_UPGRADE( MUST_BE_PAID ),
    DISKSPACE( 50, MUST_BE_PAID ),
    IAASEXPENSE,
    @Deprecated
    @ApiModelProperty( hidden = true )
    METRIC( IS_INCOME, MUST_BE_PAID ),
    ONESHOTCOST( IS_CUSTOM, IS_INCOME ),
    @Deprecated
    @ApiModelProperty( hidden = true )
    PRODUCT,
    RECURRINGCOST( IS_CUSTOM, IS_INCOME ),
    REFUND,
    SETUPFEE( 20, IS_INCOME ),
    /** Bollo */
    STAMPDUTY,
    @ApiModelProperty( "Cloud provider upfront costs" )
    UPFRONT( 29 ),
    @ApiModelProperty( "Cloud costs" )
    VIRTUALMACHINE( 30, MUST_BE_PAID );

    private final int weight;
    private final boolean isCustom;
    private final boolean isExtra;
    private final boolean isIncome;
    private final boolean mustBePaid;

    LineType( int weight, Option... options )
    {
        this.weight = weight;
        this.isCustom = ArrayUtils.contains( options, IS_CUSTOM );
        this.isExtra = ArrayUtils.contains( options, IS_EXTRA );
        this.isIncome = ArrayUtils.contains( options, IS_INCOME );
        this.mustBePaid = ArrayUtils.contains( options, MUST_BE_PAID );
    }

    LineType( Option... options )
    {
        this( HEAVY_WEIGHT, options );
    }

    LineType()
    {
        this.weight = HEAVY_WEIGHT;
        this.isCustom = false;
        this.isExtra = false;
        this.isIncome = false;
        this.mustBePaid = false;
    }

    public static Set<LineType> iaasCosts()
    {
        return EnumSet.of( VIRTUALMACHINE, BANDWIDTH, DISKSPACE );
    }

    public boolean isCustom()
    {
        return isCustom;
    }

    public boolean isExtra()
    {
        return isExtra;
    }

    public boolean isIaasCost()
    {
        return iaasCosts().contains( this );
    }

    public boolean isIncome()
    {
        return isIncome;
    }

    public boolean mustBePaid()
    {
        return mustBePaid;
    }

    public int getWeight()
    {
        return weight;
    }

    static final int HEAVY_WEIGHT = 10000;

    enum Option
    {
        /**
         * This LineType refers to a custom billing cost
         */
        IS_CUSTOM,

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
