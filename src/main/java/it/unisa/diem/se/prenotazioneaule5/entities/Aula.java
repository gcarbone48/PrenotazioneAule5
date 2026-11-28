package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;

/**
 *  @brief Rappresenta un'aula universitaria gestita dal sistema
 * 
 *  Un'aula è costituita da un codice identificativo univoco, un nome, l'edificio a cui appartiene,
 *  il piano in cui è collocata e la sua capienza massima
 * 
 *  @invariant id != null
 *  @invariant nome != null
 *  @invariant edificio != null
 *  @invariant piano != null
 *  @invariant capienza > 0
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
     * 
     * @pre id != null
     * @pre nome != null
     * @pre edificio != null
     * @pre piano != null
     * @pre capienza > 0
     * 
     * @post this.id = id
     * @post this.nome = nome
     * @post this.edificio = edificio
     * @post this.piano = piano
     * @post this.capienza = capienza
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
     * 
     * @post lo stato corrente rimane invariato
     */
    public String getId() {
        return id;
    }

    /**
     * @brief cosente di ottenere l'edificio a cui appartiene l'aula su cui è chiamato
     *        il metodo
     * 
     * @return edificio a cui appartiene
     * 
     * @post lo stato corrente rimane invariato
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * @brief consente di ottenere il piano in cui è collocata l'aula su cui è chiamato
     *        il metodo
     * 
     * @return piano in cui è collocata
     * 
     * @post lo stato corrente rimane invariato
     */
    public String getPiano() {
        return piano;
    }
    
    /**
     * @brief consente di ottenere il nome dell'aula su cui è chiamato il metodo
     * 
     * @return nome dell'aula
     * 
     * @post lo stato corrente rimane invariato
     */
    public String getNome(){
        return nome;
    }

    /**
     * @brief consente di ottenere la capienza massima dell'aula su cui è chiamato il metodo
     * 
     * @return capienza massima
     * 
     * @post lo stato corrente rimane invariato
     */
    public int getCapienza() {
        return capienza;
    }

    /**
     * @brief cosente di settare il codice identificativo univoco dell'aula
     * 
     * @param id nuovo codice identificativo univoco
     * 
     * @pre id != null
     * 
     * @post this.id = id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @brief consente di settare il nome dell'aula
     * 
     * @param nome nuovo nome dell'aula
     * 
     * @pre nome != null
     * 
     * @post this.nome = nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @brief consente di settare il nuovo edificio a cui appartiene l'aula
     * 
     * @param edificio nuovo edificio
     * 
     * @pre edificio != null
     * 
     * @post this.edificio = edificio
     */
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    /**
     * @brief consente di settare il nuovo piano in cui è collocata l'aula
     * 
     * @param piano nuovo piano
     * 
     * @pre piano != null
     * 
     * @post this.piano = piano
     */
    public void setPiano(String piano) {
        this.piano = piano;
    }

    /**
     * @brief consente di settare una nuova capienza massima dell'aula
     * 
     * @param capienza nuova capienza
     * 
     * @pre capienza > 0
     * 
     * @post this.capienza = capienza
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
     * 
     * @post lo stato corrente rimane invariato
     */
    @Override
    public boolean equals(Object o){
        return false;
    }
    
    /**
     * @brief Calcola il codice hash dell'aula basato sul suo identificativo univoco.
     *
     * @return Valore hash dell'aula.
     * 
     * @post lo stato corrente rimane invariato
     */
    @Override
    public int hashCode(){
        return 0;
    }
    
    /**
     * @brief Restituisce una rappresentazione testuale dell'aula.
     *
     * @return Stringa contenente codice, nome, edificio, piano e capienza dell'aula.
     * 
     * @post lo stato corrente rimane invariato
     */
    @Override
    public String toString(){
        return "";
    }
}
