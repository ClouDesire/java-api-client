package com.liberologico.cloudesire.cmw.model.dto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SpringCacheDTO
{
    private List<String> members = new ArrayList<>();
    private long hazelcastDistributedObjectsSize;
    private List<String> hazelcastDistributedObjects;
    private Map<String, Integer> caches = new LinkedHashMap<>();

    public List<String> getMembers()
    {
        return members;
    }

    public void setMembers( List<String> members )
    {
        this.members = members;
    }

    public long getHazelcastDistributedObjectsSize()
    {
        return hazelcastDistributedObjectsSize;
    }

    public void setHazelcastDistributedObjectsSize( long hazelcastDistributedObjectsSize )
    {
        this.hazelcastDistributedObjectsSize = hazelcastDistributedObjectsSize;
    }

    public List<String> getHazelcastDistributedObjects()
    {
        return hazelcastDistributedObjects;
    }

    public void setHazelcastDistributedObjects( List<String> hazelcastDistributedObjects )
    {
        this.hazelcastDistributedObjects = hazelcastDistributedObjects;
    }

    public Map<String, Integer> getCaches()
    {
        return caches;
    }

    public void setCaches( Map<String, Integer> caches )
    {
        this.caches = caches;
    }
}
