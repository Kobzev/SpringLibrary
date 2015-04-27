package ua.kobzev.springlibrary.dao.interfaces;

import ua.kobzev.springlibrary.entities.Author;
import ua.kobzev.springlibrary.entities.Book;
import ua.kobzev.springlibrary.entities.Genre;

import java.util.List;

/**
 * Created by Kostya on 24.04.2015.
 */
public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
}
