package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * @brief Rappresenta un docente gestito dal sistema.
 * Un docente possiede una email, che si configura come identificatore univoco,
 * un nome e un cognome.
 * 
 */
public class Docente implements Serializable, Comparable<Docente> {
    /** email associata al docente, univoca (es. mrossi@unisa.it) */
    private String email;
    /** nome del docente (es. Mario) */
    private String nome;
    /** cognome del docente (es. Rossi) */
    private String cognome;
    
    /**
     * @brief Crea un oggetto docente inizializzando gli attributi
     * 
     * @param email email associata al docente, univoca
     * @param nome nome del docente
     * @param cognome cognome del docente
     */
    public Docente(String email, String nome, String cognome) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
    }
    
    /**
     * @brief Restituisce la email associata al docente
     * 
     * @return email del docente
     */
    public String getEmail() {
        return email;
    }

    /**
     * @brief Imposta l'email associata al docente
     * 
     * @param email nuova email da associare al docente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @brief Restituisce il nome del docente
     * 
     * @return nome del docente
     */
    public String getNome() {
        return nome;
    }

    /**
     * @brief Imposta il nome del docente
     * 
     * @param nome nuovo nome del docente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @brief Restituisce il cognome del docente
     * 
     * @return cognome del docente
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @brief Imposta il cognome del docente
     * 
     * @param cognome nuovo cognome del docente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * @brief Calcola il codice hash del docente basato sul suo identificativo univoco (email).
     *
     * @return Valore hash del docente.
     */
    @Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * @brief Confronta il docente con l'oggetto passato come parametro e verifica se i due oggetti
     * sono uguali. Vengono considerati uguali se sono entrambi docenti e hanno la stessa email.
     * 
     * @param o oggetto da confrontare
     * 
     * @return true se i due oggetti sono uguali
     *         false se i due oggetti non sono uguali
     */
    @Override
    public boolean equals(Object o) {
        return false;
    }

    /**
     * @brief Confronta due docenti e verifica l'ordinamento tra essi. L'ordinamento è lessicografico (cognome nome,
     * con email come criterio di spareggio).
     * 
     * @param altro docente con cui effettuare il confronto
     * 
     * @return n intero minore di zero se this precede altro
     *         0 se this == altro (ai fini dell'ordinamento)
     *         n intero maggiore di zero se this segue altro
     */
    @Override
    public int compareTo(Docente altro) {
        return 0;
    }

    /**
     * @brief Restituisce una rappresentazione testuale del docente.
     *
     * @return Stringa contenente email, nome e cognome.
     */
    @Override
    public String toString() {
        return "Docente{" + "email=" + email + ", nome=" + nome + ", cognome=" + cognome + '}';
    }
    
    
}
