package com.example.technicaltest_areta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentListAdapter(private val students: List<Student>) :
    RecyclerView.Adapter<StudentListAdapter.StudentViewHolder>() {

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.textViewName)
        val profileImageView: ImageView = itemView.findViewById(R.id.imageViewProfile)
        val addressTextView: TextView = itemView.findViewById(R.id.textViewAddress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_layout, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]

        holder.nameTextView.text = student.name
        holder.profileImageView.setImageResource(student.profilePicture)
        holder.addressTextView.text = student.address

    }

    override fun getItemCount(): Int = students.size

}
