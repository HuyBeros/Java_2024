
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai1 {
    public static int CheckPrime(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static long TongN(int n){
        long sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int TongChanN(int n){
        int sum = 0 ;
        while(n>0){
            if(n%2==0){
                sum+=n%10;
            }
            n/=10;
        }
        return sum;
    }
    public static int TongNguyenTo(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(CheckPrime(sum)==1){
            System.out.println(sum);
        }else{
            return 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(CheckPrime(n));
        System.out.println(TongN(n));
        System.out.println(TongChanN(n));
        System.out.println(TongNguyenTo(n));
    }
}
