import static org.junit.jupiter.api.Assertions.assertEquals;

import homework53.Book;
import homework54.BookTitleAuthorComparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class BookTest {

  @Test
  public void BookTitleAuthorComparator() {
    List<Book> books = new ArrayList<>();
    Book book1 = new Book("A", "A", 22);
    Book book2 = new Book("A", "B", 44);
    Book book3 = new Book("B", "C", 55);
    books.add(book1);
    books.add(book2);
    books.add(book3);
    List<Book> newBooks = new ArrayList<>();
    books.sort(new BookTitleAuthorComparator());
    newBooks.add(book1);
    newBooks.add(book2);
    newBooks.add(book3);
    assertEquals(newBooks, books);
  }

}
