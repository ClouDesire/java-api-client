package com.cloudesire.platform.apiclient.dto.model.dto.changelog;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

public class ValueChangeDTO implements DTO
{
    private String property;

    private String left;

    private String right;

    public ValueChangeDTO( String property, String left, String right )
    {
        this.property = property;
        this.left = left;
        this.right = right;
    }

    public ValueChangeDTO()
    {
    }

    public String getProperty()
    {
        return property;
    }

    public String getLeft()
    {
        return left;
    }


    public String getRight()
    {
        return right;
    }

    @Override
    public String toString()
    {
        return "ValueChangeDTO{" + "property='" + property + '\'' + ", left='" + left + '\'' + ", right='" + right
                + '\'' + '}';
    }
}
