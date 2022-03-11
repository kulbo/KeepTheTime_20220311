package kr.co.smartsoft.keepthetime_20220311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.smartsoft.keepthetime_20220311.api.APIList
import kr.co.smartsoft.keepthetime_20220311.api.ServerAPI
import kr.co.smartsoft.keepthetime_20220311.databinding.ActivitySignInBinding


class SignInActivity : BaseActivity() {
    lateinit var binding:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        setupEvents()
        setValues()

    }
    override fun setupEvents() {
        val retrofit = ServerAPI.getRetrofit()
        val apiList = retrofit.create(APIList::class.java)

        apiList.postRequestLogin("아이디", "aa")
    }

    override fun setValues() {

    }

}