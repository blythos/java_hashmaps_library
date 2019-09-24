import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int checkCollectionSize(){
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.capacity > this.checkCollectionSize()) {
            this.collection.add(book);
        }
    }

    public Book removeBook(Book book) {
        this.collection.remove(book);
        return book;
    }
}
