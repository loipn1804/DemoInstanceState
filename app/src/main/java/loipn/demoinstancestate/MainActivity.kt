package loipn.demoinstancestate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = savedInstanceState?.getInt("count") ?: 0

        Log.d("loipnnn", "${this.javaClass.simpleName} onCreate count $count")

        btn1.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("loipnnn", "${this.javaClass.simpleName} onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("loipnnn", "${this.javaClass.simpleName} onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val count = savedInstanceState.getInt("count")
        Log.d("loipnnn", "${this.javaClass.simpleName} onRestoreInstanceState count $count")
    }

    override fun onResume() {
        super.onResume()
        Log.d("loipnnn", "${this.javaClass.simpleName} onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("loipnnn", "${this.javaClass.simpleName} onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        count++
        outState.putInt("count", count)
        Log.d("loipnnn", "${this.javaClass.simpleName} onSaveInstanceState count $count")
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
