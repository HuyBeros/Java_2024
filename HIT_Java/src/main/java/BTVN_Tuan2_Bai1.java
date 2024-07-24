
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BTVN_Tuan2_Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        double r=sc.nextDouble();
        double ChuVi= 2*pi*r;
        double DienTich=pi*r*r;
        System.out.printf("%.3f",ChuVi);
        System.out.print(" ");
        System.out.printf("%.3f",DienTich);
        
    }
}
