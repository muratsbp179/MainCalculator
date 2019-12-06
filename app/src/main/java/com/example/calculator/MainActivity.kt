package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result: Int = 0

        getSupportActionBar()!!.hide()

        //Nums
        val n0: Button = findViewById(R.id.zero)
        val n1: Button = findViewById(R.id.one)
        val n2: Button = findViewById(R.id.two)
        val n3: Button = findViewById(R.id.three)
        val n4: Button = findViewById(R.id.four)
        val n5: Button = findViewById(R.id.five)
        val n6: Button = findViewById(R.id.six)
        val n7: Button = findViewById(R.id.seven)
        val n8: Button = findViewById(R.id.eight)
        val n9: Button = findViewById(R.id.nine)

        //Operators
        val clear: Button = findViewById(R.id.clear)
        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val multiply: Button = findViewById(R.id.multiply)
        val division: Button = findViewById(R.id.division)
        val equals: Button = findViewById(R.id.equals)

        fun screen_crear(){
            textView.text = ""
            result = 0
        }

        screen_crear()


        fun write(str: String) {
            var expression: String = textView.text.toString()
            expression = expression + str
            textView.text = expression
        }

        n0.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("0")
            }
        })
        n1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("1")
            }
        })
        n2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("2")
            }
        })
        n3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("3")
            }
        })
        n4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("4")
            }
        })
        n5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("5")
            }
        })
        n6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("6")
            }
        })
        n7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("7")
            }
        })
        n8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("8")
            }
        })
        n9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("9")
            }
        })



        plus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("+")
            }
        })
        minus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("-")
            }
        })
        multiply.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("*")
            }
        })
        division.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                write("/")
            }
        })

        clear.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                screen_crear()
            }
        })

        equals.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var ans: String = textView.text.toString()
                var e = Expression(ans)
                textView.text = e.calculate().toString()

            }
        })


    }
}
