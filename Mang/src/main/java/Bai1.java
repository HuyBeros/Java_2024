
import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
           a[i] = sc.nextInt();
        }
        int demchan=0,demle=0,TongChan=0,TongLe=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                demchan++;
                TongChan+=a[i];
            }
            else{
                demle++;
                TongLe+=a[i];
            }
        }
        System.out.println(demchan);
        System.out.println(demle);
        System.out.println(TongChan);
        System.out.println(TongLe);
    }
}
