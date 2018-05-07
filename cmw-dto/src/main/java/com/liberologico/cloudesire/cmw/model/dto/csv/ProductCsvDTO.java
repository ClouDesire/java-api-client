package com.liberologico.cloudesire.cmw.model.dto.csv;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.liberologico.cloudesire.cmw.model.dto.DTO;

import java.util.Date;

@JsonPropertyOrder( { "name", "type", "category", "company", "email", "published" } )
public class ProductCsvDTO extends DTO
{
    private String name;

    private String type;

    private String category;

    private String company;

    private String email;

    private Date published;

    // region Auto-generated code

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory( String category )
    {
        this.category = category;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany( String company )
    {
        this.company = company;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public Date getPublished()
    {
        return published;
    }

    public void setPublished( Date published )
    {
        this.published = published;
    }

    // endregion
}
