/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author GIE
 */
public class HandphoneBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone handphone = new Handphone();
        handphone.hidupkan();
        handphone.lakukanPanggilan();
        handphone.kirimSMS();
        handphone.matikan();
       
        
    }
    
}
