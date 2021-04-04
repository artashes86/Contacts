package com.example.contacts

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(val context: Context, val data: List<DataContacts>) : RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.contacts_row, parent, false)
        return ContactsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        holder.textName.text = data[position].title
        holder.textNumber.text = data[position].description
        holder.iconImg.setImageResource(data[position].icon)
        Log.d("x", "yyyy $position")
    }

    override fun getItemCount(): Int {
        return data.size
    }


    class ContactsViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val textName : TextView
        val textNumber : TextView
        val iconImg : ImageView

        init {
            textName = view.findViewById(R.id.text_name)
            textNumber = view.findViewById(R.id.text_number)
            iconImg = view.findViewById(R.id.icon_img)
        }

    }


}