package com.example.crud_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.room.Room
import com.example.crud_room.databinding.ActivityMainBinding
import com.example.crud_room.model.AppBDD
import com.example.crud_room.model.BDDAplication
import com.example.crud_room.model.User
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.btnInsertar.setOnClickListener {
            val user = User(name = "John Doe", age = 30)

            try {
                BDDAplication.bdd.userDao().insert(user)
            }catch (e:Exception){
                Log.i("BDD",e.message.toString())
            }
        }


       // bdd.userDao().insert(User(name="Carlos",age=30))
        //val allUsers=bdd.userDao().getAllUsers()
        /*for (user:User in allUsers){
            Toast.makeText(this, user.name + " " + user.age.toString(),Toast.LENGTH_LONG ).show()
        }*/
    }
}