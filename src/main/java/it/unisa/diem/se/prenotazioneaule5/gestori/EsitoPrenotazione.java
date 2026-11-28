/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.gestori;


public enum EsitoPrenotazione {
    PRENOTAZIONE_OK("Operazione Riuscita"),
    AULA_OCCUPATA("Aula occupata nella fascia oraria richiesta"),
    DOCENTE_OCCUPATO("Docente occupato nella fascia oraria richiesta"),
    PRENOTAZIONE_INESISTENTE("La prenotazione richiesta non è presente nel sistema");
    
    private String messaggio;
    
    private EsitoPrenotazione(String messaggio){
        this.messaggio = messaggio;
    }
    
    public String getMessaggio(){
        return messaggio;
    }
}