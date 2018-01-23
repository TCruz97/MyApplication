package mypackage.turner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    private lateinit var pMessage:TextView
    private lateinit var catButton:Button
    private lateinit var addButton:Button
    private  var a:Int = 0
    private  var b:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setupUI()


        catButton?.setOnClickListener {
            Log.d("BSU", "concat  button was tapped")


            val firstEditText:EditText = findViewById(R.id.editText)
            val secondEditText:EditText = findViewById(R.id.editText2)


            pMessage.text = "${firstEditText.text } ${secondEditText.text}"//+ secondEditText.text // sets dynamic

        }



        addButton?.setOnClickListener {
            Log.d("BSU", "add button was tapped")

            val firstEditText:EditText  = findViewById(R.id.editText)
            val secondEditText:EditText = findViewById(R.id.editText2)

             a = Integer.parseInt(firstEditText.getText().toString())
             b = Integer.parseInt(secondEditText.getText().toString())

            val sum: Int = a + b
            pMessage.text = "$sum"


        }
    }

    private fun setupUI(){
        pMessage = findViewById(R.id.helloworld_textview)
        catButton = findViewById(R.id.button1)
        addButton = findViewById(R.id.button2)
    }
}




