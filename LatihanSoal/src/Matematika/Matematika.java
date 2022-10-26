/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author GIE
 */
public class Matematika {
    int pertambahan(int a, int b){
        int hasil =  a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasil);
        return hasil;
    }
    
    int pengurangan(int a, int b){
        int hasil =  a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
        return hasil;
    }
    
    int perkalian(int a, int b){
        int hasil =  a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
        return hasil;
    }
    
    float pembagian(float a, float b){
        float hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " = " + hasil);
        return hasil;
    }
}
