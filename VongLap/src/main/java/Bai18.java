
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//dem so nguyen to//
public class Bai18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int dem=0;
        while(n!=0){
           long temp=n%10; //lay phan du//
           if(temp==3||temp==5||temp==7||temp==8){
               dem++; //neu phan du la so nguyen to, bien dem +1//
           }
           n/=10; // xoa 1 so ngoai cung//
        }
        System.out.println(dem);
    }
}
