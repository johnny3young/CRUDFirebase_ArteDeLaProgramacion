package com.ejemplo.app.crudfirebase_artedelaprogramacion

import android.support.v7.app.AppCompatActivity
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
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item != null) {
            when (item.itemId) {
                R.id.icon_add -> {
                    Toast.makeText(this, "Agregando", Toast.LENGTH_SHORT).show()
                }
                R.id.icon_save -> {
                    Toast.makeText(this, "Guardando", Toast.LENGTH_SHORT).show()
                }
                R.id.icon_delete -> {
                    Toast.makeText(this, "Borrando", Toast.LENGTH_SHORT).show()
                }
            }
        }
        return true
    }

}
