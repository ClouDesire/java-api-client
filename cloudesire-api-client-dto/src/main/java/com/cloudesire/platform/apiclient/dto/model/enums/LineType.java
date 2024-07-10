package com.cloudesire.platform.apiclient.dto.model.enums;

import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.commons.lang3.ArrayUtils;

import java.util.EnumSet;
import java.util.Set;

import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_CUSTOM;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_EXTRA;
import static com.cloudesire.platform.apiclient.dto.model.enums.LineType.Option.IS_INCOME;

@Schema( description = "Which kind of cost" )
public enum LineType
{
    BACKUP,
    BANDWIDTH( 40 ),
    BILLINGITEMCOST( IS_EXTRA, IS_INCOME ),
    BILLINGITEMSETUP( IS_EXTRA, IS_INCOME ),
    BILLINGITEMPROPORTIONALSETUP( IS_EXTRA, IS_INCOME ),
    @Schema( hidden = true )
    @Deprecated
    BILLINGITEMRECURRING( IS_EXTRA, IS_INCOME ),
    @Schema( hidden = true )
    @Deprecated
    CLOUDESIREFEE,
    /** Monthly fee */
    @Schema( description = "License costs")
    CONFIGURATION( 10, IS_INCOME ),
    COUPONDISCOUNT( 15, IS_INCOME ),
    @Schema( description = "Custom vendor invoice")
    CUSTOM( IS_CUSTOM, IS_INCOME ),
    DISK_UPGRADE,
    DISKSPACE( 50 ),
    IAASEXPENSE,
    @Deprecated
    @Schema( hidden = true )
    METRIC( IS_INCOME ),
    ONESHOTCOST( IS_CUSTOM, IS_INCOME ),
    @Deprecated
    @Schema( hidden = true )
    PRODUCT,
    RECURRINGCOST( IS_CUSTOM, IS_INCOME ),
    REFUND,
    SETUPFEE( 20, IS_INCOME ),
    /** Bollo */
    STAMPDUTY,
    @Schema( description = "Cloud provider upfront costs")
    UPFRONT( 29 ),
    @Schema( description = "Cloud costs")
    VIRTUALMACHINE( 30 );

    private final int weight;
    private final boolean isCustom;
    private final boolean isExtra;
    private final boolean isIncome;

    LineType( int weight, Option... options )
    {
        this.weight = weight;
        this.isCustom = ArrayUtils.contains( options, IS_CUSTOM );
        this.isExtra = ArrayUtils.contains( options, IS_EXTRA );
        this.isIncome = ArrayUtils.contains( options, IS_INCOME );
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
        IS_INCOME
    }
}
