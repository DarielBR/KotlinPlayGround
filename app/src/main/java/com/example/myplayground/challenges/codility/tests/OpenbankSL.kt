package com.example.myplayground.challenges.codility.tests

inline fun simple(x: Int): Int{return x*x}

/*
fun getUserName(userId: Int): String{
    val userDao = UserDao()
    val user = userDao.getUserById(userId)
    return user.name
}

class Repository (
    val apiRetrofit: ApiRetrofit,
    val bdRoom: DbRoom
        ){
    fun fetchData(): Result{
        val localRsult = bdRoom.fetchData()
        return if(localRsult != null){
            localRsult
        }else {
            apiRetrofit.fetchData().also {
                bdRoom.saveData(remoteResult)
            }
        }
    }
}*/
