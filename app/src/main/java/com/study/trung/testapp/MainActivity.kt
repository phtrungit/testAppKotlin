package com.study.trung.testapp

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : Activity() {
    var so1:Int =0
    var so2:Int =0
    var Kq:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCong.setOnClickListener(HandleClick())
        btnTru.setOnClickListener(HandleClick())
        btnNhan.setOnClickListener(HandleClick())
        btnChia.setOnClickListener(HandleClick())

    }

    private inner class HandleClick:View.OnClickListener {
        private var flag_div0: Boolean=false

        override fun onClick(arg0:View) {
            so1=txtso1.text.toString().toInt()
            so2=txtso2.text.toString().toInt()
          if(arg0==btnCong)
          {
              Kq =so1+so2
          }
            else if (arg0==btnTru)
          {
              Kq =so1-so2
          }
          else if (arg0==btnNhan)
          {
              Kq =so1*so2
          }
          else if (arg0==btnChia)
          {
              if(so2==0)
                  flag_div0=true
              else
                Kq =so1/so2

          }
            if (flag_div0==true)
                txtKetQua.setText("Lỗi không thể chia cho 0")
            else
                txtKetQua.setText(Kq.toString())
        }
    }

}
