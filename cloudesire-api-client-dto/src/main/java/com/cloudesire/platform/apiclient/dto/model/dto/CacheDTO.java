package com.cloudesire.platform.apiclient.dto.model.dto;

public class CacheDTO
{
    private HibernateCacheDTO hibernateCache = new HibernateCacheDTO();
    private SpringCacheDTO springCache = new SpringCacheDTO();

    public HibernateCacheDTO getHibernateCache()
    {
        return hibernateCache;
    }

    public void setHibernateCache( HibernateCacheDTO hibernateCache )
    {
        this.hibernateCache = hibernateCache;
    }

    public SpringCacheDTO getSpringCache()
    {
        return springCache;
    }

    public void setSpringCache( SpringCacheDTO springCache )
    {
        this.springCache = springCache;
    }
}
