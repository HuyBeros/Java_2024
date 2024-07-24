
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(),n=sc.nextInt();
        if((t>0&&t<=12)&&(n>0&&n<=5000)){
            if(t==1 || t==3 || t==5||t==7||t==9||t==11){
                System.out.println("31");
            }
            else if(t==4||t==6||t==8||t==10||t==12){
                System.out.println("30");
            }
            else if(t==2){
                System.out.println("29");
            }
            

    } else System.out.println("INVALID");
}
}
