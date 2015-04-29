package ua.kobzev.springlibrary.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.kobzev.springlibrary.dao.interfaces.BookDAO;
import ua.kobzev.springlibrary.entities.Book;

import java.util.List;

/**
 * Created by Kostya on 28.04.2015.
 */
@Component
@Scope("singleton")
public class LibraryFacade {
    @Autowired
    private BookDAO bookDAO;

    private List<Book> books;


    public List<Book> getBooks() {
        if (books == null){
            books = bookDAO.getBooks();
        }
        return books;
    }
}
