/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.managers;

import it.unisa.diem.se.prenotazioneaule5.entities.Aula;
import it.unisa.diem.se.prenotazioneaule5.entities.Docente;
import it.unisa.diem.se.prenotazioneaule5.entities.Prenotazione;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreAule;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreDocenti;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestorePrenotazioni;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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

    
    public EsitoTm carica() {
        return EsitoTm.SUCCESS;
    }
    
    public EsitoTm salva() {
        return EsitoTm.SUCCESS;
    }
    
    public EsitoTm hardCancelDocente (Docente d){
        return EsitoTm.SUCCESS;
    }
    
    public EsitoTm hardCancelAula (Aula a){
        return EsitoTm.SUCCESS;
    }
    
    public EsitoTm aggiungiAulaTm (Aula a){
        return EsitoTm.SUCCESS;
    }
    
   public EsitoTm modificaAulaTm(String vecchioId, Aula a) {
        return EsitoTm.SUCCESS;
    } 
   
    public List<Aula> cercaAuleDisponibili(LocalDate data, LocalTime inizio, LocalTime fine) {
        return null;
    }
    
    public List<Aula> getListaAule() {
        return null;
    }
    
    public List<Aula> filtraAule(String nome, String codice, String capienza) {
        return null;
    }
    
    public EsitoTm aggiungiDocenteTm(Docente d) {
        return EsitoTm.SUCCESS;
    }
    
    public EsitoTm modificaDocenteTm(Docente d, Docente dNuovo) {
        return EsitoTm.SUCCESS;
    }
    
    public List<Docente> getListaDocenti() {
        return null;
    }
    
    public List<Docente> cercaDocenti(String query) {
        return null;
    }
    
    public EsitoTm aggiungiPrenotazioneTm(Prenotazione p) {
        return EsitoTm.SUCCESS;
    }
    
    public EsitoTm rimuoviPrenotazione(Prenotazione p, boolean eliminaRicorrenza) {
        return EsitoTm.SUCCESS;
    }
    
    public List<Prenotazione> getListaPrenotazioniAttive(){
        return null;
    }
    
    public List<Prenotazione> filtraPrenotazioni(Aula a, Docente d) {
        return null;
    }
    
    
    
    
    
}
