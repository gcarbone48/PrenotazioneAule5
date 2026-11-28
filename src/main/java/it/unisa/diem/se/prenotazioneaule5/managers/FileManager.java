/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.managers;

import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreAule;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreDocenti;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestorePrenotazioni;
import it.unisa.diem.se.prenotazioneaule5.managers.eccezioni.LetturaException;
import it.unisa.diem.se.prenotazioneaule5.managers.eccezioni.ScritturaException;
import java.io.Serializable;

/**
 *
 * @author Giovanni
 */
public class FileManager implements Serializable {
    private final String pathAule;
    private final String pathPrenotazioni;
    private final String pathDocenti;
    
    

    public FileManager(String path) {
        this.pathAule = path + "_aule.formato"; //Da verificare
        this.pathDocenti = path + "_docenti.formato"; //Da verificare
        this.pathPrenotazioni = path + "_prenotazioni.formato"; //Da verificare
    }
    

    public void salvaAule(GestoreAule ga) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
    

    public void salvaDocenti(GestoreDocenti gd) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
       

    public void salvaPrenotazioni(GestorePrenotazioni gp) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
    

    public void salvaTutto(GestoreAule ga, GestoreDocenti gd, GestorePrenotazioni gp) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }

    public GestoreAule caricaAule() throws LetturaException {
        // DA IMPLEMENTARE
        return null;
    }

    public GestoreDocenti caricaDocenti() throws LetturaException {
        // DA IMPLEMENTARE
        return null;
    }

    public GestorePrenotazioni caricaPrenotazioni() throws LetturaException {
        // DA IMPLEMENTARE
        return null;
    }
    
    
}
