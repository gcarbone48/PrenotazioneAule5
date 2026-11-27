/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.managers;


public enum EsitoPrenotazione {
    PRENOTAZIONE_OK("Operazione Riuscita"),
    PRENOTAZIONE_INVALIDA("Prenotazione non valida"),
    PRENOTAZIONE_DATA_NON_VALIDA("Data inserita non valida"),
    PRENOTAZIONE_ORA_NON_VALIDA("Ora inserita non valida"),
    AULA_INESISTENTE("L'aula inserita non è presenti nel sistema"),
    DOCENTE_INESISTENTE("Il docente inserito non è presente nel sistema"),
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
