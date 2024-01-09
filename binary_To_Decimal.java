import java.util.*;
public class binary_To_Decimal {
    public static void binaryToDecimal(int binaryNum) {
        int myNum = binaryNum;
        int decimalNum = 0;
        int pow = 0;

        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimalNum = decimalNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binaryNum = binaryNum / 10;
        }
        System.out.println("Decimal equivalent of "+myNum+" is "+decimalNum);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a binary number ( 0 and 1 only)");
    int userInput = sc.nextInt();
    binaryToDecimal(userInput);
    sc.close();
}
}


