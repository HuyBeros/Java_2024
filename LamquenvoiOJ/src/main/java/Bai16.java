/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(x+"  "+y+"  "+z+"  "+t+"  ");
        System.out.println("");
        System.out.println(y+"--"+z+"--"+x+"--"+t+"--");
        System.out.println("");
        System.out.println(2*x+","+3*y+","+4*z+","+5*t);
        System.out.println("");   
        System.out.println("KET THUC!!");
    }
}
