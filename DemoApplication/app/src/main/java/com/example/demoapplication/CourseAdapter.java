package com.example.demoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {
    
    private final Context context;
    private final ArrayList<CourseModal> courseModalArrayList;

    public CourseAdapter(Context context, ArrayList<CourseModal> courseModalArrayList) {
        this.context = context;
        this.courseModalArrayList = courseModalArrayList;
    }

    @NonNull
    @Override
    public CourseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.ViewHolder holder, int position) {

        CourseModal modal = courseModalArrayList.get(position);
        holder.coursename.setText(modal.getCourseName());
        holder.courserating.setText(modal.getRating());
        holder.courseimage.setImageResource(modal.getCourseImage());
    }

    @Override
    public int getItemCount() {
        return courseModalArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView coursename;
        public final TextView courserating;
        public final ImageView courseimage;

        public ViewHolder(View view1) {
            super(view1);
            coursename = view1.findViewById(R.id.course_name);
            courserating = view1.findViewById(R.id.course_rating);
            courseimage = view1.findViewById(R.id.card_image);
        }
    }
}
