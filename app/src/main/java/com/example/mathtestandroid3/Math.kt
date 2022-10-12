package com.example.mathtestandroid3

class Math {
    fun add(firstNumber: String, secondNumber: String): String {
        var result = ""
        val letters = Regex("[^A-Za-z]")
        val double = Regex("[^0-9.9]")
        val symbols = Regex("[!\"#$%&'(),:;<=>?@^_`{|}~]")

        if (!firstNumber.contains(letters) || !secondNumber.contains(letters)) {
            result = "Символы нельзя вводить"
        } else if (firstNumber.contains(symbols) || secondNumber.contains(symbols)) {
            result = "Символы нельзя вводить"
        } else if (!firstNumber.contains(double) || !secondNumber.contains(double)) {
            val double1 = firstNumber.trim().toDouble()
            val double2 = secondNumber.trim().toDouble()
            val doubleResult = (double1 + double2).toInt()
            result = doubleResult.toString()
        } else {
            val num1 = firstNumber.trim().toInt()
            val num2 = secondNumber.trim().toInt()
            result = (num1 + num2).toString()
        }
        return result
    }

    fun divide(firstNumber: String, secondNumber: String): String {
        var result = ""
        val letters = Regex("[^A-Za-z]")
        val symbols = Regex("[!\"#$%&'(),:;<=>?@^_`{|}~]")

        if (!firstNumber.contains(letters) || !secondNumber.contains(letters)) {
            result = "Символы нельзя вводить"
        } else if (firstNumber.contains(symbols) || secondNumber.contains(symbols)) {
            result = "Символы нельзя вводить"
        } else if (secondNumber.equals("0")) {
            result = "На ноль делить нельзя!"
        } else {
            val num1 = firstNumber.trim().toInt()
            val num2 = secondNumber.trim().toInt()
            result = (num1 / num2).toString()
        }
        return result
    }

}