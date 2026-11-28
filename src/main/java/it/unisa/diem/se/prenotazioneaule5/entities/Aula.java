package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;

/**
 *  @brief Rappresenta un'aula universitaria gestita dal sistema
 * 
 *  Un'aula è costituita da un codice identificativo univoco, un nome, l'edificio a cui appartiene,
 *  il piano in cui è collocata e la sua capienza massima
 */
public class Aula implements Serializable {
    /** codice identificativo univoco (es: AA0000) */
    private String id;
    /** nome dell'aula (es. Aula Magna) */
    private String nome;
    /** edificio in cui si trova l'aula (es. E2) */
    private String edificio;
    /** piano in cui è collocata l'aula (es. 2) */
    private String piano;
    /** capienza massima dell'aula (es. 100) */
    private int capienza;

    /**
     * @brief Costruisce un oggetto Aula inizializzando tutti i parametri
     * 
     * @param id codice identificativo univoco
     * @param nome nome dell'aula
     * @param edificio edificio a cui appartiene
     * @param piano piano in cui è collocata
     * @param capienza capienza massima
     */
    public Aula(String id, String nome, String edificio, String piano, int capienza) {
        this.id = id;
        this.nome = nome;
        this.edificio = edificio;
        this.piano = piano;
        this.capienza = capienza;
    }

    /**
     * @brief Consente di ottenere il codice identificativo univoco dell'aula su cui
     *        è chiamato il metodo
     * 
     * @return codice identificativo univoco
     */
    public String getId() {
        return id;
    }

    /**
     * @brief cosente di ottenere l'edificio a cui appartiene l'aula su cui è chiamato
     *        il metodo
     * 
     * @return edificio a cui appartiene
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * @brief consente di ottenere il piano in cui è collocata l'aula su cui è chiamato
     *        il metodo
     * 
     * @return piano in cui è collocata
     */
    public String getPiano() {
        return piano;
    }
    
    /**
     * @brief consente di ottenere il nome dell'aula su cui è chiamato il metodo
     * 
     * @return nome dell'aula
     */
    public String getNome(){
        return nome;
    }

    /**
     * @brief consente di ottenere la capienza massima dell'aula su cui è chiamato il metodo
     * 
     * @return capienza massima
     */
    public int getCapienza() {
        return capienza;
    }

    /**
     * @brief cosente di settare il codice identificativo univoco dell'aula
     * 
     * @param id nuovo codice identificativo univoco
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @brief consente di settare il nome dell'aula
     * 
     * @param nome nuovo nome dell'aula
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @brief consente di settare il nuovo edificio a cui appartiene l'aula
     * 
     * @param edificio nuovo edificio
     */
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    /**
     * @brief consente di settare il nuovo piano in cui è collocata l'aula
     * 
     * @param piano nuovo piano
     */
    public void setPiano(String piano) {
        this.piano = piano;
    }

    /**
     * @brief consente di settare una nuova capienza massima dell'aula
     * 
     * @param capienza nuova capienza
     */
    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }
    
    /**
     * @brief Confronta se l'aula su cui è chiamato il metodo e l'oggetto passato come parametro sono uguali.
     *        Vengono considerati uguali se hanno lo stesso codice identificativo univoco. 
     *  
     * @param o oggetto da confrontare con l'aula corrente
     * 
     * @return true se i due oggetti sono considerati uguali
     *         false se i due oggetti sono considerati diversi
     */
    @Override
    public boolean equals(Object o){
        return false;
    }
    
    /**
     * @brief Calcola il codice hash dell'aula basato sul suo identificativo univoco.
     *
     * @return Valore hash dell'aula.
     */
    @Override
    public int hashCode(){
        return 0;
    }
    
    /**
     * @brief Restituisce una rappresentazione testuale dell'aula.
     *
     * @return Stringa contenente codice, nome, edificio, piano e capienza dell'aula.
     */
    @Override
    public String toString(){
        return "";
    }
}
