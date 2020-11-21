package com.atta.myapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @GET("get_products/{shop_id}/{category}")
    Call<ProductsResult> getProducts(
            @Path("category") String cat,
            @Path("shop_id") int shopId
    );




}
