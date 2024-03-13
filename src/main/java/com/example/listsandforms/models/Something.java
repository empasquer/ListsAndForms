package com.example.listsandforms.models;

public class Something {
    private int id;
    private String title;
    private double duration;

    public Something(int id, String title, double duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
