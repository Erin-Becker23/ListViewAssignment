package com.example.listviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var animalsList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalsList = findViewById(R.id.animal_list)

        val animals = arrayListOf<String>("Dog", "Cat", "Penguin", "Panda", "Owl", "Eagle", "Polar Bear", "Fox", "Opossum", "Rabbit", "Mouse",
                                          "Spider", "Fly", "Crocodile", "Fish", "Dolphin", "Wolf", "Jaguar", "Beetle", "Cow", "Sheep", "Pig")

        val animalViewAdapter: ArrayAdapter<String> = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, animals)

        animalsList.adapter = animalViewAdapter

        animalsList.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "You selected: " + animals[position], Toast.LENGTH_SHORT).show()
        }

    }
}
