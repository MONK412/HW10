package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieDescription;

public class MovieManagerTest {
    MovieDescription first = new MovieDescription("Вперед");
    MovieDescription second = new MovieDescription("Джентельмены");
    MovieDescription third = new MovieDescription("Человек-невидимка");

    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();
        manager.add(second);
        MovieDescription[] actual = manager.findAll();
        MovieDescription[] expected = {second};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showMovie() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        MovieDescription[] actual = manager.findAll();
        MovieDescription[] expected = {first, second, third};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovie() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        MovieDescription[] actual = manager.findLast();
        MovieDescription[] expected = {third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
}
