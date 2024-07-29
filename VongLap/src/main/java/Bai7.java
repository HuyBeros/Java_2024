
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%a[i]==0){
                System.out.println(i + " ");
                if(i!=n/i){
                    System.out.println(n/i + " ");
                }
            }
        }
       
    }
}
