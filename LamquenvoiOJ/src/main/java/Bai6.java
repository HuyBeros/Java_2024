
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,ceilx,floorx,roundx;
        x = sc.nextDouble();
        ceilx=Math.ceil(x);
        floorx=Math.floor(x);
        roundx=Math.round(x);
        System.out.printf("%.0f%n",ceilx);
        System.out.printf("%.0f%n",floorx);
        System.out.printf("%.0f%n",roundx);
    }
}
