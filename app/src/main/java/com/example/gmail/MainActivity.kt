package com.example.gmail

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ItemModel(val name:String, val content: String, var date:String, var checked:Boolean = false,var color:Int)
        val data = arrayListOf<ItemModel>(
            ItemModel("John Smith","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","10/15/1985",false, R.color.a)
        ,ItemModel("Emily Johnson","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","07/25/1994",false, R.color.b
        )
         ,ItemModel("Daniel Harris","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","02/18/1987",false,R.color.c
        )
        ,ItemModel("Charlotte White","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","11/30/1992",false, R.color.d)
        ,ItemModel("Benjamin Jackson","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."," 09/08/1976",false,R.color.e)
        ,ItemModel("Mia Thomas ","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","02/18/1987",false, R.color.a
        )
        ,ItemModel("James Anderson","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","11/30/1992",false, R.color.c)
        ,ItemModel("Sarah Brown ","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups."," 09/08/1976",false,R.color.b)
        ,ItemModel("Ava Taylor","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","03/02/1989",false, R.color.d)
        ,ItemModel("William Moore","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","03/02/1989",false,R.color.a)
        ,ItemModel("Sophia Wilson","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","12/20/1995",false,R.color.e
        )
        ,ItemModel("Olivia Davis ","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","08/03/1978",false,R.color.a)
        ,ItemModel("David Jones","Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.","08/03/1978",false,R.color.b
        )
        )
        //endinput
        val adapter = CustomAdapter(data)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

    }
}