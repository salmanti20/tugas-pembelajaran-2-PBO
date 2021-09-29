/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author salma
 */
public class no3latihan3 {
    public static void main(String[] args) {
        double keliling, panjang, lebar;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Isikan panjang");
        panjang = input.nextInt();
        System.out.println("Isikan lebar");
        lebar = input.nextInt();
        
        keliling = (2*panjang) + (2*lebar);
        System.out.println("Keliling persegi panjang adalah"+ keliling);
    }
}
