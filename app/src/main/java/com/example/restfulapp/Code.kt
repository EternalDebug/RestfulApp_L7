package com.example.restfulapp

import androidx.lifecycle.LiveData
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Update

class CodeOfHTTP (var urlpath: String)

@Entity(tableName = "Errors")
data class HttpErrCode(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "code") val urlpath: String?,
    @ColumnInfo(name = "name") val errName: String?
)

@Dao
interface HttpErrDao {
    @Query("SELECT * FROM Errors ORDER BY id ASC")
    fun getAll(): LiveData<List<HttpErrCode>>

    @Insert(entity = HttpErrCode::class)
    suspend fun insert(act: HttpErrCode)

    @Update
    suspend fun update(act: HttpErrCode)

    @Delete
    suspend fun delete(act: HttpErrCode)
}