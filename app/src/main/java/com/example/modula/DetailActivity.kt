package com.example.modula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class DetailActivity : AppCompatActivity() {
  companion object {
    const val EXTRA_MODULE = "extra_module"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail)

    val imgModule: ImageView = findViewById(R.id.img_module)
    val tvCategory: TextView = findViewById(R.id.tv_category)
    val tvTitle: TextView = findViewById(R.id.tv_title)
    val tvArticle: TextView = findViewById(R.id.tv_article)
    val dataModule: Module = intent.getParcelableExtra(EXTRA_MODULE)!!

    imgModule.setImageResource(dataModule.image)
    tvCategory.text = dataModule.category
    tvTitle.text = dataModule.title
    tvArticle.text = dataModule.article
  }
}