
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin

 */
//ki tu ke tiep//
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c=='Z'|| c=='z'){
            System.out.println("a");
        }
        else if(c>='A'&&c<='Z'){
            c+=32;
            c+=1;
            System.out.println(c);
        }
        else{
            c+=1;
            System.out.println(c);
        }
    }
}
