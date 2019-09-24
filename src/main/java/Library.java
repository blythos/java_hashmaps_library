import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private HashMap<String, Integer> genreCount;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreCount = new HashMap<String, Integer>();
    }

    public int checkCollectionSize(){
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.capacity > this.checkCollectionSize()) {
            this.collection.add(book);
            this.updateGenreCount(book.getGenre());
        }
    }

    public Book removeBook(Book book) {
        this.collection.remove(book);
        return book;
    }

    private void updateGenreCount(String genre){
        if (this.genreCount.containsKey(genre)){
            Integer total = genreCount.get(genre) + 1;
            genreCount.replace(genre, total);
        }
        else {
            this.genreCount.put(genre, 1);
        }
    }


    public int genreAmount(String genre) {
        return this.genreCount.get(genre);
    }
}
