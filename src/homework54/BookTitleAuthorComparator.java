package homework54;

import homework53.Book;
import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    String title1 = o1.getTitle();
    String title2 = o2.getTitle();
    int titleComparison = title1.compareTo(title2);
    if (titleComparison!=0){
      return titleComparison;
    }

    return o1.getAuthor().compareTo(o2.getAuthor());
  }
}
