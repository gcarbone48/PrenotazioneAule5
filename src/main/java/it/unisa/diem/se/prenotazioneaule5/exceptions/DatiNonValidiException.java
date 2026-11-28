/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.exceptions;
 
/**
 *
 * @author antonio.cupo
 */
public class DatiNonValidiException  extends Exception{
        
        public DatiNonValidiException(){
            super("i dati inseriti non sono validi!");
        }
        
         public DatiNonValidiException(String msg){
            super(msg);
        }
    }
