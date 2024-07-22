
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//Bai5: Khoang cac Euclid//
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1,y1,x2,y2;
        double KhoangCach,D;
        x1=sc.nextInt();
        y1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        D=Math.pow(x2-x1, 2)+Math.pow(y2-y1,2);
        KhoangCach=Math.sqrt(D);
        System.out.printf("%.2f",KhoangCach);
    }
}
