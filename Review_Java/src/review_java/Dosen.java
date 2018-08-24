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
public class Dosen extends User{
    private String kdDosen;
    
    public static void main(String [] args){
        String a = new Dosen().getName("alif", "6701164163");
        System.out.println(a);
    }
    
    @Override
    public String getName(String nama, String kd) {
        
        return nama+' '+kd; //To change body of generated methods, choose Tools | Templates.
    }

    
    
     
     
}
