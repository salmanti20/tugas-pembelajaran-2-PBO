/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
import java.util.Scanner;
/**
 *
 * @author salma
 */
public class no2latihan3 {
    public static void main(String[] args) {
        int bil_satu;
        int bil_dua;
        int hasilJumlah, hasilKurang, hasilKali, hasilBagi, hasilSisaBagi;
        
        Scanner input = new Scanner(System.in);
        System.out.println("isikan bilangan 1 :");
        bil_satu = input.nextInt();
        System.out.println("isikan bilangan 2 :");
        bil_dua = input.nextInt();
        
        hasilJumlah = bil_satu + bil_dua;
        hasilKurang = bil_satu - bil_dua;
        hasilKali   = bil_satu * bil_dua;
        hasilBagi   = bil_satu / bil_dua;
        hasilSisaBagi = bil_satu * bil_dua;
        
        System.out.println("Hasil penjumlahan :"+ hasilJumlah);
        System.out.println("Hasil kurang :"+ hasilKurang);
        System.out.println("Hasil kali :"+ hasilKali);
        System.out.println("Hasil Bagi :"+ hasilBagi);
        System.out.println("Hasil sisa bagi"+hasilSisaBagi );

    }
}
