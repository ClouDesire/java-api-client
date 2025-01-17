package com.cloudesire.platform.apiclient.dto.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;

public class SubscriptionDetailV2DTO extends BaseSubscriptionDetailDTO
{
    @Schema( description = "The value chosen by the customer for a list of ConfigurationParameters", example = "{ \"configurationParameter/123\": \"custom_value\"}" )
    @Valid
    private Map<UrlEntityDTO, String> configurationParameters = new HashMap<>();

    public Map<UrlEntityDTO, String> getConfigurationParameters()
    {
        return configurationParameters;
    }

    public void setConfigurationParameters( Map<UrlEntityDTO, String> configurationParameters )
    {
        this.configurationParameters = configurationParameters;
    }
}
