package com.cloudesire.platform.apiclient.dto.model.filters;

import com.cloudesire.platform.apiclient.dto.model.dto.PageRequestDTO;
import com.liberologico.cloudesire.common.SimpleDateFormatFactory;
import io.swagger.annotations.ApiModelProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public abstract class ReportFilter extends PageRequestDTO
{
    @ApiModelProperty( "Filter by Product ID" )
    private Integer productId;

    @ApiModelProperty( "Filter by Product Plan ID" )
    private Integer productVersionId;

    @ApiModelProperty( "Filter results starting from date" )
    private Date from;

    @ApiModelProperty( "Filter results until date" )
    private Date to;

    // region Builder
    public ReportFilter product( int productId )
    {
        this.productId = productId;
        return this;
    }

    public ReportFilter productVersion( int productVersionId )
    {
        this.productVersionId = productVersionId;
        return this;
    }

    public ReportFilter from( String from ) throws ParseException
    {
        return from( SimpleDateFormatFactory.dateFormat().parse( from ) );
    }

    public ReportFilter from( Date from )
    {
        this.from = from;
        return this;
    }

    public ReportFilter to( String to ) throws ParseException
    {
        return to( SimpleDateFormatFactory.dateFormat().parse( to ) );
    }

    public ReportFilter to( Date to )
    {
        this.to = to;
        return this;
    }
    // endregion

    @Override
    public Map<String, String> toMap()
    {
        Map<String, String> map = super.toMap();
        if ( productId != null ) map.put( "productId", productId.toString() );
        if ( productVersionId != null ) map.put( "productVersionId", productVersionId.toString() );
        SimpleDateFormat dateFormat = SimpleDateFormatFactory.dateFormat();
        if ( from != null ) map.put( "from", dateFormat.format( from ) );
        if ( to != null ) map.put( "to", dateFormat.format( to ) );
        return map;
    }

    // region Getters & Setters
    public Integer getProductId()
    {
        return productId;
    }

    public void setProductId( Integer productId )
    {
        this.productId = productId;
    }

    public Integer getProductVersionId()
    {
        return productVersionId;
    }

    public void setProductVersionId( Integer productVersionId )
    {
        this.productVersionId = productVersionId;
    }
    // endregion
}
