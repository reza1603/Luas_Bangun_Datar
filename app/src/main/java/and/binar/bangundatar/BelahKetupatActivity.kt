package and.binar.bangundatar

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BelahKetupatActivity : AppCompatActivity() {
    lateinit var ed_d1 : EditText
    lateinit var ed_d2 : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belah_ketupat)

        button_hitung = findViewById(R.id.button_hitung)
        ed_d1 = findViewById(R.id.ed_d1)
        ed_d2 = findViewById(R.id.ed_d2)
        tv_hasil = findViewById(R.id.tv_hasil)

        button_hitung.setOnClickListener {
            var d1 : Int = Integer.parseInt(ed_d1.text.toString())
            var d2 : Int = Integer.parseInt(ed_d2.text.toString())
            var luas : Int = (d1*d2)/2
            tv_hasil.text = luas.toString()
        }
    }
}