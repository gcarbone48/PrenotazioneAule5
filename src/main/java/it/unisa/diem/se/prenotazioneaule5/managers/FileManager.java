package it.unisa.diem.se.prenotazioneaule5.managers;

import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreAule;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestoreDocenti;
import it.unisa.diem.se.prenotazioneaule5.gestori.GestorePrenotazioni;
import it.unisa.diem.se.prenotazioneaule5.managers.eccezioni.LetturaException;
import it.unisa.diem.se.prenotazioneaule5.managers.eccezioni.ScritturaException;

/**
 * @brief Gestisce la persistenza dei dati del sistema.
 * Si occupa esclusivamente del caricamento e scaricamento su tre file distinti per docenti,
 * aule e prenotazioni.
 * 
 * @invariant pathAule != null
 * @invariant pathPrenotazioni != null
 * @invariant pathDocenti != null
 * @author giuse
 */
public class FileManager{
    /** rappresenta il percorso che porta al file di persistenza dati delle Aule*/
    private final String pathAule;
    /** rappresenta il percorso che porta al file di persistenza dati delle Prenotazioni*/
    private final String pathPrenotazioni;
    /** rappresenta il percorso che porta al file di persistenza dati dei Docenti*/    
    private final String pathDocenti;
    
    /**
     * @brief Costruisce un oggetto FileManager passando come parametro il percorso file path
     * 
     * @param path percorso file del sistema
     * 
     * @pre path != null
     * 
     * @post this.pathAule = path + "_aule.formato";
     * @post this.pathDocenti = path + "_docenti.formato";
     * @post this.pathPrenotazioni = path + "_prenotazioni.formato";
     */
    public FileManager(String path) {
        this.pathAule = path + "_aule.formato"; //Da verificare
        this.pathDocenti = path + "_docenti.formato"; //Da verificare
        this.pathPrenotazioni = path + "_prenotazioni.formato"; //Da verificare
    }
    
    /**
     * @brief Salva sul file pathAule la struttura dati del GestoreAule passato come
     * parametro.
     * 
     * @param ga Responsabile della struttura dati contenente le aule
     * 
     * @pre ga != null
     * 
     * @post il file adibito alla persistenza dati delle aule aggiorna il suo stato con
     * le nuove modifiche
     * 
     * @throws ScritturaException lanciata in caso di errore di scrittura
     */
    public void salvaAule(GestoreAule ga) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
    
    /**
     * @brief Salva sul file pathDocenti la struttura dati del GestoreDocenti passato come
     * parametro.
     * 
     * @param gd Responsabile della struttura dati contenente i docenti
     * 
     * @pre gd != null
     * 
     * @post il file adibito alla persistenza dati dei docenti aggiorna il suo stato con
     * le nuove modifiche
     * 
     * @throws ScritturaException lanciata in caso di errore di scrittura
     */    
    public void salvaDocenti(GestoreDocenti gd) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
       
    /**
     * @brief Salva sul file pathPrenotazioni la struttura dati del GestorePrenotazioni passato come
     * parametro.
     * 
     * @param gp Responsabile della struttura dati contenente le prenotazioni
     * 
     * @pre gp != null
     * 
     * @post il file adibito alla persistenza dati delle prenotazioni aggiorna il suo stato con
     * le nuove modifiche
     * 
     * @throws ScritturaException lanciata in caso di errore di scrittura
     */    
    public void salvaPrenotazioni(GestorePrenotazioni gp) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
    
    /**
     * @brief Salva contemporaneamente su tutti i file. 
     * 
     * @param ga Responsabile della struttura dati contenente le Aule
     * @param gd Responsabile della struttura dati contenente i Docenti
     * @param gp Responsabile della struttura dati contenente le Prenotazioni
     * 
     * @pre ga != null
     * @pre gd != null
     * @pre gp != null
     * 
     * @post i file adibiti alla persistenza dati dei tre gestori aggiornano il proprio stato con
     * le nuove modifiche
     * 
     * @throws ScritturaException lanciata in caso di errore di scrittura
     */
    public void salvaTutto(GestoreAule ga, GestoreDocenti gd, GestorePrenotazioni gp) throws ScritturaException {
        // DA IMPLEMENTARE
        return;
    }
    
    /**
     * @brief Caricamento da file della struttura dati contenente le Aule
     * 
     * @return Istanza di GestoreAule popolata dai dati letti dal file pathAule (oppure vuota)
     * 
     * @post Lo stato corrente di FileManager rimane invariato.
     * @throws LetturaException lanciata in caso di errore di lettura
     */
    public GestoreAule caricaAule() throws LetturaException {
        // DA IMPLEMENTARE
        return null;
    }

    /**
     * @brief Caricamento da file della struttura dati contenente i Docenti
     * 
     * @return Istanza di GestoreDocenti popolata dai dati letti dal file pathDocenti (oppure vuota)
     * 
     * @post Lo stato corrente di FileManager rimane invariato.
     * @throws LetturaException lanciata in caso di errore di lettura
     */    
    public GestoreDocenti caricaDocenti() throws LetturaException {
        // DA IMPLEMENTARE
        return null;
    }
    
    /**
     * @brief Caricamento da file della struttura dati contenente le Prenotazioni
     * 
     * @return Istanza di GestorePrenotazioni popolata dai dati letti dal file pathPrenotazioni (oppure vuota)
     * 
     * @post Lo stato corrente di FileManager rimane invariato.
     * @throws LetturaException lanciata in caso di errore di lettura
     */
    public GestorePrenotazioni caricaPrenotazioni() throws LetturaException {
        // DA IMPLEMENTARE
        return null;
    }
    
    
}
