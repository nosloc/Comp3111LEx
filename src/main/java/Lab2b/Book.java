package Lab2b;

import java.lang.reflect.Array;
import java.util.Arrays;

/* Comp3111Ex\Lab2b\Book.java
    Book class for Lab2 Exercise 2 */
public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i  = 0; i < chapters.length; ++i)
            chapters[i] = "n/a";
    }
    public Book(String arguments[]){
       /* construct the object with an array of chapter names */
       /* PLEASE ADD TOUR CODE HERE */
        chapters = Arrays.copyOf(arguments, arguments.length);
    }
    public String getChapter(int i) {
        /* return the chapter by the given index */
        /* PLEASE ADD TOUR CODE HERE */
        if (i > DEFAULT_CHAPTERS || i < 0)
            return null;
        else
            return chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}
