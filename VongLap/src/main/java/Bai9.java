
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//Tich cac uoc//
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long Tich=1;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                Tich*=i;
                if(i!=n/i){
                    Tich*=n/i;
                }
            }
        }
        System.out.println(Tich);
    }
}
