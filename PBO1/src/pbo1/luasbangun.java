/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author asd
 */
import java.util.Scanner;
public class luasbangun {
    public static void main(String[] args) {
        Scanner baru = new Scanner(System.in);
        System.out.println("Masukkan nilai panjang : ");
        int p = baru.nextInt();
        System.out.println("Masukkan nilai lebar : ");
        int l = baru.nextInt();
        System.out.println("Masukkan nilai tinggi : ");
        int t = baru.nextInt();
        System.out.println("masukkan nilai jari - jari : ");
        int r = baru.nextInt();
        bola(r);
        balok(p,l,t);
        
    }
    public static void bola(double r){
        double phi = 3.14;
        System.out.println("=====luas permukaan bola======");
        System.out.println("Rumus luas permukaan bola : 4 * phi * r * r");
        System.out.println("Luas permukaan bola adalah : " + (4*phi*r*r));
    }
    public static void balok(int p,int l,int t) {
        System.out.println("=====luas permukaan balok=====");
        System.out.println("Rumus permukaan balok : (2*p*l)+(2*l*t)+(2*p*t)");
        System.out.println("Luas permukaan balok adalah : " + ((2*p*l)+(2*l*t)+(2*p*t)));
        
    }
    
}
