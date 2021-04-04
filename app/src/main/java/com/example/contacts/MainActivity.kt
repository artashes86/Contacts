package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler = findViewById<RecyclerView>(R.id.recycler_view)

        val contactsList = listOf(DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),
            DataContacts("Artash", "094519921", R.drawable.ic_launcher_background),)

        val costAdapter = ContactsAdapter(this, contactsList)


        recycler.adapter = costAdapter
        recycler.layoutManager = LinearLayoutManager(this)

    }
}