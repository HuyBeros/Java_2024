
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//kiemtra tam gia//

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if((a>0&&b>0&&c>0)&&(a+b>c&&a+c>b&&c+b>a)){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
