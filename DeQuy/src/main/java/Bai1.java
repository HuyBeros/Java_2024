
import java.util.Scanner;


public class Bai1 {
    public static int S(int n){
        int sum=0;
            if(n==0){
                return 0;
            }
            else{
                sum = n + S(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(S(n));
    }
}
