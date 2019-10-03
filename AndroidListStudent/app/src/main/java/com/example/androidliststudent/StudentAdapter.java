package com.example.androidliststudent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    List<Student> students;

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_list, parent, false);

        return new StudentViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.tvName.setText(students.get(position).name);
        holder.tvAge.setText(""+students.get(position).age);
        holder.tvHometown.setText(students.get(position).hometown);
        holder.tvTypephone.setText(students.get(position).typephone);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvAge;
        TextView tvHometown;
        TextView tvTypephone;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.text_name);
            tvAge = itemView.findViewById(R.id.text_age);
            tvHometown = itemView.findViewById(R.id.text_hometown);
            tvTypephone = itemView.findViewById(R.id.text_typephone);
        }
    }
}
