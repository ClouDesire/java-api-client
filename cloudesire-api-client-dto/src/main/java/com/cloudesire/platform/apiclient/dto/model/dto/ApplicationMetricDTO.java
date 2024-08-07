package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.ApiVersion;
import com.cloudesire.platform.apiclient.dto.annotations.FieldAPI;
import com.cloudesire.platform.apiclient.dto.annotations.UnsupportedAPI;
import com.cloudesire.platform.apiclient.dto.model.enums.ApplicationMetricType;
import com.cloudesire.platform.apiclient.dto.model.enums.Frequency;
import com.cloudesire.platform.apiclient.dto.model.enums.GaugeMetricFunction;
import com.cloudesire.platform.apiclient.dto.model.enums.MetricFunction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class ApplicationMetricDTO extends BaseEntityDTO
{
    @Valid
    @NotNull
    private UrlEntityDTO billingItem;

    @Schema( description = "Whether the metric is a counter (value always increments) or a gauge (value can arbitrarily go up and down)")
    private boolean counter;

    @UnsupportedAPI( sinceVersion = ApiVersion.V20201005 )
    private GaugeMetricFunction gaugeMetricFunction;

    @FieldAPI( sinceVersion = ApiVersion.V20201005 )
    private MetricFunction metricFunction;

    @Valid
    private UrlEntityDTO applicationFile;

    @Valid
    private UrlEntityDTO product;

    @NotNull
    private ApplicationMetricType type = ApplicationMetricType.EXTERNAL;

    @Schema( description = "URL to fetch a metric for syndicated products, a relative path for managed products or null if metric is harvested by platform prometheus")
    private String endpoint;

    @UnsupportedAPI( sinceVersion = ApiVersion.V20190819 )
    private Frequency frequence;

    @FieldAPI( sinceVersion = ApiVersion.V20190819 )
    private Frequency frequency;

    public UrlEntityDTO getBillingItem()
    {
        return billingItem;
    }

    public void setBillingItem( UrlEntityDTO billingItem )
    {
        this.billingItem = billingItem;
    }

    public Boolean getCounter()
    {
        return counter;
    }

    public void setCounter( boolean counter )
    {
        this.counter = counter;
    }

    /**
     * @deprecated by {@link #getMetricFunction()}
     */
    @Deprecated
    public GaugeMetricFunction getGaugeMetricFunction()
    {
        return gaugeMetricFunction;
    }

    /**
     * @deprecated by {@link #setMetricFunction(MetricFunction)}
     */
    @Deprecated
    public void setGaugeMetricFunction( GaugeMetricFunction gaugeMetricFunction )
    {
        this.gaugeMetricFunction = gaugeMetricFunction;
    }

    public MetricFunction getMetricFunction()
    {
        return metricFunction;
    }

    public void setMetricFunction( MetricFunction metricFunction )
    {
        this.metricFunction = metricFunction;
    }

    @NotNull
    public ApplicationMetricType getType()
    {
        return type;
    }

    public void setType( @NotNull ApplicationMetricType type )
    {
        this.type = type;
    }

    public String getEndpoint()
    {
        return endpoint;
    }

    public void setEndpoint( String endpoint )
    {
        this.endpoint = endpoint;
    }

    /**
     * @deprecated use {@link #getFrequency()}
     */
    @Deprecated
    public Frequency getFrequence()
    {
        return this.frequence;
    }

    /**
     * @deprecated use {@link #setFrequency(Frequency)}
     */
    @Deprecated
    public void setFrequence( Frequency frequence )
    {
        this.frequence = frequence;
    }

    public Frequency getFrequency()
    {
        return frequency;
    }

    public void setFrequency( Frequency frequency )
    {
        this.frequency = frequency;
    }

    public UrlEntityDTO getApplicationFile()
    {
        return applicationFile;
    }

    public void setApplicationFile( UrlEntityDTO applicationFile )
    {
        this.applicationFile = applicationFile;
    }

    public UrlEntityDTO getProduct()
    {
        return product;
    }

    public void setProduct( UrlEntityDTO product )
    {
        this.product = product;
    }

    @JsonIgnore
    public boolean isDeployedByUs()
    {
        return product == null;
    }

    @JsonIgnore
    public boolean isSyndicated()
    {
        return product != null && applicationFile == null;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        ApplicationMetricDTO that = (ApplicationMetricDTO) o;
        return counter == that.counter && billingItem.equals( that.billingItem ) && Objects
                .equals( applicationFile, that.applicationFile ) && Objects.equals( product, that.product ) && endpoint
                .equals( that.endpoint ) && frequency == that.frequency;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( super.hashCode(), billingItem, counter, applicationFile, product, endpoint, frequency );
    }
}
