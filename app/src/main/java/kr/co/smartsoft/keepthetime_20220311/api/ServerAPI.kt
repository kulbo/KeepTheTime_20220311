package kr.co.smartsoft.keepthetime_20220311.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerAPI {
//    Retrofit 클래스 객체화 함수 => 단일 객체만 만들어서 모든 화면에서 공유
//    여러개의 객체를 만들
    companion object {
//        서버통신담당 클래스 : 레트로핏 클래스 객체를 담을 변수
//      아직 안만들었다.
        private var retrofit : Retrofit? = null
        private val BASE_URL = "https://keepthetime.xyz"

        fun getRetrofit() : Retrofit {

//            Retrofit 라이브러리는 클래스 차원에서 BASE_URL 을 설정할 수 있게 도와줌.
//

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)      // 어느 서버를 기
                    .addConverterFactory(GsonConverterFactory.create()) // gson 라이브러리와 결합
                    .build()
            }

            return retrofit!!
        }
    }
}