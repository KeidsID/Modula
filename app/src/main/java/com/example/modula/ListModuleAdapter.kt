package com.example.modula

import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListModuleAdapter(private val moduleList: ArrayList<Module>) :
  RecyclerView.Adapter<ListModuleAdapter.VH>() {
  private lateinit var onTapCallback: OnTap

  inner class VH(itemLayout: View) : RecyclerView.ViewHolder(itemLayout) {
    var tvTitle: TextView = itemLayout.findViewById(R.id.tv_title)
    var tvCategory: TextView = itemLayout.findViewById(R.id.tv_category)
    var imgModule: ImageView = itemLayout.findViewById(R.id.img_module)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    val itemLayout = LayoutInflater.from(parent.context).inflate(
      R.layout.list_item,
      parent,
      false
    )

    return VH(itemLayout)
  }

  override fun onBindViewHolder(holder: VH, position: Int) {
    val module = moduleList[position]

    Glide.with(holder.itemView.context)
      .load(module.image)
      .apply(RequestOptions().override(350, 550))
      .into(holder.imgModule)

    holder.tvCategory.text = module.category
    holder.tvTitle.text = module.title

    holder.itemView.setOnClickListener {
      onTapCallback.onTap(moduleList[position])
    }
  }

  override fun getItemCount(): Int = moduleList.size

  fun setOnTap(callback: OnTap) {
    this.onTapCallback = callback
  }

  interface OnTap {
    fun onTap(data: Module)
  }
}