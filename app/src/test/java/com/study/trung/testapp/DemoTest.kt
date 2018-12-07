package com.study.trung.testapp

import kotlinx.android.synthetic.main.activity_main.*
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.robolectric.Robolectric
import org.junit.Before
import org.junit.Test
import org.robolectric.RobolectricTestRunner
import org.junit.runner.RunWith


@RunWith(RobolectricTestRunner::class)
class DemoTest {
    private var mActivity: MainActivity? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        mActivity = Robolectric.buildActivity(MainActivity::class.java).create().get()
    }
    @Test
    @Throws(Exception::class)
    fun testClicking() {
        // Test thử chức năng 1 + 1 = 2;
        mActivity!!.txtso1.setText("1")
        mActivity!!.txtso2.setText("1")
        mActivity!!.btnCong.performClick()
        assertThat(mActivity!!.txtKetQua.getText().toString(), equalTo("2"))
    }
    @Test
    @Throws(Exception::class)
    fun chia0() {
        // Test thử chức năng 1 + 1 = 2;
        mActivity!!.txtso1.setText("1")
        mActivity!!.txtso2.setText("0")
        mActivity!!.btnChia.performClick()
        assertThat(mActivity!!.txtKetQua.getText().toString(), equalTo("Lỗi không thể chia cho 0"))
    }
}