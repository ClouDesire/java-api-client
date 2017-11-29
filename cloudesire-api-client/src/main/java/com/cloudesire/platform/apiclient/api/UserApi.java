package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.DistributorDTO;
import com.liberologico.cloudesire.cmw.model.dto.MyUserDTO;
import com.liberologico.cloudesire.cmw.model.dto.PaymentDataDTO;
import com.liberologico.cloudesire.cmw.model.dto.ResellerDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.List;
import java.util.Map;

public interface UserApi
{
    @POST( "user/{id}" )
    Call<Void> activateAccountAsAnonymous( @Path( "id" ) Integer id, @Body Object input );

    @POST( "user/activate" )
    Call<Void> activateAccountAsAnonymousV2( @Body String tag );

    @GET( "user/amIAdmin" )
    Call<Void> amIAdmin();

    @GET( "user/amISupervisor" )
    Call<Void> amISupervisor();

    @GET( "user/amIUser" )
    Call<Void> amIUser();

    @GET( "user/amIVendorOrAdmin" )
    Call<Void> amIVendorOrAdmin();

    @GET( "user/amIVendor" )
    Call<Void> amIVendor();

    @GET( "user/me" )
    Call<MyUserDTO> getMe();

    @POST( "user" )
    Call<MyUserDTO> create( @Body MyUserDTO userDTO );

    @DELETE( "user/{id}/payment/stripe" )
    Call<Void> deletePaymentDataForAdmin( @Path( "id" ) Integer id );

    @DELETE( "user/payment/stripe" )
    Call<Void> deletePaymentData();

    @DELETE( "user/{id}" )
    Call<Void> delete( @Path( "id" ) Integer id );

    @PATCH( "user/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) Integer id, @Body Object input );

    @GET( "user" )
    Call<Void> getAll( @Query( "textField" ) String textField, @Query( "companyId" ) Integer companyId,
            @Query( "role" ) String role, @Query( "disabled" ) Boolean disabled, @QueryMap Map<String, String> pageRequest );

    @GET( "user/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) Integer id );

    @GET( "user/{id}/reseller" )
    Call<ResellerDTO> getResellerProfile( @Path( "id" ) Integer id );

    @GET( "user/typeahead/{query}" )
    Call<List<MyUserDTO>> getTypeahead( @Path( "query" ) String query, @QueryMap Map<String, String> pageRequest,
            @Query( "role" ) String role );

    @GET( "user/externalId/{externalId}" )
    Call<MyUserDTO> getUserByExternalId( @Path( "externalId" ) String externalId );

    @GET( "user/email={email}" )
    Call<MyUserDTO> getByEmail( @Path( "email" ) String email );

    @GET( "user/{id}" )
    Call<MyUserDTO> get( @Path( "id" ) Integer id );

    @GET( "user/isMyAddressValid" )
    Call<Boolean> isMyAddressValid();

    @PATCH( "user/passwordRecovery" )
    Call<Void> passwordRecovery( @Query( "email" ) String email );

    @POST( "user/resetPassword/{email}/{tag}" )
    Call<Void> resetPassword( @Path( "tag" ) String tag, @Path( "email" ) String email, @Body Object map );

    @PATCH( "user" )
    Call<Void> retryRegistration( @Body Object input );

    @POST( "user/payment/stripe" )
    Call<Void> savePaymentData( @Body PaymentDataDTO paymentData );

    @GET( "user/{id}/distributor" )
    Call<DistributorDTO> getDistributorProfile( @Path( "id" ) int id );

    @GET( "user/{id}/reseller" )
    Call<ResellerDTO> getResellerProfile( @Path( "id" ) int id );

    @PUT( "user/{id}/distributor" )
    Call<DistributorDTO> saveDistributorProfile( @Path( "id" ) int id, @Body DistributorDTO profile );

    @PUT( "user/{id}/reseller" )
    Call<ResellerDTO> saveResellerProfile( @Path( "id" ) int id, @Body ResellerDTO profile );

    @PUT( "user/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) Integer id, @Body Object payload );

    @PUT( "user/{id}" )
    Call<MyUserDTO> update( @Path( "id" ) int id, @Body MyUserDTO userDTO );

    @Streaming
    @GET( "user" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @Query( "textField" ) String textField, @Query( "companyId" ) Integer companyId,
            @Query( "role" ) String role, @Query( "disabled" ) Boolean disabled,
            @QueryMap Map<String, String> pageRequest );

    @Streaming
    @GET( "user" )
    @Headers( { "Accept:text/csv" } )
    Call<ResponseBody> getCsv( @QueryMap Map<String, String> pageRequest );
}
