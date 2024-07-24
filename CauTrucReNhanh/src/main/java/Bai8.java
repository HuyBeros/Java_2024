
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Thuong=0;
        int a=sc.nextInt(), b=sc.nextInt();
        int Tong=a+b;
        int Hieu=a-b;
        int Tich=a*b;
        System.out.println(Tong);
        System.out.println(Hieu);
        System.out.println(Tich);
            if(b==0){
            System.out.println("INVALID");
        }else{
            Thuong =(double)a/b;
            System.out.printf("%.4f",Thuong);
        }
       
    }
}
