package com.example.super_java.retrofit

interface Service {

    @Get("/user/info")
    fun getUserInfo(@Query("id") id: String)

    @Post("/user/id")
    fun postUserInfo(@Feild("id") id: String, @Feild("name") name: String,
                     @Feild("age") age: Int)
}