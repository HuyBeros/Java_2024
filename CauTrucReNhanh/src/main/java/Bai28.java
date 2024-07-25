
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long csc=0;
        int n=sc.nextInt(), u1=sc.nextInt(), d=sc.nextInt();
        for(int i=1;i<=n;i++){
            csc+=u1+(i-1)*d;
        }
        System.out.println(csc);
    }
}
