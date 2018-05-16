package com.cloudesire.platform.apiclient;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class MultipartFactory
{
    public static MultipartBody.Part build( String fileName, byte[] payload, String contentType )
    {
        RequestBody file = RequestBody.create( MediaType.parse( contentType ), payload );
        return MultipartBody.Part.createFormData( "file", fileName, file );
    }

    public static MultipartBody.Part build( String fileName, byte[] payload )
    {
        return build( fileName, payload, "application/octet-stream" );
    }

    private MultipartFactory()
    {
    }
}
