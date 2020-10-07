package com.cloudesire.platform.apiclient.dto.model.utils;

import com.cloudesire.platform.apiclient.dto.model.enums.CounterMetricFunction;
import com.cloudesire.platform.apiclient.dto.model.enums.GaugeMetricFunction;
import com.cloudesire.platform.apiclient.dto.model.enums.MetricFunction;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.apache.commons.lang3.EnumUtils.getEnumMap;

public final class MetricFunctionCreator
{
    private static final Map<String, MetricFunction> MAP = new LinkedHashMap<>();

    static
    {
        MAP.putAll( getEnumMap( CounterMetricFunction.class ) );
        MAP.putAll( getEnumMap( GaugeMetricFunction.class ) );
    }

    public static MetricFunction create( String name )
    {
        return MAP.get( name );
    }

    private MetricFunctionCreator()
    {
    }
}
