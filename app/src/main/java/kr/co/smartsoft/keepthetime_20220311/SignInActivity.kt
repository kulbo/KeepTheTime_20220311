package kr.co.smartsoft.keepthetime_20220311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.smartsoft.keepthetime_20220311.databinding.ActivitySignInBinding


class SignInActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }
}