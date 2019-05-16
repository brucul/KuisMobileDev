package com.brucul.bis.api;

import com.brucul.bis.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApi {
    @FormUrlEncoded
    @POST("insert.php")
    Call<ResponseModel> sendBiodata(@Field("kode") String nama,
                                    @Field("nama") String usia,
                                    @Field("trayek") String domisili);

    @GET("read.php")
    Call<ResponseModel> getBiodata();
}
