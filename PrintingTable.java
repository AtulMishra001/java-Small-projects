import java.util.*;
public class PrintingTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print Table :)");
        int num = sc.nextInt();
        
        for(int i = 1; i<=10; i++){
            int ans = i*num;
            System.out.println(num+"*"+i+"="+ans);
        }
        sc.close();
    }
}