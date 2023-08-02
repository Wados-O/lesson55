package homework51;

public class Main {

  public static void main(String[] args) {
    Month[] allMonth = Month.values();
    Month second = Month.values()[1];
    System.out.println("second" + second +
        "," + "second.getDays()" + second.getDays()
        + "second.getName()" + second.getName());
  }

}
