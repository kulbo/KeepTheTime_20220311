package kr.co.smartsoft.keepthetime_20220311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.smartsoft.keepthetime_20220311.api.APIList
import kr.co.smartsoft.keepthetime_20220311.api.ServerAPI
import kr.co.smartsoft.keepthetime_20220311.databinding.ActivitySignInBinding
import kr.co.smartsoft.keepthetime_20220311.datas.BasicResponse
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SignInActivity : BaseActivity() {
    lateinit var binding:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        setupEvents()
        setValues()

    }
    override fun setupEvents() {
//        val retrofit = ServerAPI.getRetrofit()
//        val apiList = retrofit.create(APIList::class.java)
//
//        apiList.postRequestLogin("아이디", "aa")
        val inputEmail = binding.edtId.text.toString()
        val inputPassword = binding.edtPassword.text.toString()

        apiList.postRequestLogin(inputEmail, inputPassword).enqueue(object : Callback<BasicResponse>{
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
                Log.d("응답확인", response.message())

//                Retrofit 라이브러리의 response는 성공/실패 여부에 따라 다른 본문을 봐야함.
//                성공인지? code == 200 ?
                if(response.isSuccessful) {
//                    모든 결과가 최종 성공인 경우
                } else {

                }
            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {

            }

        })
    }

    override fun setValues() {

    }

}