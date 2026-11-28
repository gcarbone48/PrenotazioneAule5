package it.unisa.diem.se.prenotazioneaule5.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * @class Docente
 * @brief Rappresenta un docente gestito dal sistema.
 * Un docente possiede una email, che si configura come identificatore univoco,
 * un nome e un cognome.
 * 
 * @invariant @c email != null && email.matches ("^[^\\s\@]+\@unisa\\.it$")
 * @invariant @c nome != null && !nome.trim().isEmpty()
 * @invariant @c cognome != null && !cognome.trim().isEmpty()
 * 
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
     * @pre @p email != null e conforme al formato istituzionale (@c \@unisa.it)
     * @pre @p nome != null e stringa non vuota
     * @pre @p cognome != null e stringa non vuota
     * 
     * @post Viene istanziato un nuovo oggetto Docente con i dati forniti.
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
     * @post Lo stato dell'oggetto rimane invariato
     * 
     * @return email del docente
     */
    public String getEmail() {
        return email;
    }

    /**
     * @brief Imposta l'email associata al docente
     * 
     * @pre @p email != null, non vuota e valida secondo il formato istituzionale
     * @post L'attributo @c email del docente viene aggiornato con il nuovo valore
     * 
     * 
     * @param email nuova email da associare al docente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @brief Restituisce il nome del docente
     * 
     * @post Lo stato dell'oggetto rimane invariato
     * 
     * @return stringa contenente il nome del docente
     *
     */
    public String getNome() {
        return nome;
    }

    /**
     * @brief Imposta o modifica il nome del docente
     * 
     * @pre @p nome != null e stringa non vuota
     * @post L'attributo @c nome del docente viene aggiornato
     * 
     * @param nome nuovo nome del docente
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @brief Restituisce il cognome del docente
     * 
     * @post Lo stato dell'oggetto rimane invariato
     * 
     * @return stringa contenente il cognome del docente
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @brief Imposta o modifica il cognome del docente.
     * 
     * @pre @p cognome != null e stringa non vuota.
     * @post L'attributo @c cognome del docente viene aggiornato.
     * 
     * @param cognome nuovo cognome del docente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * @brief Calcola il codice hash del docente basato sul suo identificativo univoco (email)
     * 
     * @post Lo stato dell'oggetto rimane invariato
     *
     * @return valore intero rappresentante l'hash code del docente
     */
    @Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * @brief Confronta il docente con l'oggetto passato come parametro per verificarne l'uguaglianza
     * Vengono considerati uguali se sono entrambi istanze di @c Docente e possiedono la stessa email (case-insensitive)
     * 
     * @pre Nessuna (gestisce internamente i controlli di tipo e nullità)
     * @post Lo stato dell'oggetto rimane invariato
     * 
     * @param o oggetto da confrontare
     * @return @c true se i due oggetti rappresentano lo stesso docente, @c false altrimenti
     */
    @Override
    public boolean equals(Object o) {
        return false;
    }

    /**
     * @brief Confronta due docenti per determinarne l'ordinamento alfabetico
     * L'ordinamento è lessicografico prima per cognome, poi per nome, 
     * e infine utilizzando l'email come criterio di spareggio
     * 
     * @pre @p altro != null
     * @post Lo stato dell'oggetto rimane invariato
     * 
     * @param altro docente con cui effettuare il confronto
     * @return un intero negativo se @c this precede @c altro, 
     *         0 se i due docenti sono equivalenti per l'ordinamento,
     *         un intero positivo se @c this segue @c altro
     */
    @Override
    public int compareTo(Docente altro) {
        return 0;
    }

    /**
     * @brief Restituisce una rappresentazione testuale formattata del docente
     * 
     * @post Lo stato dell'oggetto rimane invariato
     *
     * @return stringa contenente email, nome e cognome del docente
     */
    @Override
    public String toString() {
        return "Docente{" + "email=" + email + ", nome=" + nome + ", cognome=" + cognome + '}';
    }
    
    
}
