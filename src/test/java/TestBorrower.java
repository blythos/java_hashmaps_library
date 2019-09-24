import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBorrower {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(5);
        book1 = new Book("Equal Rites", "Terry Pratchett", "Fantasy");
        book2 = new Book("The Traitor Baru Cormorant", "Seth Dickinson", "Fantasy");
        book3 = new Book("My Year of Rest and Relaxation", "Ottessa Moshfegh", "Literary");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void borrowerTakesBook(){
        borrower.borrowsBook(library, book1);
        assertEquals(1, borrower.collectionSize());
    }


}
