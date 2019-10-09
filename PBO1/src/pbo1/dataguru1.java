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
public class dataguru1 {
     public static void main(String[] args) {  
        Scanner masuk = new Scanner(System.in);
    dataguru1 objek = new dataguru1();
      int memilih;
      System.out.println("===SELAMAT DATANG DIRUANG GURU===");
       System.out.println("Anda ingin mencari data siapa ? \n1. guru 1 \n2. guru 2 \n3. guru 3 \n4. guru 4");
         memilih = masuk.nextInt();
         switch(memilih){
             case 1 :
                 objek.dataGuru1("");
                 break;
             case 2 :
                 objek.dataGuru2("");
                 break;
             case 3 :
                 objek.dataGuru3("");
                 break;
             case 4 :
                 objek.dataGuru4("");
          
         }
        
        
      }
     private void dataGuru1(String iot){
         System.out.println("======Data guru 1======");
         String nama = "Muhammad bagus arifin";
         String tempattgllahir = "Kediri,10 Agustus 1996";
         String alamat = "Jl. Danau kerinci v G6/G9";
         String pelajaran = "Sistem komputer dan IOT";
         String hobby = "membaca buku";
         System.out.println("nama guru : " + nama );
         System.out.println("Tempat,tanggal lahir : " + tempattgllahir);
         System.out.println("Alamat : " + alamat);
         System.out.println("Mata pelajaran yang diajar : " + pelajaran);
         System.out.println("Hobby : " + hobby);
     }
     private void dataGuru2(String pkn) {
         System.out.println("======data guru 2======");
         String nama = "Ria cahya kurina Rahma";
         String tempattgllahir = "Malang,1o April 1991";
         String alamat = "Jl. Teluk Cendrawasih gg.14,Arjosari";
         String pelajaran = "Pendidikan Kewarganegaraan";
         String hobby = "membaca buku";
          System.out.println("nama guru : " + nama );
         System.out.println("Tempat,tanggal lahir : " + tempattgllahir);
         System.out.println("Alamat : " + alamat);
         System.out.println("Mata pelajaran yang diajar : " + pelajaran);
         System.out.println("Hobby : " + hobby);
         
     }
     private void dataGuru3(String fisika) {
         System.out.println("======data guru 3======");
         String nama = "Diaur rahman";
         String tempattgllahir = "Sapeken, 19 April 1988";
         String alamat = "tidak jelas";
         String pelajaran = "Fisika itu mudah";
         String hobby = "Olahraga,nonton";
         System.out.println("nama guru : " + nama );
         System.out.println("Tempat,tanggal lahir : " + tempattgllahir);
         System.out.println("Alamat : " + alamat);
         System.out.println("Mata pelajaran yang diajar : " + pelajaran);
         System.out.println("Hobby : " + hobby);
         
     }
     private void dataGuru4(String BK) {
         System.out.println("======data guru 4======");
         String nama = "Emil bakhtiar zulkarnain";
         String tempattgllahir = "Malang,  07 mei 1983";
         String alamat = "Jl.Sumpil I/30A,Malang";
         String pelajaran = "Bimbingan Konseling";
         String hobby = "membaca buku";
         System.out.println("nama guru : " + nama );
         System.out.println("Tempat,tanggal lahir : " + tempattgllahir);
         System.out.println("Alamat : " + alamat);
         System.out.println("Mata pelajaran yang diajar : " + pelajaran);
         System.out.println("Hobby : " + hobby);
         
     }
    
    }
    

