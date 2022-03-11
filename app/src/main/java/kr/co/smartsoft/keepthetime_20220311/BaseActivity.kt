package kr.co.smartsoft.keepthetime_20220311

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kr.co.smartsoft.keepthetime_20220311.api.APIList
import kr.co.smartsoft.keepthetime_20220311.api.ServerAPI

abstract class BaseActivity : AppCompatActivity() {
    lateinit var mContext:Context
    lateinit var apiList:APIList
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mContext = this

        val retrofit = ServerAPI.getRetrofit()

        apiList = retrofit.create(APIList::class.java)
    }

    abstract fun setupEvents()
    abstract fun setValues()

}