
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 * Bài 19. Mua bia
kk là vùng đất mà cư dân cực kì thích uống bia, vì thế để tăng số lượng
bia bán ra các cửa hàng bia ở đây đưa ra khuyến mại như sau : Cứ 3 vỏ chai bia
sẽ được đổi một chai bia mới. Biết rằng ở 28techland, mỗi chai bia có giá 28 xu,
nhiệm vụ của bạn là xác định với N xu cho trước, bạn có thể mua được tối đa bao
nhiêu chai bia tính cả việc đổi thưởng bằng vỏ chai?
 */
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=n/28;
        int VoChai=n/28;
        while(VoChai>=3){
            int temp=VoChai/3;
            res+=temp;
            VoChai=temp + VoChai%3;
        }
        System.out.println(res);
    }
}
