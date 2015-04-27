package ua.kobzev.springlibrary.objects;

import org.springframework.stereotype.Component;

/**
 * Created by Kostya on 25.04.2015.
 */

@Component
public class Utils {
    private Character[] letters = new Character[]{'A','B'};

    public Character[] getLetters() {
        return letters;
    }
}
