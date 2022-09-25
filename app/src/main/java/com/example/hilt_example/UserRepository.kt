package com.example.hilt_example

import javax.inject.Inject

const val TAG = "KotlinKing"

class UserRepository @Inject constructor(val loggerService: LoggerService) {
    fun saveUser(email: String, password:String){
        loggerService.log("User saved in db")
    }
}