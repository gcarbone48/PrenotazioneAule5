/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.managers;

import it.unisa.diem.se.prenotazioneaule5.entities.Aula;
import it.unisa.diem.se.prenotazioneaule5.entities.Docente;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreAule;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreDocenti;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestorePrenotazioni;
import java.io.Serializable;

/**
 *
 * @author Giovanni
 */
public class TaskManager implements Serializable{
    private final GestoreAule gestoreAule;
    private final GestoreDocenti gestoreDocenti;
    private final GestorePrenotazioni gestorePrenotazioni;
    private final FileManager fileManager;

    public TaskManager(String path) {
        this.gestoreAule = new GestoreAule();
        this.gestoreDocenti = new GestoreDocenti();
        this.gestorePrenotazioni = new GestorePrenotazioni();
        this.fileManager = null; //DA RISCRIVERE QUANDO SI IMPLEMENTA FILEMANAGER
    }
    
    
    public GestoreAule getGestoreAule(){
        return this.gestoreAule;
    }

    public GestoreDocenti getGestoreDocenti() {
        return gestoreDocenti;
    }

    public GestorePrenotazioni getGestorePrenotazioni() {
        return gestorePrenotazioni;
    }

    
    public EsitoTaskManager carica() {
        return EsitoTaskManager.SUCCESS;
    }
    
    public EsitoTaskManager salva() {
        return EsitoTaskManager.SUCCESS;
    }
    
    public EsitoTaskManager hardCancelDocente (Docente d){
        return EsitoTaskManager.SUCCESS;
    }
    
    public EsitoTaskManager hardCancelAula (Aula a){
        return EsitoTaskManager.SUCCESS;
    }
    
    
    
    
    
}
