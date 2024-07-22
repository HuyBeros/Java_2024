/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//Chu vi va dien tich hinh tron//
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double SoPi;
        double R=sc.nextDouble();
        SoPi=3.14;
        double ChuVi=2*SoPi*(double)R;
        double DienTich=SoPi*(double)R*R;
        System.out.printf("%.4f",ChuVi);
        System.out.println("");
        System.out.printf("%.4f",DienTich);
        
        
    }
}
