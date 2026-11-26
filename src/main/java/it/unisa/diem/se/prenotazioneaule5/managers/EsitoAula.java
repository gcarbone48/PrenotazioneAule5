/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.managers;

public enum EsitoAula {
    AULA_OK("Operazione Riuscita"),
    AULA_INESISTENTE("Aula non presente nel sistema"),
    ID_DUPLICATO("Id già presente nel sistema"),
    AULA_NULL("Null object");
    
    private String messaggio;
    
    private EsitoAula(String messaggio){
        this.messaggio = messaggio;
    }
    
    public String getMessaggio(){
        return messaggio;
    }
    
}
