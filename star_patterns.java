import java.util.*;

public class star_patterns {
    public static void rectangle() { // this function prints a simple solid rectangle
        Scanner sc = new Scanner(System.in);
        int rows ,columns;
        System.out.println("Enter the number of rows :)");
        rows = sc.nextInt();

        System.out.println("Enter the number of columns :)");
        columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void hollowRectangle() { // this function prints hollow rectangle
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows :)");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns :)");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static void tiltedHollowRectangle() { // this function prints tilted hollow rectangle
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows :)");
        int rows = input.nextInt();

        System.out.println("Enter the number of columns :)");
        int columns = input.nextInt();

        for (int i = 1; i <= rows; i++) {

            // this loop prints first spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // this loop prints stars of hollow rectangle
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input.close();
    }

    public static void main(String[] args) {
       
    }
}