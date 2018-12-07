package com.cloudesire.platform.apiclient;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Factory to easily build MultipartBody.Part instances
 */
public class MultipartFactory
{
    /**
     * Build a {@link MultipartBody.Part} object to be used when uploading files via API
     * @param fileName the name of the uploaded file
     * @param payload the contents of the uploaded file
     * @param contentType the suggested content-type of the uploaded file
     * @return a valid MultipartBody.Part instance
     */
    public static MultipartBody.Part build( String fileName, byte[] payload, String contentType )
    {
        RequestBody file = RequestBody.create( MediaType.parse( contentType ), payload );
        return MultipartBody.Part.createFormData( "file", fileName, file );
    }

    /**
     * Build a {@link okhttp3.MultipartBody.Part} object with application/octet-stream content-type
     * to be used when uploading files via API
     * @param fileName the name of the uploaded file
     * @param payload the contents of the uploaded file
     * @return a valid MultipartBody.Part instance
     */
    public static MultipartBody.Part build( String fileName, byte[] payload )
    {
        return build( fileName, payload, "application/octet-stream" );
    }

    private MultipartFactory()
    {
    }
}
