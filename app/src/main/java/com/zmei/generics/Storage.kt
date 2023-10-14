package com.zmei.generics

interface Storage<T>{
    fun get():T
    fun add(item : T)

}