package ru.netology.domain;

public class MovieDescription {

    private String title;

    public MovieDescription(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }
}
