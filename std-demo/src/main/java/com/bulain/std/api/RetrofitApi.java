package com.bulain.std.api;

import com.bulain.std.pojo.RetrofitReq;
import com.bulain.std.pojo.RetrofitResp;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.swagger.annotations.ApiOperation;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface RetrofitApi {

    @POST("/postUser")
    @ApiOperation(httpMethod = "POST", value = "/postUser")
    Call<RetrofitResp> postUser(@Body RetrofitReq req);

    @PUT("/putUser")
    @ApiOperation(httpMethod = "PUT", value = "/putUser")
    Observable<RetrofitResp> putUser(@Body RetrofitReq req);

    @DELETE("/delUser")
    @ApiOperation(httpMethod = "DELETE", value = "/delUser")
    Flowable<RetrofitResp> delUser(@Body RetrofitReq req);

}
