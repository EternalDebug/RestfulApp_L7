package com.example.restfulapp

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Database(entities = [HttpErrCode::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun actionDao(): HttpErrDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDataBase(context: Context): AppDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null)
                return tempInstance
            kotlin.synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "actions"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

class AppRepository(private val httpErrDao: HttpErrDao) {

    fun getAll(): LiveData<List<HttpErrCode>> {
        return httpErrDao.getAll()
    }
    suspend fun insert(act: HttpErrCode) {
        withContext(Dispatchers.IO) {
            httpErrDao.insert(act)
        }
    }

    suspend fun update(act: HttpErrCode) {
        withContext(Dispatchers.IO) {
            httpErrDao.update(act)
        }
    }
    suspend fun delete(act: HttpErrCode) {
        withContext(Dispatchers.IO) {
            httpErrDao.delete(act)
        }
    }


}