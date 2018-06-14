package com.liberologico.cloudesire.common;

public class Regexp
{
    public static final String INTERNET_DOMAIN = "^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])(\\.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9]))*$";

    /* https://www.mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/ */
    public static final String INTERNET_EMAIL = "^[_A-Za-z0-9-\\+\\.]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static final String A_POINT = "\\.";

    public static final String HEX_COLOR_LOWERCASE = "(^#[0-9a-f]{6}$)|(^#[0-9a-f]{3}$)";

    private Regexp()
    {
    }
}
