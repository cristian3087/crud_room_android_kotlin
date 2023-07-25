package com.example.crud_room.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.crud_room.dao.UserDAO

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class AppBDD:RoomDatabase() {
    abstract fun userDao():UserDAO
}