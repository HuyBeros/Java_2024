
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x,bac2,bac3;
       x = sc.nextDouble();
       bac2=Math.sqrt(x);
       bac3=Math.cbrt(x);
       System.out.printf("%.2f%n", bac2);
       System.out.printf("%.2f%n", bac3);     
    }
}
