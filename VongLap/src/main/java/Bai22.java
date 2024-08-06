
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       /* 
        *
        **
        ***
        ****
        *****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print("*");
                
            }
            System.out.println("");
        }*/
      /* 
       *****
       ****
       ***
       **
       *
       for(int i=n;i>=1;i--){
           for(int j=i;j>=1;j--){
               System.out.print("*");
           }
           System.out.println("");
       }
*/
       /*  
               *
              **
             ***
            ****
           *****

           for(int i=1;i<=n;i++){
           for(int j=n;j>i;j--){
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++){
               System.out.print("*");
           }
           System.out.println("");
       }*/
      /*for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++){
              System.out.print(" ");
          }
          for(int k=n;k>i;k--){
              System.out.print("*");
          }
          System.out.println("");
      }*/
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              if(j == 1 || j == i || i == n){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }
          }
          System.out.println("");
      }
}
}