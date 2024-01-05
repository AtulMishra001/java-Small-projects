import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get it's Factorial");
        int num = sc.nextInt();
        int result = 1;
        for(int i=num; i>0; i--){
            result *= i;
        }
        System.out.println(result);
    }
}
