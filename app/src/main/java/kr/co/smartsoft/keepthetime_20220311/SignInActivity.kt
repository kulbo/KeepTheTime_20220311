package kr.co.smartsoft.keepthetime_20220311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.smartsoft.keepthetime_20220311.api.APIList
import kr.co.smartsoft.keepthetime_20220311.api.ServerAPI
import kr.co.smartsoft.keepthetime_20220311.databinding.ActivitySignInBinding
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

        apiList.postRequestLogin(inputEmail, inputPassword).enqueue(object : Callback<JSONObject>{
            override fun onResponse(call: Call<JSONObject>, response: Response<JSONObject>) {
                Log.d("응답확인", response.message())

            }

            override fun onFailure(call: Call<JSONObject>, t: Throwable) {

            }

        })
    }

    override fun setValues() {

    }

}