
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        if(Character.isUpperCase(c)){
            c+=32;
            System.out.println((char)c);
        }
        else if(Character.isLowerCase(c)){
            c-=32;
            System.out.println((char)c);
        }else {
            System.out.println((char)c);
        }
    }
}
