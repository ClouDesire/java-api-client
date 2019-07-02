package com.cloudesire.platform.apiclient.response;

public final class Headers
{
    public static final String CORS = "Access-Control-Expose-Headers";
    public static final String MISTICA = "CMW-As-User";
    public static final String MODE = "Mode";
    public static final String PAGE_SIZE = "CMW-PageSize";
    public static final String PAGE_NUMBER = "CMW-PageNumber";
    public static final String TOTAL_ITEMS = "CMW-TotalItems";
    public static final String TOTAL_PAGES = "CMW-TotalPages";
    public static final String RELATED_RESOURCE = "CMW-Related-Resource";
    public static final String SIGNATURE_HEADER = "CMW-Event-Signature";
    public static final String PROCEEDS_EARNINGS = "CMW-Proceeds-Earnings";
    public static final String PROCEEDS_COSTS = "CMW-Proceeds-Costs";

    private Headers()
    {
        throw new AssertionError();
    }
}
