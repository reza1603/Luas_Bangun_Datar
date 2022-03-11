package and.binar.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TrapesiumActivity : AppCompatActivity() {
    lateinit var ed_sisiA : EditText
    lateinit var ed_sisiB : EditText
    lateinit var ed_tinggi : EditText
    lateinit var tv_hasil : TextView
    lateinit var button_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium)

        button_hitung = findViewById(R.id.button_hitung)
        ed_sisiA = findViewById(R.id.ed_sisiA)
        ed_sisiB = findViewById(R.id.ed_sisiB)
        ed_tinggi = findViewById(R.id.ed_tinggi)
        tv_hasil = findViewById(R.id.tv_hasil)

        button_hitung.setOnClickListener {
            var sisiA : Int = Integer.parseInt(ed_sisiA.text.toString())
            var sisiB : Int = Integer.parseInt(ed_sisiB.text.toString())
            var tinggi : Int = Integer.parseInt(ed_tinggi.text.toString())
            var luas : Int = (tinggi*(sisiA+sisiB))/2
            tv_hasil.text = luas.toString()

        }
    }
}