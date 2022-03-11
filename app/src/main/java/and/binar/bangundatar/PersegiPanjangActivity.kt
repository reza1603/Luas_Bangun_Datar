package and.binar.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiPanjangActivity : AppCompatActivity() {
    lateinit var ed_panjang : EditText
    lateinit var ed_lebar : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        button_hitung = findViewById(R.id.button_hitung)
        tv_hasil = findViewById(R.id.tv_hasil)
        ed_panjang = findViewById(R.id.ed_panjang)
        ed_lebar = findViewById(R.id.ed_lebar)

        button_hitung.setOnClickListener {
            var panjang : Int = Integer.parseInt(ed_panjang.text.toString())
            var lebar : Int = Integer.parseInt(ed_lebar.text.toString())
            var luas : Int = panjang*lebar
            tv_hasil.text = luas.toString()
        }


    }
}