
import java.util.Scanner;


public class Bai5 {
    public static long S(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*S(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(S(n));
    }
}
