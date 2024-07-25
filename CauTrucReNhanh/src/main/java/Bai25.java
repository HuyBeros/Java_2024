
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int SoTo=0;
        int n=sc.nextInt();
        int[] a ={100,20,10,5,1};
        if(n>0){
            for(int i=0;i<a.length;i++){
            SoTo+=n/a[i];
            n%=a[i];
        }
            System.out.println(SoTo);
        }
    }
}
