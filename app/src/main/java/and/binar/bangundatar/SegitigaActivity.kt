package and.binar.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SegitigaActivity : AppCompatActivity() {
    lateinit var ed_alas : EditText
    lateinit var ed_tinggi : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        ed_alas = findViewById(R.id.ed_alas)
        ed_tinggi = findViewById(R.id.ed_tinggi)
        tv_hasil = findViewById(R.id.tv_hasil)
        button_hitung = findViewById(R.id.button_hitung)

        button_hitung.setOnClickListener {
            var alas : Int = Integer.parseInt(ed_alas.text.toString())
            var tinggi : Int = Integer.parseInt(ed_tinggi.text.toString())
            var luas : Int = (alas*tinggi)/2
            tv_hasil.text = luas.toString()
        }
    }
}