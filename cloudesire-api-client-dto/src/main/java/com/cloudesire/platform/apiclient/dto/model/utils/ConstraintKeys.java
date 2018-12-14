package com.cloudesire.platform.apiclient.dto.model.utils;

/**
 * Hibernate validator exceptions message patterns
 */
public final class ConstraintKeys
{
    public static final String INVALID_SIZE = "{wrong.size.%element%.%max%.%min%}";
    public static final String INVALID_MIN = "{must.be.greater.than.or.equal.to.%min%}";
    public static final String ALPHANUMERIC = "{must.be.alphanumeric.%element%}";
    public static final String ALPHANUMERIC_START_WITH_LETTER = "{must.be.alphanumeric.and.start.with.letter.%element%}";
    public static final String TWO_DIGITS = "{must.contain.two.digits.%element%}";
    public static final String TWO_OR_FOUR_DIGITS = "{must.contain.two.or.four.digits.%element%}";
    public static final String THREE_OR_FOUR_DIGITS = "{must.contain.three.or.four.digits.%element%}";
    public static final String ALPHANUMERIC_UNDERSCORE = "{must.be.alphanumeric.underscore.is.permitted.%element%}";
    public static final String CHARACTERS_NOT_PERMITTED = "{characters.not.permitted.%element%}";
    public static final String CHARACTERS_NOT_PERMITTED_RESELLER = "{characters.not.permitted.reseller.%element%}";
    public static final String COMPANY_NOT_ALLOWED = "{company.not.allowed.%element%}";
    public static final String FEATURE_DISABLED = "{feature.disabled.%element%}";

    private ConstraintKeys()
    {
    }
}
