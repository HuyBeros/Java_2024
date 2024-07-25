
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a=sc.nextLong(), b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
        long max1=Math.max(a, b);
        long max2=Math.max(c, d);
        long Max=Math.max(max1,max2);
        long min1=Math.min(a, b);
        long min2=Math.min(c, d);
        long Min=Math.min(min1, min2);
        System.out.print((Max)+" ");
        System.out.print(Min);
}
}