/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAC;

/**
 *
 * @author GIE
 */
public class ACBereaksi extends InterfaceBeraksi{

    void matikanAC(){
        System.out.println("AC dimatikan");
    }
    void dinginkanAC() {
        System.out.println("Dinginkan suhu AC");
    }
    void hidupkanAC(){
        System.out.println("AC dihidupkan");
    }
    void panaskanAC() {
        System.out.println("Panaskan suhu AC");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ACBereaksi ac = new ACBereaksi();
        ac.hidupkanAC();
        ac.panaskanAC();
        ac.dinginkanAC();
        ac.matikanAC();
    }
    
}
