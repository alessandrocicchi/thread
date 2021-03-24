/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cicchi;

/**
 *
 * @author informatica
 */
public class main {
    
    public static void main(String[] args){
    
        Contatore c1 = new Contatore(true);
        Contatore c2 = new Contatore(false);
        
        for(int i=0;i< 90 ; i++){
            
            Thread th1 = new Thread(c1);
            Thread th2 = new Thread(c2);
        }
        
        
        
    }
}
