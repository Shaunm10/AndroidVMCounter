package com.example.counter
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class CounterViewModel: ViewModel() {
    // _ is a kotlin private variable convention
    private val _count = mutableStateOf(0)

    // public members
    val count: MutableState<Int> = _count

    fun increment(){
        this._count.value++
    }
    fun decrement(){
        this._count.value--
    }
}