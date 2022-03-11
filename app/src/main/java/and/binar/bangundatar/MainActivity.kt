package and.binar.bangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button_persegiPanjang : Button
    lateinit var button_persegi : Button
    lateinit var button_segitiga : Button
    lateinit var button_jajarGenjang : Button
    lateinit var button_belahKetupat : Button
    lateinit var button_trapesium : Button
    lateinit var button_lingkaran : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_persegiPanjang = findViewById(R.id.button_persegiPanjang)

        button_persegiPanjang.setOnClickListener {
            var intent: Intent = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }

        button_persegi = findViewById(R.id.button_persegi)

        button_persegi.setOnClickListener {
            var intent: Intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }

        button_segitiga = findViewById(R.id.button_segitiga)

        button_segitiga.setOnClickListener {
            var intent: Intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }

        button_jajarGenjang = findViewById(R.id.button_jajarGenjang)

        button_jajarGenjang.setOnClickListener {
            var intent: Intent = Intent(this, JajarGenjangActivity::class.java)
            startActivity(intent)
        }

        button_belahKetupat = findViewById(R.id.button_belahKetupat)

        button_belahKetupat.setOnClickListener {
            var intent: Intent = Intent(this, BelahKetupatActivity::class.java)
            startActivity(intent)
        }

        button_trapesium = findViewById(R.id.button_trapesium)

        button_trapesium.setOnClickListener {
            var intent: Intent = Intent(this, TrapesiumActivity::class.java)
            startActivity(intent)
        }

        button_lingkaran = findViewById(R.id.button_lingkaran)

        button_lingkaran.setOnClickListener {
            var intent: Intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }
    }
}