package homework50;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String inputFileName = "res/in.txt";
    File inputFile = new File(inputFileName);
    Scanner scanner;
    try {
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      System.err.println("File not found" + inputFileName);
      return;
    }
    if (!scanner.hasNext()) {
      System.err.println("File not found" + inputFileName + ": невозможно прочитать число");
      return;
    }
    int number = scanner.nextInt();
    scanner.close();

    String result = Integer.toBinaryString(number);
    String outputFileName = "res/out.txt";
    File outputFile = new File(outputFileName);
    try {
      FileWriter writer = new FileWriter(outputFile);
      writer.write(result + "\n");
      writer.close();
    } catch (IOException e) {
      System.err.println("Ошибка записи файла: "  + e.getMessage());
    }
  }
}

