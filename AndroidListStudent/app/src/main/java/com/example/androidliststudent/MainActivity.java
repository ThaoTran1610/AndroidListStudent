package com.example.androidliststudent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewUser;
    List<Student> students;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewUser = findViewById(R.id.recyclerStudent);
        recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));

        final StudentAdapter studentAdapter =new StudentAdapter();
        recyclerViewUser.setAdapter(studentAdapter);


        Student student1 =new Student("Lan", 8, "Quang Nam");
        Student student2 =new Student("Hoa", 9, "Quang Tri");
        Student student3 =new Student("Anh", 10, "Quang Binh");
        Student student4 =new Student("Ngoc", 6, "KonTum");
        Student student5 =new Student("Nhu", 7, "Hue");

        students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        studentAdapter.students = students;

        click = findViewById(R.id.button_add);

        click.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                students.add(new Student("Mai", 7, "Binh Dinh", "Galaxy"));
                studentAdapter.notifyDataSetChanged();

            }
        });

        click = findViewById(R.id.button_delete);

        click.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                students.remove(students.size()-1);
                studentAdapter.notifyDataSetChanged();

            }
        });


    }
}
