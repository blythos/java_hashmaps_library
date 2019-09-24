import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBooks {

    private Book book;

    @Before
    public void before(){
        book = new Book("Equal Rites", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void getBookTitle(){
        assertEquals("Equal Rites", book.getTitle());
    }

    @Test
    public void getBookAuthor(){
        assertEquals("Terry Pratchett", book.getAuthor());
    }

    @Test
    public void getBookGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
