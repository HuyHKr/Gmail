package com.example.gmail

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomAdapter(val items:ArrayList<ItemModel>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       var view:View
       var viewHolder:MyViewHolder
       if(p1?.id==null){
           view = LayoutInflater.from(p2?.context).inflate(R.layout.item_layout,p2,false)
           viewHolder = MyViewHolder(view)
           view.tag = viewHolder

       }else {
           view = p1
           viewHolder  =p1.tag as MyViewHolder
       }
        var tempt = items[p0].name
        viewHolder.tag.text = tempt[0].toString()
        val style = GradientDrawable()
        style.shape = GradientDrawable.OVAL

        style.setColor(ContextCompat.getColor(p2!!.context,items[p0].color))
    viewHolder.tag.setBackground(style)
        viewHolder.name.text = items[p0].name
        viewHolder.content.text = items[p0].content
        viewHolder.date.text = items[p0].date
        if(items[p0].checked)viewHolder.star.setImageResource(R.drawable.on)
        else viewHolder.star.setImageResource(R.drawable.off)
        viewHolder.star.setOnClickListener{
            items[p0].checked = !items[p0].checked
            notifyDataSetChanged()
        }

        return view

    }
}
class MyViewHolder(val view: View?){
    lateinit var tag:TextView
    lateinit var name:TextView
    lateinit var content: TextView
    lateinit var date:TextView
    lateinit var star:ImageButton
    init{
        tag = view!!.findViewById<TextView>(R.id.tag)
        name = view!!.findViewById<TextView>(R.id.name)
        content = view!!.findViewById<TextView>(R.id.content)
        date = view!!.findViewById<TextView>(R.id.date)
        star = view!!.findViewById<ImageButton>(R.id.star)
    }
}