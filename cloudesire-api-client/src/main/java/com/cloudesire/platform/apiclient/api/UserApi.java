package com.cloudesire.platform.apiclient.api;

import com.liberologico.cloudesire.cmw.model.dto.CardDataDTO;
import com.liberologico.cloudesire.cmw.model.dto.MyUserDTO;
import com.liberologico.cloudesire.cmw.model.dto.PasswordRecoveryDTO;
import com.liberologico.cloudesire.cmw.model.dto.PasswordResetDTO;
import com.liberologico.cloudesire.cmw.model.dto.SepaDataDTO;
import com.liberologico.cloudesire.cmw.model.dto.TokenDataDTO;
import com.liberologico.cloudesire.cmw.model.dto.body.UserPatch;
import com.liberologico.cloudesire.cmw.model.dto.request.UserActivationDTO;
import com.liberologico.cloudesire.cmw.model.enums.UserRole;
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
    @POST( "user/activate" )
    Call<Void> activateAccount( @Body UserActivationDTO payload );

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

    @POST( "user" )
    Call<MyUserDTO> create( @Body MyUserDTO userDTO, @Query( "reseller" ) String reseller );

    @DELETE( "user/{id}/payment" )
    Call<Void> deletePaymentDataForAdmin( @Path( "id" ) int id );

    @DELETE( "user/payment" )
    Call<Void> deletePaymentData();

    @DELETE( "user/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    @PATCH( "user/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body UserPatch input );

    @GET( "user" )
    Call<List<MyUserDTO>> getAll( @QueryMap Map<String, String> pageRequest );

    @GET( "user" )
    Call<List<MyUserDTO>> getAll( @Query( "textField" ) String textField, @Query( "companyId" ) Integer companyId,
            @Query( "role" ) UserRole role, @Query( "disabled" ) Boolean disabled,
            @QueryMap Map<String, String> pageRequest );

    @GET( "user/typeahead/{query}" )
    Call<List<MyUserDTO>> getTypeahead( @Path( "query" ) String query, @QueryMap Map<String, String> pageRequest,
            @Query( "role" ) String role );

    @GET( "user/externalId/{externalId}" )
    Call<MyUserDTO> getUserByExternalId( @Path( "externalId" ) String externalId );

    @GET( "user/email={email}" )
    Call<MyUserDTO> getByEmail( @Path( "email" ) String email );

    @GET( "user/{id}" )
    Call<MyUserDTO> get( @Path( "id" ) int id );

    /**
     * @deprecated look for {@link MyUserDTO#isValidAddress()}
     */
    @Deprecated
    @GET( "user/isMyAddressValid" )
    Call<Boolean> isMyAddressValid();

    @POST( "user/password/recovery" )
    Call<Void> passwordRecovery( @Body PasswordRecoveryDTO request );

    @POST( "user/password/recovery" )
    Call<Void> passwordRecovery( @Body PasswordRecoveryDTO request, @Query( "reseller" ) String reseller );

    @POST( "user/password/reset" )
    Call<Void> passwordReset( @Body PasswordResetDTO request );

    @POST( "user/password/reset" )
    Call<Void> passwordReset( @Body PasswordResetDTO request, @Query( "reseller" ) String reseller );

    @POST( "user/verification" )
    Call<Void> requestVerification();

    @POST( "user/payment/card" )
    Call<Void> saveCardData( @Body CardDataDTO data );

    @POST( "user/payment/sepa" )
    Call<Void> saveSepaData( @Body SepaDataDTO data );

    @POST( "user/payment/token" )
    Call<Void> saveTokenData( @Body TokenDataDTO data );

    @GET( "user/{id}/metadata" )
    Call<Map<String, Object>> getMetadata( @Path( "id" ) int id );

    @PUT( "user/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, Object> payload );

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
