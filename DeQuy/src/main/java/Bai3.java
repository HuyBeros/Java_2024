
import java.util.Scanner;

public class Bai3 {
    public static long S(int n){
        if(n==0){
            return 0;
        }
        else{
            return n*n*n + S(n-1);
        }
    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(S(n));
    }
}
