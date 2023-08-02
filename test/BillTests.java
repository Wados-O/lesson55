import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class BillTests {
  @Test
  public void addNewRow(){
    Bill bill = new Bill();
    String title = "title";
    double price = 2.5;

    bill.addRow(title,price);
    Map<String,Double> rows = bill.getRows();
    assertEquals(1,rows.size());
    assertEquals(price,rows.get(title));
  }


}
