package ua.kobzev.springlibrary.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import ua.kobzev.springlibrary.enums.SearchType;

import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Kostya on 25.04.2015.
 */

@Component
public class Utils {
    private Map<String, SearchType> searchTypeMap = new HashMap<String, SearchType>();
    private SearchType selectedSearchType = SearchType.TITLE;

    @Autowired
    private MessageSource msg;

    private Character[] letters = new Character[]{'A','B'};

    public Character[] getLetters() {
        if (FacesContext.getCurrentInstance().getViewRoot().getLocale().equals(new Locale("ua")))
            return new Character[]{'А','Б','В','Г','Д','Е','Є','Ж','З','И','І','Ї','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ь','Ю','Я'};

        if (FacesContext.getCurrentInstance().getViewRoot().getLocale().equals(new Locale("ru")))
            return new Character[]{'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};

        if (FacesContext.getCurrentInstance().getViewRoot().getLocale().equals(new Locale("en")))
            return new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        return letters;
    }

    public Map<String, SearchType> getSearchTypeMap() {
        searchTypeMap.clear();
        searchTypeMap.put(msg.getMessage("author_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.AUTHOR);
        searchTypeMap.put(msg.getMessage("book_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.TITLE);
        return searchTypeMap;
    }

    public void setSearchTypeMap(Map<String, SearchType> searchTypeMap) {
        this.searchTypeMap = searchTypeMap;
    }

    public SearchType getSelectedSearchType() {
        return selectedSearchType;
    }

    public void setSelectedSearchType(SearchType selectedSearhType) {
        this.selectedSearchType = selectedSearhType;
    }
}
