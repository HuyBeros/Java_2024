
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//bai6: Luyen tap viet cau dieu kien//

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("So Chan");
        }
        else{
            System.out.println("So Le");
        }
        if((n%3==0)&&(n%5==0)){    
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if(n%3==0&&n%7!=0){
            System.out.println("yes");
            
        }else System.out.println("no");
        if(n%3==0&&n%7==0){
            System.out.println("Yes");
            
        }else System.out.println("no");
        if(n>30&&n<50){
            System.out.println("yes");
        }else System.out.println("no");
        if(n>30&&(n%2==0||n%3==0||n%5==0)){
            System.out.println("yes");
        }else System.out.println("no");
        if((n>=10&&n<=99)&&(n%10==2||n%10==3||n%10==5||n%10==7)){
            System.out.println("yes");
        }else System.out.println("no");
        if(n<=100&&n%23==0){
            System.out.println("yes");
        }else System.out.println("no");
        if(n<10||n>20){
            System.out.println("yes");
        }else System.out.println("no");
        if((n%10)%3==0){
            System.out.println("yes");
        }else System.out.println("no");
}
}