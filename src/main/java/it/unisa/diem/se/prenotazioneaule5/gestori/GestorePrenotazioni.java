/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.gestori;

import it.unisa.diem.se.prenotazioneaule5.entities.Aula;
import it.unisa.diem.se.prenotazioneaule5.entities.Docente;
import it.unisa.diem.se.prenotazioneaule5.entities.Prenotazione;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class GestorePrenotazioni implements Serializable{
    Map<LocalDate, TreeSet<Prenotazione>>  prenotazioni;
    
    public GestorePrenotazioni(){
        prenotazioni = new TreeMap<>();
    }
    
    public EsitoPrenotazione aggiungiPrenotazione(Prenotazione p){
        return EsitoPrenotazione.PRENOTAZIONE_OK;
    }
    
    public EsitoPrenotazione rimuoviPrenotazione(Prenotazione p, boolean eliminaRicorrenza){
        return EsitoPrenotazione.PRENOTAZIONE_OK;
    }
    
    public EsitoPrenotazione rimuoviPrenotazioniAula(Aula a){
        return EsitoPrenotazione.PRENOTAZIONE_OK;
    }
    
    public EsitoPrenotazione rimuoviPrenotazioniDocente(Docente d){
        return EsitoPrenotazione.PRENOTAZIONE_OK;
    }
    
    public EsitoPrenotazione rimuoviPrenotazioniScadute(){
        return EsitoPrenotazione.PRENOTAZIONE_OK;
    }
    
    public boolean isAulaDisponibile(Aula a, LocalDate data, LocalTime inizio,
                LocalTime fine){
        return false;
    }
    
    public List<Prenotazione> visualizzaPrenotazioniDefault(){
        return null;
    }
    
    public List<Prenotazione> filtraPrenotazioni(Aula a, Docente d){
        return null;
    }
}
