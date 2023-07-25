package com.example.crud_room.model
import android.app.Application
import androidx.room.Room

class BDDAplication:Application() {
    companion object{
        lateinit var bdd:AppBDD
    }

    override fun onCreate() {
        super.onCreate()
        bdd= Room.databaseBuilder(
            this,
            AppBDD::class.java,
            "bdd_users"
        ).build()
    }
}