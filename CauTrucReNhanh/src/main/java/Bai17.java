
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        if(Character.isUpperCase(c)){
            System.out.println("UPPER");
        }else if(Character.isLowerCase(c)){
            System.out.println("LOWER");
        }else{
            System.out.println("SPECIAL");
        }
    }
}
