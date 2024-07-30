
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//bai nay chua biet lam//
public class Bai20 {
     public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n) / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dem=0;
        if(n<2){
            System.out.println("-1");
            return;
        }
        while(n>1){
            if(n%2==0){
                dem+=n/2;
                n=1;
            }
        else{
            n-=3;
            }
        if(isPrime(n)){
            System.out.println(dem+1);
        }
        else{
            System.out.println(dem);
        }
        for(int i=0;i<dem;i++){
            System.out.println("2");
        }
    }
}
}
