import java.util.*;
public class decimal_To_binary {
    
    public static void decimalToBinary(int decimalNum) {
        int myNum = decimalNum;
        int binaryNum = 0;
        int pow = 0;

        while(decimalNum >0) {
        binaryNum = binaryNum + ((decimalNum%2) * (int)Math.pow(10,pow)); 
        pow++;
        decimalNum /=2;
        }
        System.out.println("Binary equivalent of "+myNum+" is "+binaryNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number :)");
        int userInput = sc.nextInt();
        decimalToBinary(userInput);
        sc.close();
    }
}
