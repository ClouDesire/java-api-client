package com.liberologico.cloudesire.cmw.model.dto;

import com.liberologico.cloudesire.cmw.model.enums.StackParameterValueType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class StackParameterDTO extends BaseEntityDTO
{
    @NotEmpty
    private String parameterIdentifier;

    private String regexRule;

    private String label;

    @NotNull
    private StackParameterValueType type = StackParameterValueType.STRING;

    @NotNull
    @Valid
    private UrlEntityDTO nodeRole;

    public String getParameterIdentifier()
    {
        return parameterIdentifier;
    }

    public void setParameterIdentifier( String parameterIdentifier )
    {
        this.parameterIdentifier = parameterIdentifier;
    }

    public String getRegexRule()
    {
        return regexRule;
    }

    public void setRegexRule( String regexRule )
    {
        this.regexRule = regexRule;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    public UrlEntityDTO getNodeRole()
    {
        return nodeRole;
    }

    public void setNodeRole( UrlEntityDTO nodeRole )
    {
        this.nodeRole = nodeRole;
    }

    public StackParameterValueType getType()
    {
        return type;
    }

    public void setType( StackParameterValueType type )
    {
        this.type = type;
    }
}
