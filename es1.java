import java.util.Scanner;

public class es1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a string: ");
    String myString = input.nextLine();
    System.out.println(checkEqual(myString));

    System.out.println("enter a year to check if it is a leap year: ");
    int year = input.nextInt();
    System.out.println(getLeapYear(year));

  }

  public static boolean checkEqual(String myString) {
    return myString.length() % 2 == 0;
  }

  public static boolean getLeapYear(int year) {
    boolean response;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        response = year % 400 == 0;
      } else {
        response = true;
      }
    } else {
      response = false;
    }

    return response;
  }
}