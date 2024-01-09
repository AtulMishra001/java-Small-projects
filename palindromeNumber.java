import java.util.*;
// if number is not starting with 0 
public class palindromeNumber {
    public static void checkPalindrome(int num) {
        int reverseNum=0;
        int myNum = num;
        while (num >0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum *10 +(lastDigit);
            num = num / 10;
        }

        if(myNum == reverseNum){
            System.out.println(myNum+" is a Palindrome number");
        }
        else{
            System.out.println(myNum+" is not a Palindrome number\nReverse of "+myNum+" is "+reverseNum+" and this is not identical to our input "+myNum);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if number is palindrome");
        int num = sc.nextInt();
        checkPalindrome(num);
        sc.close();
    }
}
