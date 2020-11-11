package com.example.workoutapp.area.Client.chucNang.Excercise.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.workoutapp.R;
import com.example.workoutapp.area.Client.model.Exercise;

import java.util.List;

public class ClientExerciseUnit extends BaseAdapter {
    private Activity activity;
    private List<Exercise> exerciseList;

    public ClientExerciseUnit(Activity activity, List<Exercise> exerciseList) {
        this.activity = activity;
        this.exerciseList = exerciseList;
    }

    @Override
    public int getCount() {
        return exerciseList.size();
    }

    @Override
    public Object getItem(int position) {
        return exerciseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return exerciseList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgExercisePreview;
        TextView lblExerciseName;
        TextView lblExerciseDescription;
        if(convertView==null){
            convertView=activity.getLayoutInflater().inflate(R.layout.layout_client_exercise_unit,null);
            imgExercisePreview=convertView.findViewById(R.id.imgExercisePreview);
            lblExerciseDescription=convertView.findViewById(R.id.lblExerciseDepcription);
            lblExerciseName=convertView.findViewById(R.id.lblExerciseName);

            convertView.setTag(R.id.imgExercisePreview,imgExercisePreview);
            convertView.setTag(R.id.lblExerciseDepcription,lblExerciseDescription);
            convertView.setTag(R.id.lblExerciseName,lblExerciseName);
        }else {
            imgExercisePreview=(ImageView) convertView.getTag(R.id.imgExercisePreview);
            lblExerciseName=(TextView) convertView.getTag(R.id.lblExerciseName);
            lblExerciseDescription=(TextView) convertView.getTag(R.id.lblExerciseDepcription);
        }

        Exercise exercise=exerciseList.get(position);
        lblExerciseName.setText(exercise.getName());
        lblExerciseDescription.setText(exercise.getLevel());
        
        return convertView;
    }
}
