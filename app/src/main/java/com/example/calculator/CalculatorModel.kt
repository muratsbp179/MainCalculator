package com.example.calculator

class CalculatorModel {
    private var firstArg :Int = 0
    private var secondArg :Int = 0

    private enum class State {firstArgInput, SecondArgInput, resultShow}

    private lateinit var state :State

    lateinit var str :StringBuilder

    constructor(){
        state = State.firstArgInput
    }
}