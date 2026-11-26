/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.managers;

/**
 *
 * @author Giovanni
 */
public enum EsitoDocente {
    DOCENTE_OK("Operazione Riuscita"),
    DOCENTE_INESISTENTE("Docente non presente nel sistema"),
    EMAIL_DUPLICATA("Email già presente nel sistema"),
    DOCENTE_NULL("Null object");
    
    private String messaggio;
    
    private EsitoDocente(String messaggio){
        this.messaggio = messaggio;
    }
    
    public String getMessaggio(){
        return messaggio;
    }
}
