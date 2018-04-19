package com.liberologico.cloudesire.cmw.model.dto;

public class UserCompanyDTO extends CompanyDTO
{
    public UserCompanyDTO( String name, String email )
    {
        super( name );
        setEmailAddress( email );
    }

    public UserCompanyDTO( String name )
    {
        super( name );
    }

    public UserCompanyDTO()
    {
        super();
    }
}
