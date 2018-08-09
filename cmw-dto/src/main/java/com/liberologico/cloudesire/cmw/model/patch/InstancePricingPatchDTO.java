package com.liberologico.cloudesire.cmw.model.patch;

import com.liberologico.cloudesire.cmw.model.dto.DTO;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class InstancePricingPatchDTO extends DTO
{
    @NotNull
    private Action action;

    private Integer id;

    public InstancePricingPatchDTO( @NotNull Action action, @NotNull Integer id )
    {
        this( action );
        this.id = id;
    }

    public InstancePricingPatchDTO( @NotNull Action action )
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

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public enum Action
    {
        @ApiModelProperty( "Unlink an Instance Pricing from any Virtual Machine Configuration" )
        DEPRECATE( "deprecate" ),

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
