package com.example.counter

// Model
data class CounterModel(
    var count:Int
)


// Repository - behavior
class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCount(){
        _counter.count++
    }

    fun  decrementCount(){
        _counter.count--
    }
}