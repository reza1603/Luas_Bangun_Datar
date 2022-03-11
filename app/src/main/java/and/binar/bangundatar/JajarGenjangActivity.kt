package and.binar.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class JajarGenjangActivity : AppCompatActivity() {
    lateinit var ed_alas : EditText
    lateinit var ed_tinggi : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jajar_genjang)

        button_hitung = findViewById(R.id.button_hitung)
        tv_hasil = findViewById(R.id.tv_hasil)
        ed_tinggi = findViewById(R.id.ed_tinggi)
        ed_alas = findViewById(R.id.ed_alas)

        button_hitung.setOnClickListener {
            var alas : Int = Integer.parseInt(ed_alas.text.toString())
            var tinggi : Int = Integer.parseInt(ed_tinggi.text.toString())
            var luas : Int = alas*tinggi
            tv_hasil.text = luas.toString()
        }
    }
}