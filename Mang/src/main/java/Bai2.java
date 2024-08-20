
import java.util.Scanner;


public class Bai2 {
    public static boolean check(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        float TongNguyenTo=0,TrungBinh=0;
        int dem=0;
        for(int i=0;i<n;i++){
            if(check(a[i])==true){
                dem++;
                TongNguyenTo+=a[i];
            }
        }
        TrungBinh=TongNguyenTo/dem;
        System.out.printf("%.3f", TrungBinh);
    }
}
