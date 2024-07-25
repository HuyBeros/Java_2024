
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,x2;
        int a=sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
            if (a == 0) {
            if (b == 0) {
                if(c == 0) {
                System.out.println("VO SO NGHIEM");}
                else{
                System.out.println("VO NGHIEM");
                }
                } 
            else {
                    System.out.println(-(double) b / c);
                }
            }
            if(a!=0){
            int delta=b*b-4*a*c;
            x1=((double)(-b+(Math.sqrt(delta)))/(2*a));
            x2=((double)(-b-(Math.sqrt(delta)))/(2*a));
            if(delta>0){
                System.out.printf("%.3f",x1);
                System.out.print(" ");
                System.out.printf("%.3f",x2);
            }
            else if(delta==0){
                System.out.println(Math.abs(x1));
            }
            else if(delta<0){
                System.out.println("VO NGHIEM");
            }
        }
    }
}

