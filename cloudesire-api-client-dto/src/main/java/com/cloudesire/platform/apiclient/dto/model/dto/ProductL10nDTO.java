package com.cloudesire.platform.apiclient.dto.model.dto;

import java.util.Map;

public interface ProductL10nDTO
{
    String getLongDescription();

    void setLongDescription( String longDescription );

    String getShortDescription();

    void setShortDescription( String shortDescription );

    String getEndUserInstructions();

    void setEndUserInstructions( String endUserInstructions );

    String getTermsOfService();

    void setTermsOfService( String termsOfService );

    String getPrivacy();

    void setPrivacy( String privacy );

    String getServiceLevelAgreement();

    void setServiceLevelAgreement( String serviceLevelAgreement );

    Map<String, Object> getExtraData();

    void setExtraData( Map<String, Object> extraData );

    Map<String, String> getFaq();

    void setFaq( Map<String, String> faq );

    String getTerminationMessage();

    void setTerminationMessage( String terminationMessage );
}
