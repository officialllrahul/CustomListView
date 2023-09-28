package com.example.listviewcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Data= arrayListOf<DataModel>(
            DataModel("Bobby","admission open","https://media.yourobserver.com/img/photos/2023/04/25/img-homepage-meta_0_t1100.jpeg?31a214c4405663fd4bc7e33e8c8cedcc07d61559"),
            DataModel("Abhimanyu","My Dream", "https://www.imgcorporations.com/images/bg-img.jpg"),
            DataModel("Rahul","My Dream", "https://www.imgcorporations.com/images/bg-img.jpg")
        )

        val ListView=findViewById<ListView>(R.id.listView)
        val adapter= CustomAdapter(this,Data)
        ListView.adapter=adapter
    }
}