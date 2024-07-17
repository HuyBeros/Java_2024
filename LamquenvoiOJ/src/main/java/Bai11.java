
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long doubleN=2*N;
        long TenN=N*10;
        System.out.println(doubleN);
        System.out.println(TenN);
        System.out.println(N/2);
        System.out.printf("%.3f", (float)N/2);
        
    }
}
