package com.example.calculator

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import net.objecthunter.exp4j.ExpressionBuilder
class CalculatorLogic(
    private val tvResult: TextView
) {

    private var resultString: String = String()
    @SuppressLint("SuspiciousIndentation")
    fun addSymbolToEquation(symbol: String) {
        if(resultString == "0") {
            resultString = symbol
        }
        else
        resultString += symbol




        tvResult.text = resultString
    }

    fun removeLastSymbolFromString() {
        if (resultString.isNotEmpty()) {
            if(resultString.length == 1)
                clearResultString()
            else {
                resultString = resultString.substring(0, resultString.length - 1)
            }

            tvResult.text = resultString
        }
    }
    fun clearResultString(){
        resultString = "0"
        tvResult.text = resultString
    }

    fun isResultValid() : Boolean{
        return resultString[resultString.length-1].isDigit()
    }

    private fun evaluateExpression(): Double? {

        return try {
            val expression = ExpressionBuilder(resultString).build()
            expression.evaluate()
        } catch (e: Exception) {
            null // Return null in case of an error
        }
    }

    fun displayResult() {
        val result = evaluateExpression()
        if (result != null) {
            tvResult.text = result.toString()
            resultString = tvResult.text.toString()
        } else {
            tvResult.text = "Error"
        }
    }
}