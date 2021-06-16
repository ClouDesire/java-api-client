package com.cloudesire.platform.apiclient.dto.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude( JsonInclude.Include.NON_NULL )
public abstract class DTO implements Serializable
{
}
