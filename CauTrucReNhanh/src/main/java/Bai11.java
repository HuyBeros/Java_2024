
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if((a>0&&b>0&&c>0)&&(a+b>c&&a+c>b&&c+b>a)){
            
            if(a==b&&b==c){
                System.out.println("1");
            }
            else if(a==b||b==c||c==a){
                System.out.println("2");
            }
            else if((a*a+b*b)==c*c||(b*b+c*c)==a||(a*a+c*c)==b){
                System.out.println("3");
            }
        }else System.out.println("INVALID");
    }
}
