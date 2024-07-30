
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//liet ke so chinh phuong//
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(int i=1;i<=Math.sqrt(n);i++){
           if(Math.pow(i, 2)<n){
               System.out.print((int)Math.pow(i, 2)+" ");
           }    
        }
}
}