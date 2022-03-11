package kr.co.smartsoft.keepthetime_20220311.api

import kr.co.smartsoft.keepthetime_20220311.datas.BasicResponse
import retrofit2.Call
import org.json.JSONObject
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIList {
//    BASE_URL에 해당하는 서버네서 어떤 기능

    @FormUrlEncoded
    @POST("/user")
    fun postRequestLogin(
        @Field("email") email:String,
        @Field("password") pw:String
    )  : Call<BasicResponse>    // 서버가 주는 응답을 (성공시에) BasicResponse

    @FormUrlEncoded
    @POST("/user")
    fun putRequestSignUp(
        @Field("email") email: String,
        @Field("password") pw: String,
        @Field("nick_name") nick : String,
    ) : Call<BasicResponse>

}