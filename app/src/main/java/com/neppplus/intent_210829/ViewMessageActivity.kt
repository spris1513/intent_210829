package com.neppplus.intent_210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        화면에 들어올 때 첨부된 데이터를 꺼내서 → 변수에 저장

        val receivedMessage = intent.getStringExtra("inputMessage")

//        messageTxt의 text 속성에 → 저장해 둔 내용을 대입 (UI-set)
        messageTxt.text = receivedMessage

//        첨부된 숫자 꺼내서 저장 → 숫자를 꺼낼때는, 첨부된게 없으면 넣어줄 기본값 작성
        val num = intent.getIntExtra("number", 0)

        numberTxt.text = num.toString()

    }
}