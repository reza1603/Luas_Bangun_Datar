package and.binar.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LingkaranActivity : AppCompatActivity() {

    lateinit var ed_r : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        ed_r = findViewById(R.id.ed_r)
        tv_hasil = findViewById(R.id.tv_hasil)
        button_hitung = findViewById(R.id.button_hitung)

        button_hitung.setOnClickListener {
            var r : Int = Integer.parseInt(ed_r.text.toString())
            var luas : Double = 3.14*(r*r)
            tv_hasil.text = luas.toString()
        }
    }
}