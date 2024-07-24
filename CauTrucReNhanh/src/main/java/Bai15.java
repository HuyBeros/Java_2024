
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(), a=sc.nextLong(),b=sc.nextLong();
        if(a<=(double)b/2){
            System.out.println(a*n);
        }else{
            if(n%2==0){
                System.out.println(n/2*b);
            }else{
                System.out.println((n-1)/2*b+a);
            }
        }
    }
}
