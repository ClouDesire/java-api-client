package com.cloudesire.platform.apiclient.api;

import com.cloudesire.platform.apiclient.dto.model.dto.CardDataDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.MyUserDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PasswordRecoveryDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PasswordResetDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.PaymentMethodDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.SepaDataDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.StripePaymentMethodDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.StripeTokenDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.changelog.ChangelogDTO;
import com.cloudesire.platform.apiclient.dto.model.dto.request.UserActivationDTO;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import com.cloudesire.platform.apiclient.dto.model.patch.UserPatchDTO;
import com.cloudesire.platform.apiclient.query.UserQuery;
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

import static com.cloudesire.platform.apiclient.dto.model.constants.Parameters.AS_COMPANY;

public interface UserApi
{
    // Creates
    @POST( "user" )
    Call<MyUserDTO> create( @Body MyUserDTO userDTO );

    @POST( "user" )
    Call<MyUserDTO> create( @Body MyUserDTO userDTO, @QueryMap Map<String, String> queryMap );

    // Retrieves
    @GET( "user" )
    Call<List<MyUserDTO>> getAll();

    @GET( "user" )
    Call<List<MyUserDTO>> getAll( @QueryMap UserQuery request );

    /**
     * @deprecated by {@link #getAll(UserQuery)}
     */
    @Deprecated
    @GET( "user" )
    Call<List<MyUserDTO>> getAll( @Query( "textField" ) String textField, @Query( "companyId" ) Integer companyId,
            @Query( "role" ) UserRole role, @Query( "disabled" ) Boolean disabled,
            @QueryMap Map<String, String> pageRequest );

    @GET( "user/me" )
    Call<MyUserDTO> getMe();

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

    @GET( "user/typeahead/{query}" )
    Call<List<MyUserDTO>> getTypeahead( @Path( "query" ) String query, @QueryMap Map<String, String> pageRequest,
            @Query( "role" ) String role );

    @GET( "user/externalId/{externalId}" )
    Call<MyUserDTO> getUserByExternalId( @Path( "externalId" ) String externalId );

    @GET( "user/email={email}" )
    Call<MyUserDTO> getByEmail( @Path( "email" ) String email );

    @GET( "user/{id}" )
    Call<MyUserDTO> get( @Path( "id" ) int id );

    @GET( "user/{id}/changelog" )
    Call<ChangelogDTO> getChangelog( @Path( "id" ) int id );

    /**
     * @deprecated look for {@link MyUserDTO#isValidAddress()}
     */
    @Deprecated
    @GET( "user/isMyAddressValid" )
    Call<Boolean> isMyAddressValid();

    @GET( "user/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) int id );

    @GET( "user/{id}/metadata" )
    Call<Map<String, String>> getMetadata( @Path( "id" ) int id, @Query( AS_COMPANY ) String companySlug );

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

    // Updates
    @PUT( "user/{id}" )
    Call<MyUserDTO> update( @Path( "id" ) int id, @Body MyUserDTO userDTO );

    @PUT( "user/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, String> payload );

    @PUT( "user/{id}/metadata" )
    Call<Void> updateMetadata( @Path( "id" ) int id, @Body Map<String, String> payload,
            @Query( AS_COMPANY ) String companySlug );

    @POST( "user/activate" )
    Call<Void> activateAccount( @Body UserActivationDTO payload );

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

    /**
     * @deprecated look for {@link #savePaymentMethod(StripePaymentMethodDTO)}
     */
    @Deprecated
    @POST( "user/payment/card" )
    Call<Void> saveCardData( @Body CardDataDTO data );

    /**
     * @deprecated look for {@link #saveTokenData(StripeTokenDTO)}
     */
    @Deprecated
    @POST( "user/payment/sepa" )
    Call<Void> saveSepaData( @Body SepaDataDTO data );

    /**
     * @deprecated look for {@link PaymentMethodApi#create(PaymentMethodDTO)}
     */
    @Deprecated
    @POST( "user/payment/token" )
    Call<Void> saveTokenData( @Body StripeTokenDTO data );

    /**
     * @deprecated look for {@link PaymentMethodApi#create(PaymentMethodDTO)}
     */
    @Deprecated
    @POST( "user/payment/method" )
    Call<Void> savePaymentMethod( @Body StripePaymentMethodDTO data );

    @PATCH( "user/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body UserPatchDTO input );

    @PATCH( "user/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body UserPatchDTO input, @Query( "language" ) String language );

    /**
     * @deprecated by {@link #partialUpdate(int, UserPatchDTO)}
     */
    @Deprecated
    @PATCH( "user/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input );

    /**
     * @deprecated by {@link #partialUpdate(int, UserPatchDTO, String)}
     */
    @Deprecated
    @PATCH( "user/{id}" )
    Call<Void> partialUpdate( @Path( "id" ) int id, @Body Map<String, Object> input, @Query( "language" ) String language );

    // Deletes
    @DELETE( "user/{id}" )
    Call<Void> delete( @Path( "id" ) int id );

    /**
     * @deprecated look for {@link PaymentMethodApi#delete(int)}
     */
    @Deprecated
    @DELETE( "user/{id}/payment" )
    Call<Void> deletePaymentDataForAdmin( @Path( "id" ) int id );

    /**
     * @deprecated look for {@link PaymentMethodApi#delete(int)}
     */
    @Deprecated
    @DELETE( "user/payment" )
    Call<Void> deletePaymentData();

    @DELETE( "user/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key );

    @DELETE( "user/{id}/metadata/{key}" )
    Call<Void> deleteMetadata( @Path( "id" ) int id, @Path( "key" ) String key,
            @Query( AS_COMPANY ) String companySlug );
}
