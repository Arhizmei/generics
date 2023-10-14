package com.zmei.generics

class Case<T, B>(var item : T, var item2 :B): Storage<T> {
    override fun get(): T {
        return item
    }
fun get2(): B{
    return item2
}
    override fun add(item : T) {
        this.item = item
    }
}