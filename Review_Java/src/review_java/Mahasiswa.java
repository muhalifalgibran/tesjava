/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_java;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa extends User{
    
    String nama;
    String nim;
    
   public static void main(String [] args){
        String a = new Dosen().getName("ALIF", "ALF");
        System.out.println(a);
    }
    
//    public Mahasiswa(String nama,String nim){
//        this.nama = nama;
//        this.nim = nim;
//    }

    @Override
    public String getName(String nama, String kd) {
        
        return nama+' '+kd; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
