/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingMatematika;

/**
 *
 * @author GIE
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematikaCanggih mtk = new MatematikaCanggih();
        mtk.pertambahan(12.5, 28.7, 14.2);
        mtk.pengurangan(12.5, 28.7, 14.2);
        mtk.perkalian(12.5, 28.7, 14.2);
        mtk.pembagian(12.5, 28.7, 14.2);
        
        System.out.println("\n");
        mtk.pertambahan(23, 34);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(3.4, 4.9);
    }
    
}
