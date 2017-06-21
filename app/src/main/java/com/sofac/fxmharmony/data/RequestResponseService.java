package com.sofac.fxmharmony.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sofac.fxmharmony.Constants;
import com.sofac.fxmharmony.data.dto.base.ServerRequest;
import com.sofac.fxmharmony.data.dto.base.ServerResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestResponseService {


    @POST("app-exchange")
    Call<ResponseBody> postAuthorizationRequest(@Body ServerRequest serverRequest);

    @POST("group-exchange")
    Call<ResponseBody> postGroupRequest(@Body ServerRequest serverRequest);

    /******** Helper class that sets up a new services *******/
    class Creator {

        public static RequestResponseService newAuthorizationService() {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
            return retrofit.create(RequestResponseService.class);
        }
    }
}
