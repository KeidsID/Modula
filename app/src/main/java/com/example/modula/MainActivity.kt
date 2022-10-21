package com.example.modula

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import androidx.recyclerview.widget.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val rvModule: RecyclerView = findViewById(R.id.rv_module)
    val rvModuleAdapter = ListModuleAdapter(ModuleData.moduleList)
    val intent = Intent(this, DetailActivity::class.java)

    rvModule.setHasFixedSize(true)
    rvModule.adapter = rvModuleAdapter

    rvModuleAdapter.setOnTap(object : ListModuleAdapter.OnTap {
      override fun onTap(data: Module) {
        intent.putExtra(DetailActivity.EXTRA_MODULE, data)
        startActivity(intent)
      }
    })

    if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
      rvModule.layoutManager = GridLayoutManager(this, 2)
    } else {
      rvModule.layoutManager = GridLayoutManager(this, 1)
    }
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)
    return super.onCreateOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when (item.itemId) {
      R.id.action_about_dev -> {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
      }
    }
    return super.onOptionsItemSelected(item)
  }
}