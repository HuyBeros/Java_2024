
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),a1=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        double TrungBinh=(double)(a+a1+2*b+3*c)/7;
        if(a>=0&&b>=0&&c>=0){
            if(TrungBinh>=8){
                System.out.println("GIOI");
            }
            else if(TrungBinh>=6.5&&TrungBinh<8){
                System.out.println("Kha");
            }
            else if(TrungBinh>=5&&TrungBinh<6.5){
                System.out.println("Trung Binh");
            }
            else if(TrungBinh<5){
                System.out.println("Yeu");
            }
        }else System.out.println("INVALID");
    }
}
