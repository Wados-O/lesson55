package homework51;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Month[] allMonth = Month.values();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите номер месяца: ");
    while (!scanner.hasNextInt()){
      if (!scanner.hasNext()){
      System.err.println("Неожиданный конец файла ");
      return;

      }
    }
    int monthNumber = scanner.nextInt();
    if (1 <= monthNumber && monthNumber <= allMonth.length){
      int index = monthNumber -1;
      Month month = allMonth[index];
      int days = month.getDays();
      System.out.printf("Месяц с номером %d: %s (%d %s)%n",monthNumber,month.getName(),days ,(days % 10 == 1) ? "день":"дней");
    }else {
      System.out.println("Нет месяца с номером " + monthNumber);
    }




    Month second = Month.values()[1];


    System.out.println("second " + second +
        ", " + "second.getDays(): " + second.getDays()
        + " second.getName(): " + second.getName());
  }

}
