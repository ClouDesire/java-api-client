package com.cloudesire.platform.apiclient.body;

public class CompanyPatch
{
    private CompanyAction action;

    public CompanyAction getAction()
    {
        return action;
    }

    public CompanyPatch setAction( CompanyAction action )
    {
        this.action = action;
        return this;
    }

    public enum CompanyAction
    {
        APS_ENABLE("apsenable"),
        APS_DISABLE("apsdisable");

        private final String value;

        CompanyAction( String value )
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
