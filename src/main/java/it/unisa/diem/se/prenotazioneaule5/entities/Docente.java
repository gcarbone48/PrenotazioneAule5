/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.se.prenotazioneaule5.entities;

import it.unisa.diem.se.prenotazioneaule5.exceptions.DatiNonValidiException;
import java.io.Serializable;


public class Docente implements Serializable, Comparable<Docente> {
    private String email;
    private String nome;
    private String cognome;
    
    public Docente(String email, String nome, String cognome) throws DatiNonValidiException /*da gestitre nel controller*/ {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
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
    public int compareTo(Docente o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Docente{" + "email=" + email + ", nome=" + nome + ", cognome=" + cognome + '}';
    }
    
    
}
