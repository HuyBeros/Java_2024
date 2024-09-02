
import java.util.Scanner;


public class Bai4 {
    public static long S(int n){
        if(n==1){
            return 1;
        }
        else{
            return (int)Math.pow(-1, n)*n + S(n-1); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(S(n));
    }
}
