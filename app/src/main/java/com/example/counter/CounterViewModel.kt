package com.example.counter
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class CounterViewModel(): ViewModel() {

    private val  _repository: CounterRepository = CounterRepository()
    // _ is a kotlin private variable convention
    private val _count = mutableStateOf(_repository.getCounter().count)

    // public members
    val count: MutableState<Int> = _count

    fun increment(){
        _repository.incrementCount()
        _count.value = _repository.getCounter().count
    }
    fun decrement(){
        _repository.decrementCount()
        _count.value = _repository.getCounter().count
    //this._count.value--
    }
}