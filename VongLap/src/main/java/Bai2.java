
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long sum=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
