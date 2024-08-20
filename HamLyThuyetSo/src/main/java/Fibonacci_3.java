
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Fibonacci_3 {
    public static long check(long n){
        if(n==1){
            return 1;
        }
        long fn1=1, fn2=1;
        for(int i=3;i<=92;i++){
            long fn=fn1+fn2;
            if(fn>=n){
                return fn;
            }
            fn2=fn1;
            fn1=fn;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(check(n));
    }
}
