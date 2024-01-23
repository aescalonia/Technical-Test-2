package com.example.technicaltest_areta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_list)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StudentListAdapter(getStudentData())
    }

    private fun getStudentData(): List<Student> {
        return listOf(
            Student("Areta Escalonia", R.drawable.baseline_person_24, "Jakarta Timur"),
            Student("Keira Elfreda", R.drawable.baseline_person_24, "Jakarta Selatan"),
            Student("Gavin Adelard", R.drawable.baseline_person_24, "Bandung"),
            Student("Minji Kim", R.drawable.baseline_person_24, "Korea Selatan"),
            Student("Jungkook Jeon", R.drawable.baseline_person_24, "Korea Selatan"),
            Student("Benedict Cumberbatch", R.drawable.baseline_person_24, "London"),
            Student("Tom Holland", R.drawable.baseline_person_24, "London"),
            Student("Chris Hemsworth", R.drawable.baseline_person_24, "Australia"),
            Student("Olivia Rodrigo", R.drawable.baseline_person_24, "Los Angeles"),
            Student("Taylor Swift", R.drawable.baseline_person_24, "Los Angeles"),
            Student("Emma Watson", R.drawable.baseline_person_24, "London"),
            Student("Ariana Grande", R.drawable.baseline_person_24, "Los Angeles"),
        )
    }
}