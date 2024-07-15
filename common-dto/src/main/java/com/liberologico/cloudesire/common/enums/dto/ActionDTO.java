package com.liberologico.cloudesire.common.enums.dto;

import com.liberologico.cloudesire.common.enums.HttpMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Arrays;
import java.util.Objects;

@Schema( description = "An API call that the current user can execute on the parent resource" )
public class ActionDTO extends ActionUrlDTO
{
    @Schema( description = "A descriptive label for all the actions", readOnly = true )
    private String label;

    @Schema( description = "The list of actions that can be performed", readOnly = true )
    private String[] actions;

    public ActionDTO( String label, HttpMethod method, String resourceType, String[] actions )
    {
        this(label, null, method, resourceType, actions );
    }

    public ActionDTO( String label, String url, HttpMethod method, String resourceType, String[] actions )
    {
        super( url, method, resourceType );
        this.setLabel( label );
        this.setActions( actions );
    }

    @Override
    public String toString()
    {
        return label;
    }

    // region Auto-generated code
    public ActionDTO()
    {
        super();
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel( String label )
    {
        this.label = label;
    }

    public String[] getActions()
    {
        return actions;
    }

    public void setActions( String[] actions )
    {
        this.actions = actions;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( ! super.equals( o ) ) return false;
        ActionDTO actionDTO = (ActionDTO) o;
        return Objects.equals( label, actionDTO.label ) && Arrays.equals( actions, actionDTO.actions );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), label, actions );
    }
    // endregion
}
