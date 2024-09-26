package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val tvResultText : TextView = findViewById(R.id.tvResultText)
            val btnOne : Button = findViewById(R.id.btnOne)
            val btnTwo : Button = findViewById(R.id.btnTwo)
            val btnThree : Button = findViewById(R.id.btnThree)
            val btnFour: Button = findViewById(R.id.btnFour)
            val btnFive: Button = findViewById(R.id.btnFive)
            val btnSix: Button = findViewById(R.id.btnSix)
            val btnSeven: Button = findViewById(R.id.btnSeven)
            val btnEight: Button = findViewById(R.id.btnEight)
            val btnNine: Button = findViewById(R.id.btnNine)
            val btnZero: Button = findViewById(R.id.btnZero)
            val btnPlus: Button = findViewById(R.id.btnPlus)
            val btnMinus: Button = findViewById(R.id.btnMinus)
            val btnMultiply: Button = findViewById(R.id.btnMultiply)
            val btnDivide: Button = findViewById(R.id.btnDivide)
            val btnLeftParenthesis: Button = findViewById(R.id.btnLeftParenthesis)
            val btnRightParenthesis: Button = findViewById(R.id.btnRightParenthesis)
            val btnDot: Button = findViewById(R.id.btnDot)
            val btnBackspace: Button = findViewById(R.id.btnBackspace)
            val btnClear: Button = findViewById(R.id.btnClear)
            val btnEquals: Button = findViewById(R.id.btnEquals)
            val calculatorLogic = CalculatorLogic(tvResultText)

            btnOne.setOnClickListener{
                calculatorLogic.addSymbolToEquation("1")
            }
            btnTwo.setOnClickListener{
                calculatorLogic.addSymbolToEquation("2")
            }
            btnThree.setOnClickListener{
                calculatorLogic.addSymbolToEquation("3")
            }
            btnFour.setOnClickListener{
                calculatorLogic.addSymbolToEquation("4")
            }
            btnFive.setOnClickListener{
                calculatorLogic.addSymbolToEquation("5")
            }
            btnSix.setOnClickListener{
                calculatorLogic.addSymbolToEquation("6")
            }
            btnSeven.setOnClickListener{
                calculatorLogic.addSymbolToEquation("7")
            }
            btnEight.setOnClickListener{
                calculatorLogic.addSymbolToEquation("8")
            }
            btnNine.setOnClickListener{
                calculatorLogic.addSymbolToEquation("9")
            }
            btnZero.setOnClickListener{
                calculatorLogic.addSymbolToEquation("0")
            }
            btnPlus.setOnClickListener{
                calculatorLogic.addSymbolToEquation("+")
            }
            btnMinus.setOnClickListener{
                calculatorLogic.addSymbolToEquation("-")
            }
            btnMultiply.setOnClickListener{
                calculatorLogic.addSymbolToEquation("*")
            }
            btnDivide.setOnClickListener{
                calculatorLogic.addSymbolToEquation("/")
            }
            btnLeftParenthesis.setOnClickListener{
                calculatorLogic.addSymbolToEquation("(")
            }
            btnRightParenthesis.setOnClickListener{
                calculatorLogic.addSymbolToEquation(")")
            }
            btnDot.setOnClickListener {
                calculatorLogic.addSymbolToEquation(".")
            }

            btnBackspace.setOnClickListener{
                calculatorLogic.removeLastSymbolFromString()
            }
            btnClear.setOnClickListener{
                calculatorLogic.clearResultString()
            }

            btnEquals.setOnClickListener{
                if(calculatorLogic.isResultValid())
                calculatorLogic.displayResult()
            }




        }
}