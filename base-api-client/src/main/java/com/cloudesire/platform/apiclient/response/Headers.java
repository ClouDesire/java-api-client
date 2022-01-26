package com.cloudesire.platform.apiclient.response;

public final class Headers
{
    public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
    public static final String AUTH_TOKEN = "CMW-Auth-Token";
    public static final String SSO_AUTH_TOKEN = "Social-Auth-Token";
    public static final String SSO_AUTH_USER = "Social-Auth-User";
    public static final String SSO_AUTH_PROVIDER = "Social-Auth-Provider";
    public static final String MISTICA = "CMW-As-User";
    public static final String MODE = "Mode";
    public static final String PAGE_SIZE = "CMW-PageSize";
    public static final String PAGE_NUMBER = "CMW-PageNumber";
    public static final String TOTAL_ITEMS = "CMW-TotalItems";
    public static final String TOTAL_PAGES = "CMW-TotalPages";
    public static final String RELATED_RESOURCE = "CMW-Related-Resource";
    public static final String SIGNATURE_HEADER = "CMW-Event-Signature";
    public static final String COSTS_TOTAL = "CMW-Costs-Total";
    public static final String PROCEEDS_EARNINGS = "CMW-Proceeds-Earnings";
    public static final String PROCEEDS_COSTS = "CMW-Proceeds-Costs";
    public static final String REQUEST_ID = "CMW-Request-Id";
    public static final String RESPONSE_TIME = "CMW-Response-Time-MS";

    private Headers()
    {
        throw new AssertionError();
    }
}
