
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
//bai6: Luyen tap viet cau dieu kien//

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("So Chan");
        }
        else{
            System.out.println("So Le");
        }
        if((n%3==0)&&(n%5==0)){    
            System.out.println("n chia het cho ca 3 va 5");
        }
        else{
            System.out.println("n khong vua chia het cho 3 va 5");
        }
}
}