
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//Tong CHan Le:  S= -1 + 2 - 3 + 4 - 5 + ...... + (-1)^n*n//
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Tong=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                Tong+=i;
            }else{
                Tong-=i;
            }
        }
        System.out.println(Tong);
    }
}
