package com.cloudesire.platform.apiclient.body;

public class ProductPatch
{
    public static final ProductPatch ENABLED = new ProductPatch().setAction( ProductAction.ENABLED );
    public static final ProductPatch DISABLED = new ProductPatch().setAction( ProductAction.DISABLED );
    public static final ProductPatch APPROVE = new ProductPatch().setAction( ProductAction.APPROVE );

    private ProductAction action;

    public ProductPatch setAction( ProductAction action )
    {
        this.action = action;
        return this;
    }

    public ProductAction getAction()
    {
        return action;
    }

    public enum ProductAction
    {
        ENABLED("enabled"),
        DISABLED("disabled"),
        APPROVE("approve");

        private final String value;

        ProductAction( String value )
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
}
