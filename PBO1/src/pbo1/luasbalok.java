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
public class luasbalok {
    public static void main(String[] args) {
        int p = 5;
        int l = 10;
        int t = 5;
        System.out.println("Masukkan panjang balok : "+p);
        System.out.println("Masukkan lebar balok : "+l);
        System.out.println("Masukkan tinggi balok : "+t);
        System.out.println("===================================");
        System.out.println("Menghitung luas permukaan balok");
        System.out.println("===================================");
        System.out.println("Luas permukaan balok adalah :"+((2*p*l)+(2*l*t)+(2*p*t)));
    }
    
}
