import java.util.HashMap;
import java.util.Map;

public class Bill {

  private final Map<String, Double> rows = new HashMap<>();

  public void addRow(String title, double price) {
    if (rows.containsKey(title)) {
      throw new IllegalArgumentException("Позиция уже существует: " + title);
    }
    rows.put(title, price);
  }

  public Map<String, Double> getRows() {
    return rows;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Bill:\n");
    for (Map.Entry<String, Double> entry : rows.entrySet()) {
      builder
          .append(entry.getKey())
          .append(String.format("=%.2f", entry.getValue())
          ).append('\n');
    }
    return builder.toString();
  }
}
