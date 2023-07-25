package com.example.crud_room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class User (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val age: Int
    )