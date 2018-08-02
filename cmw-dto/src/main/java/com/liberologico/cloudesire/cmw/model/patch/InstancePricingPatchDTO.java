package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class InstancePricingPatchDTO extends DTO
{
    @NotNull
    private Action action;

    public InstancePricingPatchDTO( Action action )
    {
        this.action = action;
    }

    public InstancePricingPatchDTO()
    {
    }

    public Action getAction()
    {
        return action;
    }

    public void setAction( Action action )
    {
        this.action = action;
    }

    public enum Action
    {
        /**
         * @deprecated by {@link #RELINK}
         */
        @ApiModelProperty( hidden = true )
        @Deprecated
        RELINK_VMC( "relink vmc" ),

        @ApiModelProperty( "Relink instance pricings to every VM configuration" )
        RELINK( "relink" );

        private final String toString;

        Action( String toString )
        {
            this.toString = toString;
        }

        @Override
        public String toString()
        {
            return toString;
        }
    }
}
