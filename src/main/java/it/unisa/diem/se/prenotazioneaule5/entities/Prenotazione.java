/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

/**
 * @brief Rappresenta una prenotazione di un'aula universitaria gestita dal sistema.
 * 
 * Una prenotazione collega un'aula e un docente responsabile per una specifica attività,
 * definendo un intervallo temporale (data e fascia oraria) e supportando la gestione
 * delle ricorrenze settimanali tramite un identificativo di serie.
 * Invarianti di classe:
 * @invariant aula != null && docente != null && attivita != null
 * @invariant dataInizio != null && dataFine != null && !dataFine.isBefore(dataInizio)
 * @invariant oraInizio != null && oraFine != null && oraFine.isAfter(oraInizio)
 * @invariant idSerie != null && !idSerie.isEmpty()
 * @invariant !ricorrente implica dataFine.equals(dataInizio)
 */


public class Prenotazione implements Serializable, Comparable<Prenotazione>{
    /** aula oggetto della prenotazione */
    private final Aula aula;
    /** docente responsabile dell'attività prenotata */
    private final Docente docente;
    /** tipologia dell'attività (es. LEZIONE, SEMINARIO, ESAME, LAUREA, ALTRO) */
    private final TipoAttivita attivita;
    /** nome o denominazione specifica dell'attività */
    private final String nomeAttivita;
   /** data di inizio della prenotazione (o della serie ricorrente) */
    private final LocalDate dataInizio;
    /** data di termine della ricorrenza, se prenotazione non ricorrente dataFine = dataInizio */
    private final LocalDate dataFine;
   /** orario di inizio della prenotazione */
    private final LocalTime oraInizio;
   /** orario di fine della prenotazione */
    private final LocalTime oraFine;
   /** flag booleano che indica se la prenotazione fa parte di una serie ricorrente */
    private final boolean ricorrente;
    /** id univoco della serie per raggruppare le occorrenze di una prenotazione ricorrente */
    private final String idSerie;

    
    /**
     * @brief Costruttore per una prenotazione singola o per la prima occorrenza
     * di una serie ricorrente.
     *
     * Genera un nuovo identificativo di serie tramite {@code UUID.randomUUID()}
     * (stringa casuale a 122 bit, non deterministica per evitare duplicati).
     * Se ricorrente == true imposta dataFine al valore passato, altrimenti la 
     * imposta uguale a dataInizio.
     *
     * @pre aula != null && docente != null && attivita != null
     * @pre nomeAttivita != null && !nomeAttivita.isBlank()
     * @pre dataInizio != null && oraInizio != null && oraFine != null
     * @pre oraFine.isAfter(oraInizio)
     * @pre !ricorrente || (dataFine != null && !dataFine.isBefore(dataInizio))
     *
     * @post isRicorrente() == ricorrente
     * @post !isRicorrente() implica getDataFine().equals(getDataInizio())
     * @post isRicorrente() implica getDataFine().equals(dataFine)
     * @post getIdSerie() != null && !getIdSerie().isEmpty()
     *
     * @param aula aula da prenotare
     * @param docente docente responsabile dell'attività
     * @param attivita tipologia dell'attività
     * @param nomeAttivita denominazione specifica dell'attività
     * @param dataInizio data di inizio della prenotazione o della serie
     * @param dataFine data di termine della serie (usata se {@code ricorrente} è {@code true})
     * @param oraInizio orario di inizio dell'occupazione
     * @param oraFine orario di fine dell'occupazione
     * @param ricorrente indica se la prenotazione fa parte di una serie ricorrente
     */
    
    public Prenotazione(Aula aula, Docente docente, TipoAttivita attivita,  String nomeAttivita, LocalDate dataInizio, LocalDate dataFine, LocalTime oraInizio, LocalTime oraFine, boolean ricorrente) {
        this.aula = aula;
        this.docente = docente;
        this.attivita = attivita;
        this.nomeAttivita = nomeAttivita;
        this.dataInizio = dataInizio;
        if (ricorrente)
            this.dataFine = dataFine;
        else
            this.dataFine = dataInizio;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.ricorrente = ricorrente;
        this.idSerie = UUID.randomUUID().toString();
    }
    
    /**
     * @brief Costruttore per un'occorrenza di una serie ricorrente con
     * identificativo di serie già esistente.
     *
     * Imposta automaticamente ricorrente a true e associa l'identificativo 
     * idSerie condiviso con la serie.
     *
     * @pre aula != null && docente != null && attivita != null
     * @pre nomeAttivita != null && !nomeAttivita.isBlank()
     * @pre dataInizio != null && dataFine != null && !dataFine.isBefore(dataInizio)
     * @pre oraInizio != null && oraFine != null && oraFine.isAfter(oraInizio)
     * @pre idSerie != null && !idSerie.isEmpty()
     *
     * @post isRicorrente() == true
     * @post getDataFine().equals(dataFine)
     * @post getIdSerie().equals(idSerie)
     *
     * @param aula aula da prenotare
     * @param docente docente responsabile dell'attività
     * @param attivita tipologia dell'attività
     * @param nomeAttivita denominazione specifica dell'attività
     * @param dataInizio data di inizio della prenotazione
     * @param dataFine data di termine della serie ricorrente
     * @param oraInizio orario di inizio delle singole occorrenze
     * @param oraFine orario di fine delle singole occorrenze
     * @param idSerie identificativo univoco (es. UUID) condiviso dalla serie
     */
    

    public Prenotazione(Aula aula, Docente docente, TipoAttivita attivita, String nomeAttivita, LocalDate dataInizio, LocalDate dataFine, LocalTime oraInizio, LocalTime oraFine, String idSerie) {
        this.aula = aula;
        this.docente = docente;
        this.attivita = attivita;
        this.nomeAttivita = nomeAttivita;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.ricorrente = true;
        this.idSerie = idSerie;
    }

    /**
     * @brief Restituisce l'aula associata alla prenotazione.
     * 
     * @return oggetto Aula prenotato
     */
    
    public Aula getAula() {
        return aula;
    }
    
    /**
     * @brief Restituisce il docente responsabile della prenotazione.
     * 
     * @return oggetto Docente responsabile
     */

    public Docente getDocente() {
        return docente;
    }
    
    /**
     * @brief Restituisce la tipologia dell'attività.
     * 
     * @return elemento dell'enumerazione TipoAttivita
     */

    public TipoAttivita getAttivita() {
        return attivita;
    }
    
    /**
     * @brief Restituisce la data di inizio della prenotazione.
     * 
     * @return LocalDate di inizio
     */

    public LocalDate getDataInizio() {
        return dataInizio;
    }
    
    /**
     * @brief Restituisce la data di fine della prenotazione.
     * 
     * @return LocalDate di fine
     */

    public LocalDate getDataFine() {
        return dataFine;
    }
    
    /**
     * @brief Restituisce l'orario di inizio della prenotazione.
     * 
     * @return LocalTime di inizio
     */

    public LocalTime getOraInizio() {
        return oraInizio;
    }
    
    /**
     * @brief Restituisce l'orario di fine della prenotazione.
     * 
     * @return LocalTime di fine
     */

    public LocalTime getOraFine() {
        return oraFine;
    }
    
    /**
     * @brief Indica se la prenotazione fa parte di una serie ricorrente.
     * 
     * @return true se la prenotazione è ricorrente, false altrimenti
     */

    public boolean isRicorrente() {
        return ricorrente;
    }
    
    /**
     * @brief Restituisce l'identificativo univoco della serie di appartenenza.
     * 
     * @return stringa idSerie 
     */

    public String getIdSerie() {
        return idSerie;
    }
    
    /**
     * @brief Restituisce il nome descrittivo dell'attività.
     * 
     * @return stringa contenente il nome dell'attività
     */

    public String getNomeAttivita() {
        return nomeAttivita;
    }
    
/**
     * @brief il metodo effettua un controllo su data di inizio e ora di fine,
     * comparandole con la data e ora di esecuzione del metodo. Se la prenotazione
     * risulta scaduta, cioè se è terminata nel momento in cui si esegue il
     * metodo (come definito nel SRS), il metodo restituisce true. 
     * Il confronto avviene con dataInizio e oraFine perchè sia per prenotazione
     * singola che per prenotazione ricorrente, dataInizio indica anche la data
     * di fine della singola occorrenza
     * @pre Nessuna
     * 
     * @post Restituisce true se (dataInizio, oraFine) è precedente al timestamp
     * corrente, false altrimenti. Stato dell'oggetto invariato
     * 
     * @return booleano che attesta se la prenotazione è scaduta
     */
    public boolean isScaduta(){
        return false;
    }

    /**
     * @brief Calcola il codice hash della prenotazione su dataInizio, oraInizio
     * e idSerie
     * In questo modo due prenotazioni sono diverse se:
     * 1) hanno id diverso
     * 2) hanno id uguale ma cadono in giorni diversi (serie)
     * @return Valore hash della prenotazione.
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * @brief Verifica se due prenotazioni sono uguali sulla base di
     * dataInizio, oraInizio e idSerie
     * In questo modo due prenotazioni sono diverse se:
     * 1) hanno id diverso
     * 2) hanno id uguale ma cadono in giorni diversi (serie)
     * @param obj oggetto da confrontare
     * @return true se sono uguali, false se diverse
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    
    /**
     * @brief relazione d'ordine tra due prenotazioni, basata su dataInizio,
     * oraInizio e idSerie
     * @param o prenotazione da comparare
     * 
     * @pre o != null
     * @post   n minore di 0 se this precede o
     *         n maggiore di 0 se this segue o
     *         n = 0 se this e o sono uguali
     * 
     * @return intero n che esprime la relazione d'ordine
     */
    @Override
    public int compareTo(Prenotazione o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @brief Restituisce una rappresentazione testuale dettagliata della prenotazione.
     * 
     * @return stringa contenente i valori di tutti gli attributi della prenotazione
     */

    @Override
    public String toString() {
        return "Prenotazione{" + "aula=" + aula + ", docente=" + docente + ", attivita=" + attivita + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ", ricorrente=" + ricorrente + ", idSerie=" + idSerie + '}';
    }
    
    
}
