package com.example.tugas2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_menu1 -> {
                Toast.makeText(this, "Menu satu di klik", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_menu2 -> {
                Toast.makeText(this, "Menu dua di klik", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> {super.onOptionsItemSelected(item)}
        }
    }

}