package com.liberologico.cloudesire.cmw.model.enums;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum OrderType
{
    NORMAL
    {
        @Override
        public DeploymentStatusEnum getInitialState( boolean deployed )
        {
            return DeploymentStatusEnum.WAITING_PAYMENT;
        }

        @Override
        public boolean keepCustomerData()
        {
            return true;
        }
    },
    TRIAL
    {
        @Override
        public BigDecimal downscaleQuantity( BigDecimal quantity, Integer months )
        {
            return quantity.divide( new BigDecimal( 30 ), 2, RoundingMode.HALF_UP );
        }

        @Override
        public BigDecimal reducePeriods( int periods )
        {
            return BigDecimal.ONE;
        }
    },
    SANDBOX
    {
        @Override
        public BigDecimal downscaleQuantity( BigDecimal quantity, Integer months )
        {
            return quantity.divide( new BigDecimal( 30 ), 2, RoundingMode.HALF_UP )
                           .divide( new BigDecimal( 24 ), 2, RoundingMode.HALF_UP );
        }

        @Override
        public DeploymentStatusEnum getInitialState( boolean deployed )
        {
            return deployed ? DeploymentStatusEnum.PENDING : DeploymentStatusEnum.WAITING_PAYMENT;
        }

        @Override
        public BigDecimal reducePeriods( int periods )
        {
            return BigDecimal.ONE;
        }
    },
    UPGRADE /* Product Version */,
    BILLING_ITEM_UPGRADE,
    RENEWAL,
    UNMANAGED{
        @Override
        public boolean keepCustomerData()
        {
            return true;
        }
    },
    TERMINATION,
    UPSELL,
    DISK_UPGRADE,
    SYNDICATED_UPGRADE;

    public boolean billedToVendor()
    {
        return this.equals( TRIAL ) || this.equals( SANDBOX );
    }

    public BigDecimal downscaleQuantity( BigDecimal quantity, Integer months )
    {
        if ( months != null ) return quantity.multiply( BigDecimal.valueOf( months ) );

        return quantity;
    }

    public boolean keepCustomerData()
    {
        return false;
    }

    public boolean isDeployable()
    {
        return this.equals( NORMAL ) || this.equals( TRIAL ) || this.equals( SANDBOX );
    }

    public boolean isManagedByVendor()
    {
        return this.equals( TRIAL ) || this.equals( SANDBOX ) || this.equals( UNMANAGED );
    }

    public boolean isSold()
    {
        return this.equals( NORMAL ) || this.equals( RENEWAL ) || this.equals( UPGRADE );
    }

    public boolean needsBandwidth()
    {
        return this.equals( NORMAL ) || this.equals( TRIAL ) || this.equals( SANDBOX );
    }

    public BigDecimal reducePeriods( int periods )
    {
        return BigDecimal.valueOf( periods );
    }

    @SuppressWarnings( "squid:S1172 -- parameter is used in overridden method" )
    public DeploymentStatusEnum getInitialState( boolean deployed )
    {
        return DeploymentStatusEnum.PENDING;
    }
}
