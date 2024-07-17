
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(z, t));
        System.out.println(Math.max(Math.max(x, y), z));
        System.out.println(Math.min(Math.min(x, y), Math.min(z, t)));
    }
}
