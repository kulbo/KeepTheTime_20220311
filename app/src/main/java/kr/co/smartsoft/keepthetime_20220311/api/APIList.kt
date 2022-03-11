package kr.co.smartsoft.keepthetime_20220311.api

import okhttp3.Call
import org.json.JSONObject
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.lang.reflect.InvocationHandler

interface APIList {
//    BASE_URL에 해당하는 서버네서 어떤 기능

    @FormUrlEncoded
    @POST("/user")
    fun postRequestLogin(
        @Field("email") email:String,
        @Field("password") pw:String
    ) // : Call<JSONObject>
}