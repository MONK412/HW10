package ru.netology.manager;

import ru.netology.domain.MovieDescription;

public class MovieManager {
    private MovieDescription[] titles = new MovieDescription[0];

    public int limit = 10;

    public MovieManager() {
        this.limit = limit;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(MovieDescription title) {
        int length = titles.length + 1;
        MovieDescription[] tmp = new MovieDescription[length];
        System.arraycopy(titles, 0, tmp, 0, titles.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = title;
        titles = tmp;
    }

    public MovieDescription[] findAll() {
        return titles;
    }

    public MovieDescription[] findLast() {
        MovieDescription[] titles = findAll();
        int resultLength = 0;
        if (titles.length < limit) {
            resultLength = titles.length;
        } else {
            resultLength = limit;
        }
        MovieDescription[] result = new MovieDescription[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = titles[index];
        }
        return result;
    }
}
