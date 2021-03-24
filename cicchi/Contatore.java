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
public class Contatore implements Runnable{
    
    public boolean cresDecr;
    public static int cont = 0;
    
    public Contatore(boolean b){
        
        cresDecr = b;
        
    }
    
    public void run(){
        
        int n=cont;
        
        for(int i=0;i<90;i++){
            
            if(cresDecr){
                
                cont = n + 1;
                
            }else{
                
                cont = n - 1;
            }
        }
    }
    
    public int getCont(){
        
        return cont;
    }
}
