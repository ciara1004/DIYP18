package ie.wit.diyp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ie.wit.diyp.R
import ie.wit.diyp.main.DIYPApp
import kotlinx.android.synthetic.main.content_default_bar.*

class Grill : AppCompatActivity() {
    lateinit var app: DIYPApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_grill)
        setSupportActionBar(toolbar)
    }
}