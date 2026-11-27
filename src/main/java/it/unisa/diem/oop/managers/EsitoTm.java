/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.managers;

/**
 *
 * @author marco
 */
public enum EsitoTm {
    
    
    SUCCESS("Operazione completata con successo."),
    
    ERRORE_IO("Errore di I/O durante l'accesso al file."),
    ERRORE_SALVATAGGIO("Errore durante il salvataggio dei dati."),
    ERRORE_CARICAMENTO("Errore durante il caricamento dei dati."),
    
    DATI_NON_VALIDI("I dati forniti non sono validi.");
    
    private final String messaggio;

   
    private EsitoTm(String messaggio) {
        this.messaggio = messaggio;
    }

    
    public String getMessaggio() {
        return messaggio;
    }
}

