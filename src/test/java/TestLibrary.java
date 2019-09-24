import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLibrary {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book("Equal Rites", "Terry Pratchett", "Fantasy");
        book2 = new Book("The Traitor Baru Cormorant", "Seth Dickinson", "Fantasy");
        book3 = new Book("My Year of Rest and Relaxation", "Ottessa Moshfegh", "Literary");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void libraryHasBooks(){
        assertEquals(3, library.checkCollectionSize());
    }

    @Test
    public void libraryCannotHaveMoreThanCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(5, library.checkCollectionSize());
    }

    @Test
    public void keepTrackOfFantasyBooks(){
        assertEquals(2, library.genreAmount("Fantasy"));
    }


}
