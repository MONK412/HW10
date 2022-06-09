package ru.netology;

import ru.netology.domain.MovieDescription;
import ru.netology.manager.MovieManager;

public class Main {
    public static void main(String[] args) {
        MovieDescription first = new MovieDescription("Вперед");
        MovieDescription second = new MovieDescription("Джентельмены");
        MovieDescription third = new MovieDescription("Человек-невидимка");

        MovieManager manager = new MovieManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieDescription[] all = manager.findAll();
        MovieDescription[] last = manager.findLast();
    }
}
