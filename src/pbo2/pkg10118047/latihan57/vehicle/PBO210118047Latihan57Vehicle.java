/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan57.vehicle;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class PBO210118047Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bcl = new Bicycle();
        bcl.setMyBrand("Trek Bike");
        bcl.setMyModel("7.4FX");
        bcl.setMyGearCount(23);
        System.out.println("Brand : "+bcl.getMyBrand());
        System.out.println("Model : "+bcl.getMyModel());
        System.out.println("SystemJumlah Gear : "+bcl.getMyGearCount());
        System.out.println("");
        Skateboard skt = new Skateboard();
        skt.setMyBrand("Ally Skate");
        skt.setMyModel("Rocket");
        skt.setMyBoarLenght(54.5);
        System.out.println("Brand : "+skt.getMyBrand());
        System.out.println("Model : "+skt.getMyModel());
        System.out.println("SystemJumlah Gear : "+skt.getMyBoarLenght());
        
    }
    
}
