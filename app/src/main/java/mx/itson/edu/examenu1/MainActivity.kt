package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textoC: EditText = findViewById(R.id.etC)
        val textoF: EditText = findViewById(R.id.etF)
        val textoK: EditText = findViewById(R.id.etK)

        val convertirC: Button = findViewById(R.id.btnGC)
        val convertirF: Button = findViewById(R.id.btnGF)
        val convertirK: Button = findViewById(R.id.btnGK)

        var gradosC: Double = 0.0
        var gradosF: Double = 0.0
        var gradosK: Double = 0.0

        convertirC.setOnClickListener {
            if(!textoF.text.toString().isEmpty()){
                gradosF = textoF.text.toString().toDouble()
                gradosC = (gradosF-32)/1.8
                textoC.setText(gradosC.toString())
                textoF.setText("")
                textoK.setText("")
            }

            if(!textoK.text.toString().isEmpty()) {
                gradosK = textoK.text.toString().toDouble()
                gradosC = (gradosK - 273.15)
                textoC.setText(gradosC.toString())
                textoF.setText("")
                textoK.setText("")
            }
        }

        convertirF.setOnClickListener {
            if(!textoC.text.toString().isEmpty()){
                gradosC = textoC.text.toString().toDouble()
                gradosF = (gradosC*1.8)+32
                textoF.setText(gradosF.toString())
                textoC.setText("")
                textoK.setText("")
            }

            if(!textoK.text.toString().isEmpty()) {
                gradosK = textoK.text.toString().toDouble()
                gradosF = ((9*(gradosK-273.15))/5)+32
                textoF.setText(gradosF.toString())
                textoC.setText("")
                textoK.setText("")
            }
        }

        convertirK.setOnClickListener {
            if(!textoF.text.toString().isEmpty()){
                gradosF = textoF.text.toString().toDouble()
                gradosK = (5*(gradosF-32)/9)+273.15
                textoK.setText(gradosK.toString())
                textoC.setText("")
                textoF.setText("")
            }

            if(!textoC.text.toString().isEmpty()) {
                gradosC = textoC.text.toString().toDouble()
                gradosK = (gradosC+273.15)
                textoK.setText(gradosK.toString())
                textoF.setText("")
                textoC.setText("")
            }
        }



    }
}