package com.cloudesire.platform.apiclient.dto.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder( { "name", "surname", "phone", "email", "pec" } )
public class CatalogUserCsvDTO extends BaseUserCsvDTO
{
}
