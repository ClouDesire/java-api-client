package com.cloudesire.platform.apiclient.dto.model.dto;

public class HibernateCacheDTO
{
    private long hitCount;
    private long missCount;
    private long putCount;
    private long sizeInMemory;
    private long secondLevelCacheHitCount;
    private long secondLevelCacheMissCount;
    private long secondLevelCachePutCount;
    private long queryCacheHitCount;
    private long queryCacheMissCount;
    private long queryCachePutCount;
    private long queryExecutionMaxTime;

    public long getHitCount()
    {
        return hitCount;
    }

    public void setHitCount( long hitCount )
    {
        this.hitCount = hitCount;
    }

    public long getMissCount()
    {
        return missCount;
    }

    public void setMissCount( long missCount )
    {
        this.missCount = missCount;
    }

    public long getPutCount()
    {
        return putCount;
    }

    public void setPutCount( long putCount )
    {
        this.putCount = putCount;
    }

    public long getSizeInMemory()
    {
        return sizeInMemory;
    }

    public void setSizeInMemory( long sizeInMemory )
    {
        this.sizeInMemory = sizeInMemory;
    }

    public long getSecondLevelCacheHitCount()
    {
        return secondLevelCacheHitCount;
    }

    public void setSecondLevelCacheHitCount( long secondLevelCacheHitCount )
    {
        this.secondLevelCacheHitCount = secondLevelCacheHitCount;
    }

    public long getSecondLevelCacheMissCount()
    {
        return secondLevelCacheMissCount;
    }

    public void setSecondLevelCacheMissCount( long secondLevelCacheMissCount )
    {
        this.secondLevelCacheMissCount = secondLevelCacheMissCount;
    }

    public long getSecondLevelCachePutCount()
    {
        return secondLevelCachePutCount;
    }

    public void setSecondLevelCachePutCount( long secondLevelCachePutCount )
    {
        this.secondLevelCachePutCount = secondLevelCachePutCount;
    }

    public long getQueryCacheHitCount()
    {
        return queryCacheHitCount;
    }

    public void setQueryCacheHitCount( long queryCacheHitCount )
    {
        this.queryCacheHitCount = queryCacheHitCount;
    }

    public long getQueryCacheMissCount()
    {
        return queryCacheMissCount;
    }

    public void setQueryCacheMissCount( long queryCacheMissCount )
    {
        this.queryCacheMissCount = queryCacheMissCount;
    }

    public long getQueryCachePutCount()
    {
        return queryCachePutCount;
    }

    public void setQueryCachePutCount( long queryCachePutCount )
    {
        this.queryCachePutCount = queryCachePutCount;
    }

    public long getQueryExecutionMaxTime()
    {
        return queryExecutionMaxTime;
    }

    public void setQueryExecutionMaxTime( long queryExecutionMaxTime )
    {
        this.queryExecutionMaxTime = queryExecutionMaxTime;
    }
}
