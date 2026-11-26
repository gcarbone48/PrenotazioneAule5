/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Prenotazione implements Serializable, Comparable<Prenotazione>{
    private final Aula aula;
    private final Docente docente;
    private final TipoAttivita attivita;
    private final LocalDate dataInizio;
    private final LocalDate dataFine;
    private final LocalTime oraInizio;
    private final LocalTime oraFine;
    private final boolean ricorrente;
    private final String idSerie;

    public Prenotazione(Aula aula, Docente docente, TipoAttivita attivita, LocalDate dataInizio, LocalDate dataFine, LocalTime oraInizio, LocalTime oraFine, boolean ricorrente) {
        this.aula = aula;
        this.docente = docente;
        this.attivita = attivita;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.ricorrente = ricorrente;
        this.idSerie = "";
    }

    public Prenotazione(Aula aula, Docente docente, TipoAttivita attivita, LocalDate dataInizio, LocalDate dataFine, LocalTime oraInizio, LocalTime oraFine, boolean ricorrente, String idSerie) {
        this.aula = aula;
        this.docente = docente;
        this.attivita = attivita;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.ricorrente = ricorrente;
        this.idSerie = idSerie;
    }

    public Aula getAula() {
        return aula;
    }

    public Docente getDocente() {
        return docente;
    }

    public TipoAttivita getAttivita() {
        return attivita;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public LocalTime getOraInizio() {
        return oraInizio;
    }

    public LocalTime getOraFine() {
        return oraFine;
    }

    public boolean isRicorrente() {
        return ricorrente;
    }

    public String getIdSerie() {
        return idSerie;
    }


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
    
    
    @Override
    public int compareTo(Prenotazione o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Prenotazione{" + "aula=" + aula + ", docente=" + docente + ", attivita=" + attivita + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ", ricorrente=" + ricorrente + ", idSerie=" + idSerie + '}';
    }
    
    
}
