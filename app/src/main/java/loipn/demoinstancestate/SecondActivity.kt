package loipn.demoinstancestate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Copyright (c) 2020, loiphan. All rights reserved.
 *
 * @author loiphan <loipn1804@gmail.com>
 * @since February 07, 2020
 * @version 1.0
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        Log.d("loipnnn", "${this.javaClass.simpleName} onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("loipnnn", "${this.javaClass.simpleName} onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("loipnnn", "${this.javaClass.simpleName} onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("loipnnn", "${this.javaClass.simpleName} onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("loipnnn", "${this.javaClass.simpleName} onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("loipnnn", "${this.javaClass.simpleName} onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("loipnnn", "${this.javaClass.simpleName} onDestroy")
    }
}