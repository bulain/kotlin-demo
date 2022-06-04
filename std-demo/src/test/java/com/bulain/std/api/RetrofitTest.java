package com.bulain.std.api;

import com.bulain.std.pojo.RetrofitReq;
import com.bulain.std.pojo.RetrofitResp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.mock.BehaviorDelegate;
import retrofit2.mock.MockRetrofit;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RetrofitTest {

    private RetrofitApi retrofitApi;

    @BeforeEach
    public void setUp() {
        String baseurl = "http://127.0.0.1/";
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseurl)
                .build();
        //this.retrofitApi = retrofit.create(RetrofitApi.class);

        MockRetrofit mockRetrofit = new MockRetrofit.Builder(retrofit).build();
        BehaviorDelegate<RetrofitApi> delegate = mockRetrofit.create(RetrofitApi.class);
        this.retrofitApi = delegate.returningResponse(new RetrofitResp());

    }

    @Test
    public void testPostUser() throws IOException {

        RetrofitReq req = new RetrofitReq();
        Response<RetrofitResp> response = retrofitApi.postUser(req).execute();
        assertTrue(response.isSuccessful());
        assertNotNull(response.body());

    }

    @Test
    public void testPutUser() {

        RetrofitReq req = new RetrofitReq();
        RetrofitResp response = retrofitApi.putUser(req).blockingFirst();
        assertNotNull(response);

    }

    @Test
    public void testDelUser() {

        RetrofitReq req = new RetrofitReq();
        RetrofitResp response = retrofitApi.delUser(req).blockingFirst();
        assertNotNull(response);

    }

}