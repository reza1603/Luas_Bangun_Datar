package and.binar.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiActivity : AppCompatActivity() {
    lateinit var ed_sisi : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        button_hitung = findViewById(R.id.button_hitung)
        tv_hasil = findViewById(R.id.tv_hasil)
        ed_sisi = findViewById(R.id.ed_sisi)

        button_hitung.setOnClickListener {
            var sisi : Int = Integer.parseInt(ed_sisi.text.toString())
            var luas : Int = sisi*sisi
            tv_hasil.text = luas.toString()

        }
    }
}