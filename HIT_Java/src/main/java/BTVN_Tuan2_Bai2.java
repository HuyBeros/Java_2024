
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BTVN_Tuan2_Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();}
        for(int i=0;i<n;i++){
            if(i%2!=0){
                if(i==n-1){
                    A[i]+=Math.abs(A[i-1]);
                }
                else {
                    A[i]+=Math.abs(A[i-1]+A[i+1]);
            }
        }
    }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
}
}