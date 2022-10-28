import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year: ");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();
    }

    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year" + year + "is leap year");
            return;
        }
        System.out.println("The year" + year + "is not a leap year");
    }

}
