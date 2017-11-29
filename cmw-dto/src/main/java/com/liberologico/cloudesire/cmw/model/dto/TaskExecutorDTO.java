package com.liberologico.cloudesire.cmw.model.dto;

import java.util.Objects;

public class TaskExecutorDTO extends BaseEntityDTO
{
    private String className;
    private String method;
    private String lastExecution;

    public String getClassName()
    {
        return className;
    }

    public void setClassName( String className )
    {
        this.className = className;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod( String method )
    {
        this.method = method;
    }

    public String getLastExecution()
    {
        return lastExecution;
    }

    public void setLastExecution( String lastExecution )
    {
        this.lastExecution = lastExecution;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof TaskExecutorDTO ) ) return false;
        if ( !super.equals( o ) ) return false;
        TaskExecutorDTO that = (TaskExecutorDTO) o;
        return Objects.equals( className, that.className ) && Objects.equals( method, that.method );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), className, method );
    }

    @Override
    public String toString()
    {
        return "TaskExecutorDTO{" + "className='" + className + '\'' + ", method='" + method + '\'' + '}';
    }
}
