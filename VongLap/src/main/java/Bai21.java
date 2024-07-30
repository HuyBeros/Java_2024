
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        } hinh chu nhat dac


    /*  hinh chu nhat rong
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    */

  /*      hinh chu nhat co dau thang o giua
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
        }
            System.out.println("");
    }
*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
}
}