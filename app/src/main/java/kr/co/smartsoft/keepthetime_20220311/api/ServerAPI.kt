package kr.co.smartsoft.keepthetime_20220311.api

import retrofit2.Retrofit

class ServerAPI {
//    Retrofit 클래스 객체화 함수 => 단일 객체만 만들어서 모든 화면에서 공유
//    여러개의 객체를 만들
    companion object {
//        서버통신담당 클래스 : 레트로핏 클래스 객체를 담을 변수
//      아직 안만들었다.
        private var retrofit : Retrofit? = null

        fun getRetrofit() : Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .build()
            }

            return retrofit!!
        }
    }
}