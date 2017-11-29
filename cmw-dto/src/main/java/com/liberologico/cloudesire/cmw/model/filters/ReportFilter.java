package com.liberologico.cloudesire.cmw.model.filters;

import com.liberologico.cloudesire.cmw.model.dto.PageRequestDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public abstract class ReportFilter extends PageRequestDTO
{
    private final SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );

    private Integer productId;

    private Integer productVersionId;

    private Date from;

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
        return from( dateFormat.parse( from ) );
    }

    public ReportFilter from( Date from )
    {
        this.from = from;
        return this;
    }

    public ReportFilter to( String to ) throws ParseException
    {
        return to( dateFormat.parse( to ) );
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
