package com.example.rpncalculator.ui.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.rpncalculator.model.CalculatorState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CalculatorViewModel : ViewModel() {

    private val _state = MutableStateFlow(CalculatorState())
    val state = _state.asStateFlow()

    var input by mutableStateOf("")
        private set

    fun onInputChange(newInput: String) {
        input = newInput
        if (newInput.isNotBlank()) {
            processInput(newInput.trim())
        } else {
            clearStack()
        }
    }

    fun clearInput() {
        input = ""
        clearStack()
    }

    private fun clearStack() {
        _state.update { CalculatorState() }
    }

    private fun processInput(input: String) {
        try {
            _state.update { CalculatorState() } // Clear the stack before processing
            val stack = mutableListOf<Double>()

            input.split("\\s+".toRegex()).forEach { token ->
                when (token) {
                    "+", "-", "*", "/" -> {
                        if (stack.size < 2) {
                            _state.update { it.copy(error = "Not enough operands") }
                            return
                        }
                        val b = stack[stack.lastIndex]
                        val a = stack[stack.lastIndex - 1]
                        repeat(2) { stack.removeAt(stack.lastIndex) }

                        val result = when (token) {
                            "+" -> a + b
                            "-" -> a - b
                            "*" -> a * b
                            "/" -> {
                                if (b == 0.0) {
                                    _state.update { it.copy(error = "Division by zero") }
                                    return
                                }
                                a / b
                            }

                            else -> throw IllegalArgumentException("Unknown operator")
                        }
                        stack.add(result)
                    }

                    else -> {
                        try {
                            stack.add(token.toDouble())
                        } catch (e: NumberFormatException) {
                            _state.update { it.copy(error = "Invalid input: $token") }
                            return
                        }
                    }
                }
            }
            _state.update { it.copy(stack = stack, error = null) }
        } catch (e: Exception) {
            _state.update { it.copy(error = "Invalid expression") }
        }
    }
} 