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
public class User {
        private String nama;
        private String nim;
        private String kdDosen;

   public String getName(String nama, String kd){
       nama = this.nama;
       nim = this.nim;
       
       return nama+' '+nim;
   }
   
   
   
    
}
