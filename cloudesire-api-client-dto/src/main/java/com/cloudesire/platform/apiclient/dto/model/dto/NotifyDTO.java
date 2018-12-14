package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NotifyDTO extends BaseEntityDTO
{
    private Date start;

    private Date end;

    private Set<UserRole> userRoles = new HashSet<>();

    @NotNull
    private String message;

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof NotifyDTO ) ) return false;
        NotifyDTO notifyDTO = (NotifyDTO) o;
        return Objects.equals( start, notifyDTO.start ) &&
                Objects.equals( end, notifyDTO.end ) &&
                Objects.equals( userRoles, notifyDTO.userRoles ) &&
                Objects.equals( message, notifyDTO.message );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( start, end, userRoles, message );
    }

    public Date getStart()
    {
        return start;
    }

    public void setStart( Date start )
    {
        this.start = start;
    }

    public Date getEnd()
    {
        return end;
    }

    public void setEnd( Date end )
    {
        this.end = end;
    }

    public Set<UserRole> getUserRoles()
    {
        return userRoles;
    }

    public void setUserRoles( Set<UserRole> userRoles )
    {
        this.userRoles = userRoles;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }
}
