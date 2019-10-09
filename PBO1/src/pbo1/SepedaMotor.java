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
public class SepedaMotor {
    public static void main(String[] args) {
        SepedaMotor ngeng = new SepedaMotor();
        ngeng.herex("");
        ngeng.CB("");
    }
    private void herex(String honda) {
        honda = "Honda";
        System.out.println("Nama motor adalah :" + honda);
        
    }
    private void CB(String beat) {
        beat = "Beat";
        System.out.println("Nama motor adalah : " + beat);
    }
}
