package com.example.rpncalculator.model

data class CalculatorState(
    val stack: List<Double> = emptyList(),
    val error: String? = null
) 