package ua.kobzev.springlibrary.dao.interfaces;

import ua.kobzev.springlibrary.entities.Genre;

import java.util.List;

/**
 * Created by Kostya on 25.04.2015.
 */
public interface GenreDAO {

    List<Genre> getGenres();
}
