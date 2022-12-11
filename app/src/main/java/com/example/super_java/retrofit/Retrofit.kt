package com.example.super_java.retrofit

import java.lang.reflect.Proxy

class Retrofit {

    fun <T> create(service: Class<T>): T {

        val obj = Proxy.newProxyInstance(service.classLoader, arrayOf(service)) { proxy, method, args ->

            loadServiceMethod()
        }

        return obj as T
    }

    fun loadServiceMethod() {
        var a = 0
        val string: String = "1232432"
        val b = a++
    }

}
