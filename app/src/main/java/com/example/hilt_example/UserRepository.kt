package com.example.hilt_example

import android.util.Log
import javax.inject.Inject

const val TAG = "KotlinKing"

interface UserRepository{
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password:String){
        Log.d(TAG, "User saved in db")
    }
}
class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password:String){
        Log.d(TAG, "User saved in Firebase")
    }
}

