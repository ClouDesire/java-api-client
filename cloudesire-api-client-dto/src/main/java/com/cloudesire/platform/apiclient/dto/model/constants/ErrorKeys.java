package com.cloudesire.platform.apiclient.dto.model.constants;

public final class ErrorKeys
{
    public static final String INVALID_SIZE = "wrong.size.%max%.%min%";
    public static final String INVALID_MIN = "must.be.greater.than.or.equal.to.%min%";
    public static final String INVALID_MAX = "must.be.lower.than.or.equal.to.%max%";
    public static final String ALPHANUMERIC = "{value.alphanumeric}";
    public static final String ALPHANUMERIC_START_WITH_LETTER = "must.be.alphanumeric.and.start.with.letter";
    public static final String TWO_DIGITS = "must.contain.two.digits";
    public static final String TWO_OR_FOUR_DIGITS = "must.contain.two.or.four.digits";
    public static final String THREE_OR_FOUR_DIGITS = "must.contain.three.or.four.digits";
    public static final String ALPHANUMERIC_UNDERSCORE = "must.be.alphanumeric.underscore.is.permitted";
    public static final String CHARACTERS_NOT_PERMITTED = "characters.not.permitted";
    public static final String CHARACTERS_NOT_PERMITTED_RESELLER = "characters.not.permitted.for.reseller";
    public static final String COMPANY_NOT_ALLOWED = "company.not.allowed";
    public static final String FEATURE_DISABLED = "feature.disabled";
    public static final String COMPANY_NAME_OR_TAX_CODE_OR_COUNTRY_NOT_SUPPLIED = "company.name.taxcode.or.country.not.supplied";
    public static final String TAX_CODE_SYNTACTICALLY_INCORRECT = "taxcode.syntactically.incorrect";

    private ErrorKeys()
    {
    }
}
