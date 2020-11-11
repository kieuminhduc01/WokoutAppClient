package com.example.workoutapp.area.Client.model;

import java.util.List;

public class PlayList {
    private long id;
    private long userId;
    private List<Exercise> exercise;

    public PlayList() {
    }

    public PlayList(long userId, List<Exercise> exercise) {
        this.userId = userId;
        this.exercise = exercise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Exercise> getExercise() {
        return exercise;
    }

    public void setExercise(List<Exercise> exercise) {
        this.exercise = exercise;
    }
}
